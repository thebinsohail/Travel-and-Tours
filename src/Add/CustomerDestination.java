package Add;
public class CustomerDestination extends CustomerDetails{

	String CustomerDestination;
	
   
	public void getDetails(String Cd) {
		
		CustomerDestination=Cd;
	}
	
        @Override
	public void showDetails() {
		System.out.println("Customer Destination : " +CustomerDestination);
	}
}