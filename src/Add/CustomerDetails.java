package Add;
public class CustomerDetails {

	String Customername;
	int CustomerVisaId;
	double CustomerContact;
	
	public void getDetails(String Cn , int CVI ,double Cc){
		  Customername=Cn ;
		  CustomerVisaId=CVI ;
		   CustomerContact=Cc ;
	}
	public void showDetails() {
		
		System.out.println("Customer name : " +Customername);
		System.out.println("Customer Visa Id : " +CustomerVisaId);
		System.out.println("Customer Contact : " +CustomerContact);	
	}
}


