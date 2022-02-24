package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void shouldTransferCorrectAmount() {
        //given
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(1900, debit.getBalance());
        assertThat(credit.getBalance()).isEqualTo(1100);
        assertThat(debit.getBalance()).isEqualTo(1900);
    }

    @Test
    void shouldNotTransferMoneyIfCreditAccountNumberIsWrong1() {
        //given
        String creditAccountNumber = "1";
        Account credit = new Account(1000, creditAccountNumber, new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNotTransferMoneyIfCreditAccountNumberIsWrong2() {
        //given
        String creditAccountNumber = "111111111111111111111111111";
        Account credit = new Account(1000, creditAccountNumber, new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNotTransferMoneyIfCreditAccountNumberIsWrong3() {
        //given
        String creditAccountNumber = " ";
        Account credit = new Account(1000, creditAccountNumber, new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNoyTransferMoneyIfAmountIsWrong1() {
        //given
        float amount = 10000;
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, amount);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNoyTransferMoneyIfAmountIsWrong2() {
        //given
        float amount = 0;
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, amount);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNoyTransferMoneyIfAmountIsWrong3() {
        //given
        float amount = -1;
        Account credit = new Account(1000, "11111111111111111111111111", new Customer("aaa", "bbb"));
        Account debit = new Account(2000, "22222222222222222222222222", new Customer("ccc", "ddd"));
        //when
        debit.transferMoney(credit, amount);
        //then
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }
}