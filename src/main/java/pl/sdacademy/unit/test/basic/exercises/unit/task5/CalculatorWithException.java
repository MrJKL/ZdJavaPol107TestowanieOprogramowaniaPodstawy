package pl.sdacademy.unit.test.basic.exercises.unit.task5;

public class CalculatorWithException {

    public int divide(int firstDigit, int secondDigit) {
        int result;
        try {
            result = firstDigit / secondDigit;
        } catch (ArithmeticException ex) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return result;
    }
}