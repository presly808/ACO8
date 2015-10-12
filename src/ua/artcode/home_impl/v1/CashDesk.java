package ua.artcode.home_impl.v1;

import java.util.ArrayList;
import java.util.*;
import java.util.GregorianCalendar;

public class CashDesk {
    private int numberOfTickets;
    Train[] trains;
    ArrayList<Ticket> tickets = new ArrayList<>();

    public CashDesk(Train[] trains) {
        initCashDeskData(trains);
        //System.out.println("CashDesk has been created "+now.get(Calendar.DAY_OF_MONTH)+"."+now.get(Calendar.MONTH));
    }

    private void initCashDeskData(Train[] trains) {
        numberOfTickets = 0;
        this.trains = trains;

        GregorianCalendar now = new GregorianCalendar();
        now.add(Calendar.DAY_OF_MONTH,-1);//

        for (int day = 0; day < 45; day++) {
            now.add(Calendar.DAY_OF_MONTH, 1);
            int currentMonth = now.get(Calendar.MONTH);
            int currentDay = now.get(Calendar.DAY_OF_MONTH);
            Date currentDate = new Date(currentMonth,currentDay);
            initTrains(trains, currentDate);

            //System.out.println(day+". Tickets have been added to CashDesk "+tickets.size());
        }
    }

    private void initTrains(Train[] trains, Date currentDate) {
        for (Train tr : trains){
            initWagons(currentDate, tr);
        }
    }

    private void initWagons(Date currentDate, Train tr) {
        for (int i = 0; i < tr.wagons.length; i++){
            initTikets(currentDate, tr, i);
        }
    }

    private void initTikets(Date currentDate, Train tr, int i) {
        for (int j = 0; j < tr.wagons[i].places.size(); j++) {
            Time currentTime = new Time(tr.getDepartureTime().hours, tr.getDepartureTime().minutes);
            Ticket temp = new Ticket(numberOfTickets, tr.getDepartureCity(), tr.getDestinationCity(), currentTime, tr.getTrainNumber(), i + 1, j + 1,
                    tr.wagons[i].getWagonType(), tr.wagons[i].places.get(j).getPlacePrice());
            temp.setDepartureDate(currentDate);
            tickets.add(numberOfTickets, temp);
            numberOfTickets++;
        }
    }

    public void showTickets(Date date, int trainNumber){
        for (Train tr : trains){
            if (tr.getTrainNumber()==trainNumber){
                System.out.printf("Train %d %s - %s %d.%d \n",tr.getTrainNumber(),tr.getDepartureCity(),tr.getDestinationCity(),date.getDay(),date.getMonth());
                for (int i=0; i<tr.wagons.length; i++) {
                    System.out.printf("\n(%d)%s ",i+1, tr.wagons[i].getWagonType());
                    for (int j = 0; j < tr.wagons[i].places.size(); j++) {
                        for (Ticket tk : tickets) {
                            if ((tk.getTrainNumber() == trainNumber) && (tk.getDepartureDate().getDay()==date.getDay() && tk.getDepartureDate().getMonth()==date.getMonth()) && (tk.getWagonNumber()==i+1) && (tk.getPlaceNumber()==j+1)) {
                                if (tk.isFree()){
                                    System.out.printf("%d ", tk.getPlaceNumber());
                                }
                                else {
                                    System.out.print("- ");
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    public Ticket buyTicket(Date date, int trainNumber, String wagonType){
        for (Train tr : trains){
            if (tr.getTrainNumber()==trainNumber) {
                for (int i = 0; i < tr.wagons.length; i++) {
                    if (tr.wagons[i].getWagonType().equals(wagonType)){
                    for (int j = 0; j < tr.wagons[i].places.size(); j++) {
                        for (Ticket tk : tickets) {
                            if ((tk.getTrainNumber() == trainNumber) && (tk.getDepartureDate().getDay() == date.getDay() && tk.getDepartureDate().getMonth() == date.getMonth()) && (tk.getWagonNumber() == i + 1) && tk.isFree()) {
                                System.out.printf("Tickets has been sold: %d wagon, %d place \n", tk.getWagonNumber(), tk.getPlaceNumber());
                                tk.setIsFree(false);
                                return tk;

                            }
                        }
                      }
                    }
                }
            }
        }
        return null;
    }

}

