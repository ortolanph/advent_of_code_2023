package pho.adventofcode.y2023.day02;

import pho.adventofcode.y2023.problem.Problem;

import java.util.List;
import java.util.stream.Collectors;

public class CubeConundrum implements Problem<Integer, Integer> {
    @Override
    public Integer solution1(List<String> input) {
        System.out.println(input
                .stream()
                .map(GameParser::parse)
                .filter(Game::isPossible)
                .mapToInt(Game::number)
                .boxed()
                .collect(Collectors.toList()));

        return input
                .stream()
                .map(GameParser::parse)
                .filter(Game::isPossible)
                .mapToInt(Game::number)
                .sum();
    }

    @Override
    public Integer solution2(List<String> input) {
        return null;
    }
}
