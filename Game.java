public class Game {
    private final SimpleGameContext gameContext;
    private int questionNumber = 1;
    private static final String[] QUESTIONS = {
            "Is it responsible for how one class communicates with others?",
            "Does it provide the object creation mechanism that enhances the flexibilities of the existing code?",
            "Does it explain how to assemble objects and classes into a larger structure and simplifies the structure by identifying the relationships?",
            // Add more questions as needed
    };

    public Game(SimpleGameContext gameContext) {
        this.gameContext = gameContext;
    }

    public void start() {
        gameContext.showQuestion("Welcome to the Design Pattern Guessing Game! " +
                "Think of a design pattern and answer the following yes/no questions. " +
                "Ready?");
        askQuestion();
    }

    private void askQuestion() {
        if (questionNumber <= QUESTIONS.length) {
            gameContext.showQuestion(QUESTIONS[questionNumber - 1]);
            questionNumber++;
        } else {
            showGameResult();
        }
    }

    public void answerYes() {
        if (!isGameOver()) {
            gameContext.showQuestion("You answered YES. Continue?");
            String userAnswer = gameContext.getUserInput();

            // Implement logic to ask the next question based on user's answer
            if (userAnswer.equals("yes")) {
                askQuestion();
            } else if (userAnswer.equals("no")) {
                showGameResult();
            } else {
                showTryAgain();
            }
        }
    }

    public void answerNo() {
        if (!isGameOver()) {
            showGameResult();
        }
    }

    private void showGameResult() {
        if (questionNumber <= QUESTIONS.length) {
            gameContext.showQuestion("Game Over. Thanks for playing!");
        } else {
            gameContext.showAnswer("The answer is: " + getDesignPattern());
            gameContext.endGame();
        }
    }

    private String getDesignPattern() {
        // Replace this with your actual logic to determine the design pattern
        return "Strategy"; // Placeholder, replace with actual result
    }

    private void showTryAgain() {
        gameContext.showTryAgain();
    }

    private boolean isGameOver() {
        return questionNumber > QUESTIONS.length;
    }

    public static void main(String[] args) {
        SimpleGameContext gameContext = new SimpleGameContext();
        Game game = new Game(gameContext);
        game.start();

        while (true) {
            String userAnswer = gameContext.getUserInput();

            if (userAnswer.equals("yes")) {
                game.answerYes();
            } else if (userAnswer.equals("no")) {
                game.answerNo();
            } else {
                game.showTryAgain();
            }
        }
    }
}