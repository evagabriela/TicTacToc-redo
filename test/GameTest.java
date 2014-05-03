import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {
    private PrintStream out;
    private Game game;


    @Before
    public void setUp(){
    out = mock(PrintStream.class);
    }
    @Test
    public void shouldDrawGridWhenProgramStarts() throws IOException {
        Game game = new Game(out);
        game.start();
        verify(out).println(" | | \n"
                + "-----\n"
                + " | | \n"
                + "-----\n"
                + " | | \n");
     }
}

