package B;

import A.Trip;
public class Holiday {
    public static void main(String[] args) {
           System.out.println(printTripDetails());
        }
    public static String printTripDetails(){
        // TODO : Write you logic here to return trip details
        Trip trip1 = new Trip("Eiffel Tower",2);
        Trip trip2 = new Trip("Notre Dame Cathedral",1);
        Trip trip3 = new Trip("Louvre Museum",5);
        
        return "Trip 1 : location - "+trip1.location+" and planned number of days "+trip1.noOfPlannedDays+" | Trip 2 : location - "+trip2.location+" and planned number of days "+trip2.noOfPlannedDays+" | Trip 3 : location - "+trip3.location+" and planned number of days "+trip3.noOfPlannedDays;
    }
}