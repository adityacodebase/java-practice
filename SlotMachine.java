import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int coins = 100;

        System.out.println("🎰 WELCOME TO JAVA SLOT MACHINE 🎰");
        System.out.println("Starting coins: " + coins);

        while (coins > 0) {

            System.out.println("\nYour coins: " + coins);
            System.out.print("Enter bet (0 to quit): ");
            int bet = sc.nextInt();

            if (bet == 0) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (bet > coins || bet < 0) {
                System.out.println("Invalid bet!");
                continue;
            }

            int slot1 = random.nextInt(5) + 1;
            int slot2 = random.nextInt(5) + 1;
            int slot3 = random.nextInt(5) + 1;

            System.out.println("\nSpinning...");
            System.out.println("[" + slot1 + "] [" + slot2 + "] [" + slot3 + "]");

            if (slot1 == slot2 && slot2 == slot3) {

                int winnings = bet * 5;
                coins += winnings;

                System.out.println("🎉 JACKPOT!");
                System.out.println("You won " + winnings + " coins!");

            } 
            else if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {

                int winnings = bet * 2;
                coins += winnings;

                System.out.println("✨ Two matched!");
                System.out.println("You won " + winnings + " coins!");

            } 
            else {

                coins -= bet;

                System.out.println("😢 No match!");
                System.out.println("You lost " + bet + " coins.");
            }
        }

        if (coins == 0) {
            System.out.println("\n💀 You're out of coins!");
        }

        System.out.println("Final coins: " + coins);

        sc.close();
    }
}
