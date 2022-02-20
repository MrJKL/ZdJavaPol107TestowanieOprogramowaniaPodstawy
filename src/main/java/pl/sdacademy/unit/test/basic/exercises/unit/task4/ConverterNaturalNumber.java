package pl.sdacademy.unit.test.basic.exercises.unit.task4;

public class ConverterNaturalNumber {

    private static final int FIRST_NATURAL_NUMBER = 0;

    public String toStringFromNaturalNumber(int number) {
        if (number < FIRST_NATURAL_NUMBER) {
            throw new IllegalArgumentException("Given number is less that 0!");
        }
        return String.valueOf(number);
    }
}
