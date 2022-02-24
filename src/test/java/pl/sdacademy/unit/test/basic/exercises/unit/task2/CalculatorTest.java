package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldDivideTwoValues() {
        //given
        int firstDigit = 6;
        int secondDigit = 3;
        int expectedResult = 2;
        //when
        int result = calculator.divide(firstDigit, secondDigit);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}