package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    // null
    // ""
    // " "
    // "  "
    // "abc", "123"
    // "/n"
    // " a", " a ", "a "

    @Test
    void shouldReturnTrueIfStringIsNull() {
        //given
        String input = null;
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringContainsOnlySpaces() {
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnFalseIfStringContainsNewLine() {
        //given
        String input = "\n";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //junit
        assertThat(result).isFalse(); //assertJ
    }

}