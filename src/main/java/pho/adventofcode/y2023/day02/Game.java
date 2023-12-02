package pho.adventofcode.y2023.day02;

import java.util.List;
import java.util.Map;

public record Game(int number, List<Map<String, Integer>> results) {

    private static final int TOTAL_RED = 12;
    private static final int TOTAL_GREEN = 13;
    private static final int TOTAL_BLUE = 14;

    public boolean isPossible() {
        int totalRed = collectColor("red");
        int totalGreen = collectColor("green");
        int totalBlue = collectColor("blue");

        boolean checkRed =  totalRed <= TOTAL_RED;
        boolean checkGreen = totalGreen <= TOTAL_GREEN;
        boolean checkBlue = totalBlue <= TOTAL_BLUE;

        return checkRed && checkGreen && checkBlue;
    }

    private int collectColor(String color) {
        return results.stream().mapToInt(m -> m.getOrDefault(color, 0)).sum();
    }

}
