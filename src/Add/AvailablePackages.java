package Add;
class AvailablePackages extends CustomerDetails{
double budget;
int expenses;
String food;

	
	void getDetails(double b , int ex, String foo) {
		budget = b;
		expenses = ex;
		food = foo;
	}
	
	void show() {
		System.out.println("Customer budget : " +budget);
		System.out.println("Customer expenses : " +expenses);
		System.out.println("Customer food : " +food);
	}
	

}