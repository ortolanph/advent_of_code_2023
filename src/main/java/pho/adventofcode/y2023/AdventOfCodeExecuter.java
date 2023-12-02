package pho.adventofcode.y2023;

import pho.adventofcode.y2023.day01.Trebuchet;
import pho.adventofcode.y2023.day02.CubeConundrum;
import pho.adventofcode.y2023.problem.Problem;
import pho.adventofcode.y2023.utils.InputLoader;
import pho.adventofcode.y2023.utils.InputMode;

import java.io.IOException;
import java.util.List;

public class AdventOfCodeExecuter {

    public static void main(String[] args) throws IOException {
        List<String> input = InputLoader.loadInput(InputMode.OFFICIAL, 2);

        Problem<Integer, Integer> p = new CubeConundrum();

        System.out.println(p.solution1(input));
        System.out.println(p.solution2(input));
    }

}
