#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    int player, computer;

    srand(time(0));

    cout << "===== ROCK PAPER SCISSORS =====\n";
    cout << "1. Rock\n";
    cout << "2. Paper\n";
    cout << "3. Scissors\n";

    cout << "\nEnter your choice: ";
    cin >> player;

    if (player < 1 || player > 3) {
        cout << "Invalid choice!\n";
        return 0;
    }

    computer = rand() % 3 + 1;

    cout << "Computer chose: ";

    if (computer == 1)
        cout << "Rock\n";
    else if (computer == 2)
        cout << "Paper\n";
    else
        cout << "Scissors\n";

    if (player == computer) {
        cout << "\nIt's a draw! 🤝\n";
    }
    else if ((player == 1 && computer == 3) ||
             (player == 2 && computer == 1) ||
             (player == 3 && computer == 2)) {
        cout << "\nYou WIN! 🎉\n";
    }
    else {
        cout << "\nComputer WINS! 😈\n";
    }

    return 0;
}