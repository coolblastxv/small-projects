class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(int accountNumber,double balance,String ownerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }


    public double deposit(int deposit) {
        balance += deposit;
        System.out.println(ownerName+"'s acount balance after deposit: "+balance);
        return balance;
    }

    public double withdraw(int withdraw) {
        balance -= withdraw;
        System.out.println(ownerName+"'s acount balance after withdraw: "+balance);
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+balance);

    }
}


public class BankingSystem {
    public static void main(String[] args) {
        BankAccount Account1 = new BankAccount(12345,1000.0,"Sam");
        BankAccount Account2 = new BankAccount(67890,500.0,"Antonio");

        Account1.displayAccountDetails();
        System.out.println();
        Account1.deposit(500);
        Account1.withdraw(200);
        System.out.println();

        Account2.displayAccountDetails();
        System.out.println();
        Account2.deposit(500);
        Account2.withdraw(200);

    }
}
