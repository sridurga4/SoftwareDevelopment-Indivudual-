import java.util.Scanner;

public class ConsoleGameContext implements GameContext {

    @Override
    public void showQuestion(String question) {
        System.out.println(question);
    }

    @Override
    public void endGame() {

    }

    @Override
    public void showHint(String hint) {
        System.out.println("Hint: " + hint);
    }

    @Override
    public void endGame(String message) {
        System.out.println(message);
        System.exit(0);
    }

    public boolean askRetry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Play again? (y/n)");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }
}