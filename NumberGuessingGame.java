import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // ANSI colors
    static final String RESET = "\u001B[0m";
    static final String CYAN = "\u001B[36m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String RED = "\u001B[31m";
    static final String PURPLE = "\u001B[35m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println(PURPLE);
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║       🎮 NUMBER GUESSING GAME 🎮     ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println(RESET);

        while (playAgain) {

            System.out.println(CYAN + "\nChoose Difficulty:" + RESET);
            System.out.println("1. Easy   → 1 - 50");
            System.out.println("2. Medium → 1 - 100");
            System.out.println("3. Hard   → 1 - 500");

            System.out.print("\nEnter choice: ");
            int choice = sc.nextInt();

            int maxNumber;
            int attempts;

            switch (choice) {
                case 1:
                    maxNumber = 50;
                    attempts = 10;
                    break;

                case 2:
                    maxNumber = 100;
                    attempts = 7;
                    break;

                case 3:
                    maxNumber = 500;
                    attempts = 5;
                    break;

                default:
                    System.out.println(RED + "Invalid choice!" + RESET);
                    continue;
            }

            int secretNumber = random.nextInt(maxNumber) + 1;
            int score = 100;
            boolean won = false;

            System.out.println(YELLOW);
            System.out.println("\n🔥 Guess the number between 1 and " + maxNumber);
            System.out.println("You have " + attempts + " attempts!");
            System.out.println(RESET);

            for (int i = 1; i <= attempts; i++) {

                System.out.print("Attempt " + i + " → Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == secretNumber) {

                    int bonus = (attempts - i) * 10;
                    score += bonus;

                    System.out.println(GREEN);
                    System.out.println("\n╔══════════════════════════════╗");
                    System.out.println("║       🎉 YOU WON! 🎉         ║");
                    System.out.println("╚══════════════════════════════╝");
                    System.out.println("Number was: " + secretNumber);
                    System.out.println("Your Score: " + score);
                    System.out.println(RESET);

                    won = true;
                    break;
                }

                if (guess < secretNumber) {
                    System.out.println(CYAN + "📈 Too LOW!" + RESET);
                } else {
                    System.out.println(RED + "📉 Too HIGH!" + RESET);
                }

                // Extra hint
                if (Math.abs(guess - secretNumber) <= 5) {
                    System.out.println(YELLOW + "🔥 You're VERY close!" + RESET);
                }

                score -= 10;
            }

            if (!won) {
                System.out.println(RED);
                System.out.println("\n💀 GAME OVER!");
                System.out.println("The number was: " + secretNumber);
                System.out.println("Your Score: 0");
                System.out.println(RESET);
            }

            System.out.print("\nPlay again? (yes/no): ");
            String answer = sc.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println(PURPLE);
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║   Thanks for playing! 👑             ║");
        System.out.println("║   Keep coding, keep improving! 💻    ║");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println(RESET);

        sc.close();
    }
}