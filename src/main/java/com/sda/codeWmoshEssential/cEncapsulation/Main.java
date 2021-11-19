package com.sda.codeWmoshEssential.cEncapsulation;

public class Main {
    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();

        Account account = new Account();
        account.deposit(100);
        account.withdraw(33 );
        System.out.println(account.getBalance());

    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }


}
