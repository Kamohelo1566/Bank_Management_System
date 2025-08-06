import java.util.Scanner;


// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account1 = new Account ("123", 1200);
        account1.Withdraw(scanner);  
        account1. Deposit (scanner);
        
        scanner.close();
    }
}

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

     public void setBalance(double balance){
        this.balance = balance;
    }

    public void Deposit(Scanner scanner){
        System.out.print("Enter a deposit amount: ");
        double amount = scanner.nextDouble();
        if(amount == 0){
            System.out.println ("No money to deposit");
        } 
            else{
            balance += amount;
            System.out.println ("Deposited. Balance is : " + balance );
            }
        }

    public void Withdraw(Scanner scanner){
        System.out.print("Enter a withdrawal amount: ");
        double amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println ("No enough money , your balance is: " + balance);
        }
        else{
            balance -= amount;
            System.out.println ("Withdrawed. Balance is : " + balance );
        }
    }
}

class SavingsAccount extends Account{
    public SavingsAccount( String accountNumber, double balance){
        super (accountNumber,balance);
    }
}

class CurrentAccount extends Account{
    public CurrentAccount( String accountNumber, double balance){
        super (accountNumber,balance);
    }
}