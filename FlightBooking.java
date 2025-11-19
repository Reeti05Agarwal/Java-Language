package Codes;

class NoSeatsAvaliableException extends RuntimeException{
    public NoSeatsAvaliableException(String s){
        super(s);
    }
}

class SeatsInFlight{
    int seatsLeft;

    SeatsInFlight(int s){
        this.seatsLeft = s;
    }
}

public class FlightBooking{
 
    SeatsInFlight s = new SeatsInFlight(10);
    public void bookSeats(int seats) {
        s.seatsLeft = s.seatsLeft - seats;
        if(s.seatsLeft<=0){
            throw new NoSeatsAvaliableException("Only seats available");
        }
        System.out.println("Seats Booked: " + seats);
        System.out.println("Seats Left: " + s.seatsLeft);
    }

    public static void main(String[] args) {
        try{
            FlightBooking f = new FlightBooking();
            f.bookSeats(2);
            f.bookSeats(3);
            f.bookSeats(6);
        }
        catch(NoSeatsAvaliableException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
