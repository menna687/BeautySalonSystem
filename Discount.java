
package beautysalon;

public class Discount {
    private static double services;
    private static double products;
    private static members membership;
    private static double discountRate;
    private Customer Obj=new Customer();
    
   
   public static double prodDiscount(double p)   // if discountRate is 0.1, it calculates the products final value
   {
       discountRate=0.1;
       products=p;
       return (products-(discountRate*products));
   }
   public static double prodDiscount(double p,int d)    //change discountRate if needed 
   {
       discountRate=d;
       products=p;
       return (products-(discountRate*products));
   }
   public static double servDiscount(double s,Customer Obj)  // calculate value of services after discount based on membership
   {   
       services = s;
       membership=Obj.get_membership();
       if (membership.toString().equals("Premium"))
             return(services-(0.2*services));
           
       else if (membership.toString().equals("Gold"))  
               return(services-(0.15*services));
           
       else if(membership.toString().equals("Silver"))
               return(services-(0.1*services));
           
        else
          return services;
   }
   }


