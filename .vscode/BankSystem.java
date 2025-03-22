class Account
{
   private String accNo;
   private String name;
   private String address;
   private String phone;
   private String dob;
   protected double balance;

   public Account(String a,String n,String add,String p,String d,double b)
   {
      accNo=a;
      name=n;
      address=add;
      phone=p;
      dob=d;
      balance=b;
   }

   public String getAccNo(){ return accNo; }
   public String getName(){ return name; }
   public String getAddress(){ return address; }
   public String getPhone(){ return phone; }
   public String getDob(){ return dob; }
   public double getBalance(){ return balance; }

   public void setName(String n){ name=n; }
   public void setAddress(String a){ address=a; }
   public void setPhone(String p){ phone=p; }

   public void getDetails()
   {
      System.out.println("Account No: "+accNo);
      System.out.println("Name: "+name);
      System.out.println("Address: "+address);
      System.out.println("Phone: "+phone);
      System.out.println("DOB: "+dob);
      System.out.println("Balance: "+balance);
   }
   
   public void close()
   {
      System.out.println("Account "+accNo+" has been closed.");
   }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String a,String n,String add,String p,String d,double b)
    {
        super(a, n, add, p, d, b); //Calls Account Constructor
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: "+amount);
        System.out.println("New Balance: "+balance);
    }

    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance -= amount;
            System.out.println("Withdraw: "+amount);
            System.out.println("Remaining Balance: "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public void fixedDeposit(double amount, int years)
    {
        System.out.println("Fixed Deposit of "+amount+" for "+years+" years created.");
    }

    public void liquidate()
    {
        System.out.println("Fixed deposit liquidated.");
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String a,String n,String add,String p,String d,double b)
    {
        super(a, n, add, p, d, b); // Calls Account Constructor
    }

    public void payEMI(double amount)
    {
        balance -= amount;
        System.out.println("EMI Paid: "+amount);
        System.out.println("Remaining Loan Paid: "+balance);
    }

    public void topUpLoan(double amount)
    {
        balance += amount;
        System.out.println("Loan topped up with: "+amount);
        System.out.println("New Loan Balance: "+balance);
    }

    public void repayment(double amount)
    {
        balance -= amount;
        System.out.println("Loan repaid: "+amount);
        System.out.println("Remaining Loan Balance: "+balance);
    }
}

public class BankSystem 
{
    public static void main(String[] args)
    {
       SavingsAccount savings = new SavingsAccount("12345", "Sanjog", "123 Street", "7044060328", "08-05-2011", 5000);
       System.out.println("Savings Account Details:");
       savings.getDetails();
       savings.deposit(2000);
       savings.withdraw(1000);
       savings.fixedDeposit(5000, 5);
       savings.liquidate();
       
       System.out.println("\nUpdating Savings Account details...");
       savings.setAddress("456 New Street");
       savings.setPhone("9831084118");
       System.out.println("Updated Details:");
       savings.getDetails();

       System.out.println();

       LoanAccount loan=new LoanAccount("67890", "Sanjog", "123 Street", "7044060328", "08-05-2011", 20000);
       System.out.println("Loan Account Details:");
       loan.getDetails();
       loan.payEMI(5000);
       loan.topUpLoan(10000);
       loan.repayment(8000);

       System.out.println("\nUpdating Loan Account details...");
       savings.setName("Snigdhajyoti");
       savings.setPhone("7044060329");
       System.out.println("Updated Details:");
       savings.getDetails();

    }
}
