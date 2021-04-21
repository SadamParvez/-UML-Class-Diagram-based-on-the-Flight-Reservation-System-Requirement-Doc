public class Flight {

    public String flightNumber, airline;
    public int capacity;
    public int bookedSeats;
    public int counter = 1;



    public String getFlightDetails() {
        return this.flightNumber + "\n" + this.airline;
    }

    public boolean checkAvailability() {

        if (capacity > bookedSeats) {
            return true;
        } else {
            return false;
        }
    }

    public void incrementBookingCounter() {
        counter++;
    }


}
