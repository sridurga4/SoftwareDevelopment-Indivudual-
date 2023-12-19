
public interface GameContext {
    void showQuestion(String question);
    void endGame();

    void showHint(String hint);

    void endGame(String message);
}
