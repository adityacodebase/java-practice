import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println("===== JAVA QUIZ GAME =====");

        System.out.println("\n1. Who developed Java?");
        System.out.println("a) Microsoft");
        System.out.println("b) Sun Microsystems");
        System.out.println("c) Google");
        System.out.print("Answer: ");

        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        System.out.println("\n2. Java is?");
        System.out.println("a) Platform Independent");
        System.out.println("b) Platform Dependent");
        System.out.println("c) None");
        System.out.print("Answer: ");

        char ans2 = sc.next().charAt(0);

        if (ans2 == 'a' || ans2 == 'A') {
            score++;
        }

        System.out.println("\n🎯 Final Score: " + score + "/2");

        if (score == 2)
            System.out.println("🏆 Excellent!");
        else if (score == 1)
            System.out.println("👍 Good!");
        else
            System.out.println("📚 Keep Learning!");

        sc.close();
    }
}