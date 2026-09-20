package OOP.Classes_and_Object;

class BankAccount{
    String accountHolder;
    double balance;
    
    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        }
        public void deposit(double amount){
            balance = balance + amount;
            System.out.println("Deposit Balance : " + amount + " New Balance : " + balance);
        }

    }

public class BankAccountTester{
    public static void main(String [] args){
        BankAccount BankAccount1 = new BankAccount("Md. Monirul Hasan", 100);
        BankAccount1.deposit(50.30);
    }
}

/*
The Task:

Create a class named BankAccount.

Give it two properties: accountHolder (String) and balance (double).

Create a constructor that takes accountHolder and balance as parameters. Use the exact same names for the parameters and use the this keyword to assign them.

Create a method called deposit(double amount) that adds the amount to the balance and prints the new balance.

In your main method, create an account for Md. Monirul Hasan with a starting balance, deposit some money, and check that the math works.
*/
