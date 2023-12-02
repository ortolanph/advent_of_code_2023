package pho.adventofcode.y2023.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameParser {


    public static Game parse(String gameResult) {
        String[] elements = gameResult.split(":");

        String gameHeader = elements[0];
        String gameData = elements[1];

        int gameNumber = Integer.parseInt(gameHeader.split(" ")[1]);

        List<Map<String, Integer>> results = new ArrayList<>();

        String[] partialResults = gameData.trim().split(";");

        for(String partial : partialResults) {
            String[] cubeResults = partial.trim().split(",");

            Map<String, Integer> partialMap = new HashMap<>();

            for(String cubeResult : cubeResults) {
                String[] finalResult = cubeResult.trim().split(" ");
                partialMap.put(finalResult[1], Integer.valueOf(finalResult[0]));
            }

            results.add(partialMap);
        }

        return new Game(gameNumber, results);
    }
}
