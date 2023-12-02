package pho.adventofcode.y2023.problem;

import java.util.List;

public interface Problem<F, S> {

    F solution1(List<String> input);

    S solution2(List<String> input);

}
