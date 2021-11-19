package com.sda.recapFinalExercises.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Pocket pocket = new Pocket(100);
        System.out.println(pocket.getMoney());

       pocket.setMoney(-1);
        System.out.println(pocket.getMoney());

        pocket.setMoney(3100);
        System.out.println(pocket.getMoney());

    }
}
