
package beautysalon;


import java.util.Scanner;
public class BeautySalon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Customer c1= new Customer ();
        System.out.println("Enter customer name");
        String str= input.nextLine(); 
        System.out.println("Enter customer ID");
        int ID= input.nextInt(); 
        System.out.println("Enter customer Membership");
        members x= members.valueOf(input.next());

        
        c1.addCustomer(str,ID,x);
        
        System.out.println("Enter product purchases:");
        double p= input.nextInt();
        System.out.println("Enter services purchases:");
        double s= input.nextInt();
         
        c1.CustomerData();
        c1.totalBill(Discount.prodDiscount(p),Discount.servDiscount(s,c1));

    }
}
