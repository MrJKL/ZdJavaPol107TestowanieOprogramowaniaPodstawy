package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoValues() {
        //when
        int result = calculator.add(1, 2);
        //then
        assertEquals(3, result);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldSubtractTwoValues() {
        //when
        int result = calculator.subtract(1, 2);
        //then
        assertEquals(-1, result);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void shouldMultiplyTwoValues() {
        //when
        int result = calculator.multiply(2, 3);
        //then
        assertEquals(6, result);
        assertThat(result).isEqualTo(6);
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