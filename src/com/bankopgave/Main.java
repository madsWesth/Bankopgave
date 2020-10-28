package com.bankopgave;

public class Main {

    public static void main(String[] args) {
	// Bank with bank accounts

        Konto Kasper = new Konto(1, "Kasper", 1000);
        Konto Mads = new Konto(2, "Mads", 800);
        Konto Frederik = new Konto(3, "Frederik", 250);
        System.out.println(Kasper.toString());
        System.out.println(Mads.toString());
        System.out.println(Frederik.toString());

    }
}
