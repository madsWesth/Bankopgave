package com.bankopgave;

public class Main {

    private static Object Konto;

    public static void main(String[] args) {
	// Bank with bank accounts

        Konto = new Konto(1, "Kasper", 1000);
        Konto = new Konto(2, "Mads", 800);
        Konto = new Konto(3, "Frederik", 250);
        System.out.println(Konto.toString());

    }
}
