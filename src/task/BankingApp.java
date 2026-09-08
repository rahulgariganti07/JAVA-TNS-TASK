package task;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("Rahul", "1234", 8000);

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(account.getUsername()) &&
                password.equals(account.getPassword())) {

                loggedIn = true;
                System.out.println("\nLogin successful!");
                break;

            } else {

                attempts++;

                System.out.println("Invalid username or password.");
                System.out.println("Attempts remaining: " + (3 - attempts));
                System.out.println();
            }
        }

        if (loggedIn) {

            int choice;

            do {

                System.out.println("\n===== BANKING MENU =====");
                System.out.println("1. Display Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Change Password");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: ₹" 
                                + account.getBalance());
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();

                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();

                        account.withdraw(withdrawAmount);
                        break;
                        
                    case 4:
                        scanner.nextLine();

                        System.out.print("Enter current password: ");
                        String oldPassword = scanner.nextLine();

                        System.out.print("Enter new password: ");
                        String newPassword = scanner.nextLine();

                        System.out.print("Confirm new password: ");
                        String confirmPassword = scanner.nextLine();

                        if (newPassword.equals(confirmPassword)) {
                            account.changePassword(oldPassword, newPassword);
                        } else {
                            System.out.println("New passwords do not match.");
                        }

                        break;

                    case 5:
                        System.out.println("Thank you for using the banking application.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 5);

        } else {

            System.out.println("Too many failed attempts.");
            System.out.println("Account access denied.");
        }

        scanner.close();
    }
}
