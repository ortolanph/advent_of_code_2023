package pho.adventofcode.y2023.utils;

public enum InputMode {

    EXAMPLE("example"), OFFICIAL("official");

    private String path;

    InputMode(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
