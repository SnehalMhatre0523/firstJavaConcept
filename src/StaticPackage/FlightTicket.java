package StaticPackage;

public class FlightTicket {
	public int flightNumber;
	public int seatNumber;
	public String ticketCategory;
	public int ticketID;
	
	public static int  avaiableSeat=2;
	
	public FlightTicket(int flightNumber, int seatNumber, String ticketCategory, int ticketID) {
		super();
		this.flightNumber = flightNumber;
		this.seatNumber = seatNumber;
		this.ticketCategory = ticketCategory;
		this.ticketID = ticketID;
	}
	
	public static void main(String[] args) {
		createTicket(1122, 1, "ECONOMY", 12345);
		//f1.avaiableSeat--;
		//System.out.println("Avaible Seat now :"+avaiableSeat);
		createTicket(1122, 2, "ECONOMY", 12346);
		//FlightTicket f2= new FlightTicket(1122, 2, "ECONOMY", 12346);
		//f2.avaiableSeat--;
		//System.out.println("Avaible Seat now :"+avaiableSeat);
		createTicket(1122, 3, "ECONOMY", 12347);
		//FlightTicket f3= new FlightTicket(1122, 3, "ECONOMY", 12347);
		//f3.avaiableSeat--;
		System.out.println("Avaible Seat now :"+avaiableSeat);
		
	}
	
	private static void createTicket(int flNum,int seatNum, String ticketTy,int ticketId) {
		
		if(avaiableSeat > 0) {
		FlightTicket f1= new FlightTicket(flNum, seatNum, ticketTy, ticketId);
		f1.avaiableSeat--;
		System.out.println("Avaible seats now :"+avaiableSeat);
		}else {
			System.out.println("Sorry ticket is not avaible");
		}
	}
}
