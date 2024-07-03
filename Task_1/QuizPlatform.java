import java.util.*;
class Account {
    int accNumber;
    String accHolderName;
    double balance;

    public Account(int accNumber , String accHolderName , double balance){
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
        
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(+amount+" deposited:");
    }

    void withdraw(double amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println(+amount+" withdrown.");
        }else{
            System.out.println("balance is not sufficient to withdraw.");
        }
       
    }

    double checkBalance() {
        return balance;
    }
}

public class QuizPlatform {
   
    private static String john;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name:");
        String name = sc.nextLine();
        System.out.println("Enter the Acoount number:");
        int num = sc.nextInt();
        double balance = 0.0;
        Account acc = new Account(123456 , john , 0);
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
 
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be deposited:");
                    double deposit = sc.nextDouble();
                    acc.deposit(deposit);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn:");
                    double withdrow = sc.nextDouble();
                    acc.withdraw(withdrow);
                    break;
                case 3:
                balance = acc.checkBalance();
                    System.out.println("Current balance is "+balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}