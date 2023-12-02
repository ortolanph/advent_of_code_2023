package pho.adventofcode.y2023.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class InputLoaderTest {

    @Test
    public void shouldLoadFile() throws IOException {
        List<String> lines = InputLoader.loadInput(InputMode.EXAMPLE, 99);

        assertEquals(lines.size(), 1);
        assertEquals(lines.get(0), "This is a test line.");
    }

    @Test
    public void shouldLaunchException() {
        assertThrows(IOException.class, () -> InputLoader.loadInput(InputMode.EXAMPLE, 98));
    }

}
