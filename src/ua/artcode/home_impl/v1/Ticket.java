package ua.artcode.home_impl.v1;

public class Ticket {
    private int id;
    private boolean isFree = true;
    private String departure;
    private String destination;
    private Time departureTime;
    private Date departureDate;
    private int trainNumber;
    private int wagonNumber;
    private int placeNumber;
    private String ticketType;
    private int price;

    public Ticket(int id, String departure, String destination, Time departureTime, int trainNumber, int wagonNumber, int placeNumber, String ticketType, int price) {
        this.id = id;
        this.departure = departure;
        this.destination = destination;
        //this.departureTime = departureTime;
        this.trainNumber = trainNumber;
        this.wagonNumber = wagonNumber;
        this.placeNumber = placeNumber;
        this.ticketType = ticketType;
        this.price = price;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
