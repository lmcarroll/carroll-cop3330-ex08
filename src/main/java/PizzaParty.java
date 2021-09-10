/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class PizzaParty {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        String NotInt = input.nextLine();
        int people = Integer.parseInt(NotInt);

        System.out.println("How many pizzas do you have?");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int pizzas = Integer.parseInt(NotInt);

        System.out.println("How many slices per pizza?");
        input = new Scanner(System.in);
        NotInt = input.nextLine();
        int SlicesPerPizza = Integer.parseInt(NotInt);

        int SliceTotal = SlicesPerPizza * pizzas;

        System.out.println(people + " people with " + pizzas + " pizzas (" + SliceTotal + " slices)");

        int PerPerson = SliceTotal / people;
        int LeftOver = SliceTotal % people;

        System.out.println("Each person gets " + PerPerson + " pieces of pizza.");
        System.out.println("There are " + LeftOver + " leftover pieces.");
    }
}
