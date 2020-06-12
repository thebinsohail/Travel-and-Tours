
package Add;
import java.util.Scanner;
import javax.swing.JOptionPane;
import tours.and.travels.Menu;
public class RunAdd {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=in.nextLine();
        System.out.println("Enter Visa Id: ");
        int visa=in.nextInt();
        System.out.println("Enter Contact number ");
        double no=in.nextDouble();
        in.close();
        
        CustomerDetails cd=new CustomerDetails();
        cd.getDetails(name, visa, no);
        System.out.println("Details Added!");
        
    }
}
