import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;
        int pin = 1234;

        System.out.println("================================");
        System.out.println("        WELCOME TO ATM");
        System.out.println("================================");

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("❌ Incorrect PIN!");
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("💰 Current Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("✅ Deposit Successful!");
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > balance) {
                        System.out.println("❌ Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("✅ Withdrawal Successful!");
                    }
                    break;

                case 4:
                    System.out.println("🙏 Thank you for using ATM.");
                    break;

                default:
                    System.out.println("❌ Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}