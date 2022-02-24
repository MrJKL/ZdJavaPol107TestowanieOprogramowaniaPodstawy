package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

public class Account {
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transferMoney(Account account, float amount) {
        if (validate(account, amount)) {
            transfer(account, amount);
        }
    }

    private boolean validate(Account account, float amount) {
        return validateAccountNumber(this)
                && validateAccountNumber(account)
                && validateAmount(amount);
    }

    private boolean validateAccountNumber(Account account) {
        if (account.getAccountNumber().length() != 26 || !account.getAccountNumber().matches("[0-9]+")) {
            System.out.println("Wrong account number: " + account.accountNumber);
            return false;
        }
        return true;
    }

    private boolean validateAmount(float amount) {
        if (this.balance < amount || amount <= 0) {
            System.out.println("Wrong value of amount");
            return false;
        }
        return true;
    }

    private void transfer(Account account, float amount) {
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
    }
}