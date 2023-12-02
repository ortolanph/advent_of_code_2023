package pho.adventofcode.y2023.day02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Game(int number, List<Map<String, Integer>> results) {

    private static final int TOTAL_RED = 12;
    private static final int TOTAL_GREEN = 13;
    private static final int TOTAL_BLUE = 14;

    public boolean isPossible() {

        System.out.println(number);
        int totalRed = collectColor("red");
        int totalGreen = collectColor("green");
        int totalBlue = collectColor("blue");

        boolean checkRed =  totalRed <= TOTAL_RED;
        boolean checkGreen = totalGreen <= TOTAL_GREEN;
        boolean checkBlue = totalBlue <= TOTAL_BLUE;

        int checkingSum = (checkRed ? 1 : 0) + (checkGreen ? 1 : 0) + (checkBlue ? 1 : 0);
        System.out.println(checkingSum);
        System.out.println();

        return checkingSum == 3;
    }

    private int collectColor(String color) {
        System.out.println(results.stream().mapToInt(m -> m.getOrDefault(color, 0)).boxed().collect(Collectors.toList()));
        System.out.println(results.stream().mapToInt(m -> m.getOrDefault(color, 0)).sum());

        return results.stream().mapToInt(m -> m.getOrDefault(color, 0)).sum();
    }

}
