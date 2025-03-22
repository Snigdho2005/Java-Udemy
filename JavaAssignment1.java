class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    
    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied: " + interest + ". New balance: " + balance);
    }
}


class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount.");
        }
    }

    
    public void checkOverdraft() {
        if (balance < 0) {
            System.out.println("Account is in overdraft. Limit remaining: " + (overdraftLimit + balance));
        } else {
            System.out.println("Account is not in overdraft.");
        }
    }
}


public class JavaAssignment1 {
    public static void main(String[] args) {
        // Creating a Savings Account
        SavingsAccount savings = new SavingsAccount("SA123", "John Doe", 5000, 5);
        savings.deposit(2000);
        savings.applyInterest();
        savings.displayBalance();

        System.out.println();

        // Creating a Current Account
        CurrentAccount current = new CurrentAccount("CA456", "Jane Doe", 3000, 1000);
        current.withdraw(3500);
        current.checkOverdraft();
        current.displayBalance();
    }
}


