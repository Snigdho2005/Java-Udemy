abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
    }

 
    public abstract void withdraw(double amount);

   
    public void displayBalance() {
        System.out.println("Account No: " + accountNumber + ", Balance: $" + balance);
    }
}

interface Taxable {
    double calculateTax(); 
}
    class SavingsAccount extends BankAccount implements Taxable {
       private static final double MIN_BALANCE = 500; 
       private static final double INTEREST_RATE = 0.03;


    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance of $" + MIN_BALANCE + " required.");
        }
    }

    @Override
    public double calculateTax() {
        return balance * INTEREST_RATE * 0.1;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", New Balance: $" + balance);
        } else {
            System.out.println("Overdraft limit exceeded! Transaction declined.");
        }
    }
}

public class JavaAssignment5 {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SA123", 1000);
        savings.deposit(500);
        savings.withdraw(800); 
        savings.withdraw(300); 
        System.out.println("Tax on Interest: $" + savings.calculateTax());
        savings.displayBalance();

        CurrentAccount current = new CurrentAccount("CA456", 500, 1000); // Overdraft limit: 1000
        current.deposit(200);
        current.withdraw(1000); 
        current.withdraw(800);  
        current.displayBalance();


        BankAccount account;
        account = savings;  
        account.displayBalance();

        account = current; 
        account.displayBalance();
    }
}