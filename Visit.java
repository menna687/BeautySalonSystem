package beautysalon;

public class Visit  {
   private double products;
   private double services;
   private double total;
   
   
    public void totalBill(double p,double s)
    {
        products = p;
        services = s;
        total=products+services;
        System.out.println("Products Purchases:    "+products+"$");
        System.out.println("Services Purchases:    "+services+"$");
        System.out.println("Total Purchases:       "+total+"$");   
    }

    
}
