import java.util.Scanner;

class FlightBooking{
    public String flightid = "OOP003";
    private static int seatAvailable = 180;

    public static void Booking (){
        --seatAvailable;
        printed();
    }
    public static void Cancel(){
        ++seatAvailable;
        printed();
    }
    public static void Confirmed(int id){
        System.out.print("--User " + id + " Confirmed--");
        printed();
    }
    public static void printed(){
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }
    public static void reset(){
        seatAvailable = 180;
    }
}
public class OOP003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            FlightBooking.reset();
            String seat = sc.nextLine();
            String[] seats = seat.split(" ");

            for (int i = 0; i < seats.length; i+=2) {
                String action = seats[i+1];
                int userID = Integer.parseInt(seats[i]);

                if(action.equals("Booking")){
                    FlightBooking.Booking();
                }
                else if(action.equals("Confirmed")){
                    FlightBooking.Confirmed(userID);
                }
                else if(action.equals("Cancel")){
                    FlightBooking.Cancel();
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
