package Add;
public class AvailableTransport extends CustomerDetails{
	String transport;
	public void getDetails(String t) {
		transport = t;
        }
	public void show() {
		System.out.println("Customer transport : " +transport);
		
	}
}
