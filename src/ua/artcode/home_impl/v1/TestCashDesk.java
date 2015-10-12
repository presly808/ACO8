package ua.artcode.home_impl.v1;


public class TestCashDesk {
    public static void main(String[] args) {

        String[] cities = new String[]{"Kiev","Zaporizzia","Lviv","Odesa","Kharkiv","Donetsk","Rivne","Dnipro"};

        //create all types of wagon
        Wagon luxe = new Luxe();
        Wagon coupe = new Coupe();
        Wagon plazcart = new Plazcart();

        //create a train - set of different wagons
        Wagon[] train1Wagons = new Wagon[]{luxe, coupe, plazcart};
        Train train1 = new Train(72,cities[0],cities[1],new Time(20,40),train1Wagons);

        Wagon[] train2Wagons = new Wagon[]{coupe, luxe, coupe, plazcart, plazcart, plazcart, coupe, plazcart};
        Train train2 = new Train(128,cities[2],cities[4],new Time(13,52),train2Wagons);

        Wagon[] train3Wagons = new Wagon[]{coupe, plazcart, luxe, plazcart, coupe, coupe};
        Train train3 = new Train(321,cities[7],cities[6],new Time(20,40),train3Wagons);

        //create a CashDesk
        Train[] trains = new Train[]{train1,train2,train3};
        CashDesk cashDesk = new CashDesk(trains);


        Date date = new Date(10,15);
        cashDesk.buyTicket(date,128,"Luxe");
        cashDesk.buyTicket(date,128,"Luxe");
        cashDesk.buyTicket(date,128,"Luxe");
        cashDesk.showTickets(date,128);
    }

}
