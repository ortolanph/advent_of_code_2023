package pho.adventofcode.y2023.day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CubeConundrumTest {

    @Test
    void shouldSolveSolution1() {
        List<String> input = List.of(
                "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green"
        );

        CubeConundrum cubeConundrum = new CubeConundrum();
        int actual = cubeConundrum.solution1(input);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldSolveSolution2() {
    }
}
