package pl.sdacademy.unit.test.basic.exercises.unit.task1;

public class StringUtil {

    public static boolean isBlank(String input) {
        return input == null
                || (input.trim().isEmpty() && !input.equals("\n"));
    }

    //true:
    // null
    // "" " " "  "

    //false
    // "a"
    // " a" " a " "a "

}