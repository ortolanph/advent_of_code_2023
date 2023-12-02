package pho.adventofcode.y2023.day02;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameParserTest {

    @Test
    public void shouldParseResult() {
        GameParser parser = new GameParser();

        Game actual = parser.parse("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green");
        Game expected = new Game(1, List.of(
                Map.of("red", 4, "blue", 3),
                Map.of("red", 1, "green", 2, "blue", 6),
                Map.of("green", 2)
        ));

        assertEquals(expected, actual);
    }

}
