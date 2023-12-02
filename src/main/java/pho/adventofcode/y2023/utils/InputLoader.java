package pho.adventofcode.y2023.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class InputLoader {

    public static List<String> loadInput(InputMode mode, int dayNumber) throws IOException {
        String day = String.format("%02d", dayNumber);
        String fileName = String.format(".%sinputs%s%s%sday%s.txt",
                File.separator,
                File.separator,
                mode.getPath(),
                File.separator,
                day);

        return Files.readAllLines(Path.of(fileName));
    }
}
