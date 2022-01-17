package com.sda.recapFinalExercises.miniApp;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();

        Human boy = new Boy("Gigi", "boy", 11);

        System.out.println(boy);
        boy.methodAge();

        Human men = new Men("Bob", "men", 33);
        System.out.println(men);
        men.methodAge();

        System.out.println("xxx xxx xxx xxx xxx");

        human.addHumansInList(boy);
        human.addHumansInList(men);

    }
}
