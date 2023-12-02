package pho.adventofcode.y2023.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrebuchetTest {

    private final Trebuchet trebuchet = new Trebuchet();

    @Test
    public void shouldSolveProblem1() {
        List<String> input = List.of(
                "1abc2",
                "pqr3stu8vwx",
                "a1b2c3d4e5f",
                "treb7uchet"
        );

        int actual = trebuchet.solution1(input);
        int expected = 142;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSolveProblem2() {
        List<String> input = List.of(
                "two1nine",
                "eightwothree",
                "abcone2threexyz",
                "xtwone3four",
                "4nineeightseven2",
                "zoneight234",
                "7pqrstsixteen"
        );

        int actual = trebuchet.solution2(input);
        int expected = 281;

        assertEquals(expected, actual);
    }
}
