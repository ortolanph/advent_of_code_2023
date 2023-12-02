package pho.adventofcode.y2023.day02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void gameShouldBePossible() {
        Game game = new Game(1, List.of(
                Map.of("red", 4, "blue", 3),
                Map.of("red", 1, "green", 2, "blue", 6),
                Map.of("green", 2)
        ));

        assertTrue(game.isPossible());
    }

    @Test
    public void gameShouldNotBePossible() {
        Game game = new Game(4, List.of(
                Map.of("red", 3,"green", 1,"blue", 6),
                Map.of("red", 6, "green", 3),
                Map.of("red", 14,"green", 3,"blue", 15)
        ));

        assertFalse(game.isPossible());
    }

}
