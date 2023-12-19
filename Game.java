import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    private final GameContext context;

    public Game(GameContext context) {
        this.context = context;
    }

    public void start() {
        context.showQuestion("Welcome to the game! Think of a design pattern and answer the following yes/no questions. Ready?");
    }

    public void answerYes() {
        context.showQuestion("You answered YES. Continue?");
    }

    public void answerNo() {
        context.endGame();
    }

    public String readAnswer() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void mainLogic() throws IOException {
        GameContext context = new ConsoleGameContext();
        Game game = new Game(context);
        game.start();
        if(game.readAnswer().equalsIgnoreCase("yes")){
            game.answerYes();
            context.showQuestion("Does it provide the object creation mechanism that enhances the flexibility of the existing code?");
            if(game.readAnswer().equalsIgnoreCase("yes")){
                game.answerYes();
                context.showQuestion("Does it ensure you have at most one instance of a class in your application?");
                if(game.readAnswer().equalsIgnoreCase("yes")){
                    game.answerYes();
                    context.showQuestion("is it a singleton pattern");
                    if(game.readAnswer().equalsIgnoreCase("yes")){
                        game.answerYes();
                        context.showQuestion("wohooo!! guessed it! try again");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            mainLogic();
                        }

                        else
                            context.endGame();
                    }
                    else{
                        context.showQuestion("oops!! something went wrong try again");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            mainLogic();
                        }
                        else
                            context.endGame();
                    }
                }
                else {
                    context.showQuestion("is it a builder pattern");
                    if(game.readAnswer().equalsIgnoreCase("yes")){
                        context.showQuestion("wohooo!! guessed it! try again");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            mainLogic();
                        }
                        else
                            context.endGame();

                    }
                    else{
                        context.showQuestion("oops!! something went wrong try again");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            mainLogic();
                        }
                        else
                            context.endGame();

                    }
                }
            }
            else {
                context.showQuestion("is it responsible for how one class communicates with other");
                if (game.readAnswer().equalsIgnoreCase("yes")) {
                    game.answerYes();
                    context.showQuestion("does it provide a mechanism to the context to change its behavior");
                    if (game.readAnswer().equalsIgnoreCase("yes")){
                        game.answerYes();
                        context.showQuestion("is changing behaviour built into its schema");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            context.showQuestion("is it a state pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();

                                }
                                else
                                    context.endGame();
                            }
                        }
                        else{
                            context.showQuestion("is it a strategy pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }

                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();
                            }
                        }
                    }
                    else{
                        context.showQuestion("does it allow a group of objects to be notified when some state changes");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            context.showQuestion("is it a observer pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();

                            }
                        }
                        else{
                            context.showQuestion("is it a command pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }

                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();

                            }
                        }

                    }
                }
                else{
                    context.showQuestion("does it explain how to assemble objects and classes into a larger...");
                    if(game.readAnswer().equalsIgnoreCase("yes")){
                        game.answerYes();
                        context.showQuestion("does it attach additional behaviour to an object dynamically at run time");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            context.showQuestion("is it a decorator pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes"))
                                    mainLogic();
                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();
                            }
                        }
                        else{
                            context.showQuestion("is it a adapter pattern");
                            if(game.readAnswer().equalsIgnoreCase("yes")){
                                game.answerYes();
                                context.showQuestion("wohooo!! guessed it! try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();
                            }
                            else{
                                context.showQuestion("oops!! something went wrong try again");
                                if(game.readAnswer().equalsIgnoreCase("yes")){
                                    game.answerYes();
                                    mainLogic();
                                }
                                else
                                    context.endGame();

                            }
                        }
                    }
                    else{
                        context.showQuestion("oops!! something went wrong try again");
                        if(game.readAnswer().equalsIgnoreCase("yes")){
                            game.answerYes();
                            mainLogic();
                        }
                        else
                            context.endGame();

                    }

                }

            }
        }

        else{
            context.endGame();
        }
    }


    public static void main(String[] args) throws IOException {
        mainLogic();
    }
}