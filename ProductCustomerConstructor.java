class Product
{
    private int itemno;
    private String name;
    private double price;
    private int qty;

    public Product()
    {
       itemno=0;
       name="Unknown";
       price=0.0;
       qty=0;
    }
    public Product(int i,String n,double p,int q)
    {
        setItemno(i);
        setName(n);
        setPrice(p);
        setQty(q);
    }
    public int getItemno()
    {
       return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQty()
    {
        return qty;
    }
    public void setItemno(int i)
    {
        itemno=i;
    }
    public void setName(String n)
    {
        name=n;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void setQty(int q)
    {
        qty=q;
    }
}

class Customer 
{
   private int custid;
   private String name;
   private String address;
   private String phono;

   public Customer()
   {
      custid=0;
      name="Unknown";
      address="Not Provided";
      phono="0000000000";
   }
   public Customer(int c,String n,String a,String p)
   {
      setCustid(c);
      setName(n);
      setAddress(a);
      setPhono(p);
   }
   public int getCustid()
   {
      return custid;
   }
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public String getPhono()
   {
      return phono;
   }
   public void setCustid(int c)
   {
      custid=c;
   }
   public void setName(String n)
   {
      name=n;
   }
   public void setAddress(String a)
   {
      address=a;
   }
   public void setPhono(String p)
   {
      phono=p;
   }
}

public class ProductCustomerConstructor {
    public static void main(String[] args)
    {
       Product p1=new Product();
       Product p2=new Product(101,"Laptop",75000.50,5);

       System.out.println("Default Product:");
       System.out.println("Item No: "+p1.getItemno());
       System.out.println("Name: "+p1.getName());
       System.out.println("Price: "+p1.getPrice());
       System.out.println("Quantity: "+p1.getQty());

       System.out.println("\nCustom Product:");
       System.out.println("Item No: "+p2.getItemno());
       System.out.println("Name: "+p2.getName());
       System.out.println("Price: "+p2.getPrice());
       System.out.println("Quantity: "+p2.getQty());

       Customer c1=new Customer();
       Customer c2=new Customer();

       System.out.println("\nDefault Customer:");
       System.out.println("Customer ID: "+c1.getCustid());
       System.out.println("Name: "+c1.getName());
       System.out.println("Address: "+c1.getAddress());
       System.out.println("Phone Number: "+c1.getPhono());

       System.out.println("\nCustom Customer:");
       System.out.println("Customer ID: "+c2.getCustid());
       System.out.println("Name: "+c2.getName());
       System.out.println("Address: "+c2.getAddress());
       System.out.println("Phone Number: "+c2.getPhono());
    
    }
}
