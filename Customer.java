package beautysalon;

enum members {Premium, Gold, Silver, NoMembership}
public class Customer extends Visit {
    private int ID;
    private String name;
    private members membership;
         
    public void addCustomer(String n,int id,members m)
    {
       name=n;
       ID=id;
       membership=m;  
    }
     public members get_membership()
     {
         return membership;
     }
     
     public void CustomerData(){
         System.out.println("Customer:"+name);
         System.out.println("ID:"+ID);
     }
}

     
     