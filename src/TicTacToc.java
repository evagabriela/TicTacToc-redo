import java.io.PrintStream;

public class TicTacToc {
    private static PrintStream out;

    public static void main(String[] args) {
        PrintStream out = System.out;
        Game game = new Game(out);
        game.start();

    }
}
