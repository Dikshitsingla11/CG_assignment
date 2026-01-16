class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccount() {
        System.out.println("Account No: " + accountNumber); // public
        System.out.println("Holder: " + accountHolder);     // protected
        System.out.println("Balance: " + getBalance());     // private via getter
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1234567890L, "Amit", 5000, 4.5);

        sa.displaySavingsAccount();
        sa.deposit(2000);
        sa.withdraw(1000);

        System.out.println("Final Balance: " + sa.getBalance());
    }
}
