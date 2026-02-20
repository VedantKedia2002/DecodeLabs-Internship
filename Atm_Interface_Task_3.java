import java.util.*;
public class Atm_Interface_Task_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance = 500;
        int choice;

        do {
            // Show menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            // Handle choice
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.println("Your balance: $" + balance);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
    }

