package com.company;

public class Casino {

    @Workable
    public static int poker() {

        System.out.println("Poker playing!");

        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }

    @Workable
    public static int roulette() {
        System.out.println("Roulette playing!");
        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }

    @Workable
    public static int bandit() {
        System.out.println("Bandit playing!");
        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }

    @Workable
    public static int blackjack() {
        System.out.println("Blackjack playing!");
        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }

    @Workable
    public static int fortune() {
        System.out.println("Fortune playing!");
        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }

    @Workable
    public static int baccara() {
        System.out.println("Baccara playing!");
        int result = (int) (Math.random() * 500000);
        double winOrLose = Math.random();

        if (winOrLose > 0.5)
            System.out.println("You lost " + result + " dollars" + "\n");
        else
            System.out.println("You won " + result + " dollars" + "\n");

        return result;
    }
}
