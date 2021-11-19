package com.sda.recapFinalExercises.Encapsulation;

public class Pocket {

    private int money;

    public Pocket(int money) {
        this.money = money;
    }

    public int getMoney() {
        if (money <= 10) {
            return 0;
        }
        return money;
    }

    public void setMoney(int money) {
        if (money < 0 || money > 3000) {
            System.out.println("not enough money!");
            return;
        }
        this.money = money;
    }
}
