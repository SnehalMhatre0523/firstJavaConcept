package A;

/*
 * package A;

/*Create a class called Trip inside package A. And have the attributes like location as String, noOfPlannedDays as int (attributes are nothing but variables).

Create another class called Holiday inside another package called B. In Holiday class main method, Create 3 objects for trip class as trip_1, trip_2 and trip_3. And assign below trip details

trip_1  : location - "Eiffel Tower" and noOfPlannedDays - 2

trip_2  : location - "Notre Dame Cathedral" and noOfPlannedDays - 1

trip_3  : location - "Louvre Museum" and noOfPlannedDays - 5



And finally print all 3 trip details like below,

Trip 1 : location - Eiffel Tower and planned number of days 2 
| Trip 2 : location - Notre Dame Cathedral and planned number of days 1 
| Trip 3 : location - Louvre Museum and planned number of days 5*/


public class Trip {
    public String location;
    public int noOfPlannedDays;
    
    public Trip(String location,int noOfPlannedDays){
        this.location = location;
        this.noOfPlannedDays=noOfPlannedDays;
    }
}
