package pl.sdacademy.unit.test.basic.exercises.tdd.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValidationTest {

    // a-zA-z0-9 + @ a-zA-Z0-9 + .(opcja) + a-zA-Z0-9

    // true
    // sda@sda.pl
    // 123@sda.pl
    // SDA123@sda.pl
    // sda@sda
    // sda@sda.com
    // sda@123.pl123
    // sda@SDA123.PL123

    // false
    // !@sda.pl
    // s,da@sda.pl
    // sda.pl
    // sda@
    // sda@sda.
    // sda@s,da
    // null

    // pozwoliłem sobie trochę uprościć wymagania do poniższych przypadków

    @Test
    void shouldReturnTrueForValidEmailAddress1() {
        //given
        String input = "sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForValidEmailAddress2() {
        //given
        String input = "sda@sda.com";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnTrueForValidEmailAddress3() {
        //given
        String input = "sda.sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress1() {
        //given
        String input = "@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress2() {
        //given
        String input = "sda,sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress3() {
        //given
        String input = "sda?sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress4() {
        //given
        String input = "1sda^sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress5() {
        //given
        String input = "sda^sda@sda.pl";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress6() {
        //given
        String input = "@";
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmailAddress7() {
        //given
        String input = null;
        //when
        boolean result = EmailValidation.validate(input);
        //then
        assertFalse(result);
    }
}