package pho.adventofcode.y2023.day01;

import pho.adventofcode.y2023.problem.Problem;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trebuchet implements Problem<Integer, Integer> {

    private static final String NUMBER_NAMES = "(one|two|three|four|five|six|seven|eight|nine|\\d)";

    @Override
    public Integer solution1(List<String> input) {
        return input
                .stream()
                .mapToInt(this::numberFirstLastDigit)
                .sum();
    }

    @Override
    public Integer solution2(List<String> input) {
        return input
                .stream()
                .mapToInt(this::replaceNumberNames)
                .sum();
    }

    private int numberFirstLastDigit(String line) {
        String onlyDigits = line.replaceAll("[^\\d.]", "");

        if (onlyDigits.length() == 1) return Integer.parseInt(onlyDigits + onlyDigits);
        if (onlyDigits.length() == 2) return Integer.parseInt(onlyDigits);

        String firstDigit = onlyDigits.substring(0, 1);
        String secondDigit = onlyDigits.substring(onlyDigits.length() - 1);

        return Integer.parseInt(firstDigit + secondDigit);
    }

    private int replaceNumberNames(String line) {
        Matcher matcher = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine|\\d)").matcher(line);
        matcher.find();
        int firstInt = stringToInt(matcher.group());
        String reverse = new StringBuilder("one|two|three|four|five|six|seven|eight|nine").reverse().toString();
        Matcher matcherLast=Pattern.compile("("+reverse+"|\\d)").matcher(new StringBuilder(line).reverse().toString());
        matcherLast.find();
        int lastInt = stringToInt(new StringBuilder(matcherLast.group()).reverse().toString());;
        return firstInt * 10 + lastInt;
    }

    private int stringToInt(String text) {
        return switch (text) {
            case "one" -> 1;
            case "two" -> 2;
            case "three" -> 3;
            case "four" -> 4;
            case "five" -> 5;
            case "six" -> 6;
            case "seven" -> 7;
            case "eight" -> 8;
            case "nine" -> 9;
            default -> Integer.parseInt(text);
        };
    }

}
