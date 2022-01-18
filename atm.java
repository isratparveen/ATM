package project;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int amount = 100000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose: ");
            System.out.println("1 for withdrawing money");
            System.out.println("2 for depositing money");
            System.out.println("3 for checking balance");
            System.out.println("4 to EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount of money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if(amount >= withdraw){
                        amount = amount - withdraw;
                        System.out.println("Please collect your money");
                        System.out.print("Your remaining balance is: "+amount);
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter amount of money to be deposited:");
                    deposit = sc.nextInt();
                    amount = amount + deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.print("Your remaining balance is: "+amount);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Total amount: " + amount);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operation");
                    System.out.println("");
            }
        }
    }
}
