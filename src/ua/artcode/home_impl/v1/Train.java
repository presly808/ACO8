package ua.artcode.home_impl.v1;

public class Train {
    private int trainNumber;
    private String departureCity;
    private String destinationCity;
    private Time departureTime;
    Wagon [] wagons;

    public Train(int trainNumber, String departureCity, String destinationCity, Time departureTime, Wagon[] wagons) {
        this.trainNumber = trainNumber;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureTime = departureTime;
        this.wagons = wagons;
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }
}
