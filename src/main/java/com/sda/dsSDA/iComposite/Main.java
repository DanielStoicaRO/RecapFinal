package com.sda.dsSDA.iComposite;

public class Main {
    public static void main(String[] args) {


        Employee CEO = new Employee("John CEO", "Board", 15_000);

        Employee headOfSales = new Employee("Robert Sales Mini Manager", "Sales", 10_000);

        Employee sales1 = new Employee("Sluga Suprema", "SalesTeam", 7_000);

        //make hierarchy connections
        headOfSales.add(sales1);
        CEO.add(headOfSales);

        System.out.println(CEO);
        System.out.println(headOfSales);
        System.out.println(sales1);

    }
}
