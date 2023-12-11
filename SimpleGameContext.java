import java.util.Scanner;

interface GameContext {
    void showQuestion(String question);
    void endGame();
    String getUserInput();
    void showAnswer(String answer);
    void showTryAgain();
}

class SimpleGameContext implements GameContext {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showQuestion(String question) {
        System.out.println(question);
    }

    @Override
    public void endGame() {
        System.out.println("Game Over. Thanks for playing!");
        System.exit(0);
    }

    @Override
    public String getUserInput() {
        System.out.print("Your answer (yes/no): ");
        return scanner.nextLine().toLowerCase();
    }

    @Override
    public void showAnswer(String answer) {
        System.out.println("The answer is: " + answer);
    }

    @Override
    public void showTryAgain() {
        System.out.println("I can't guess the pattern. Please try again!");
    }
}
