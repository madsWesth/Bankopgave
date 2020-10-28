package com.bankopgave;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    @Test
    void indsæt() {
        double kontoSaldo;
        Konto konto = new Konto(1, "Joe Mama", 100.0);

        konto.indsæt(50.0);
        kontoSaldo = konto.getSaldo();

        assertEquals(150.0, kontoSaldo, 0.0001);
    }

    @Test
    void hæv() {
        double kontoSaldo;
        Konto konto = new Konto(1, "Joe Mama", 150.0);

        konto.hæv(50.0);
        kontoSaldo = konto.getSaldo();

        assertEquals(100.0, kontoSaldo, 0.0001);
    }

    @Test
    void overfør() {
        double kontoSaldo;
        double konto2Saldo;

        Konto konto = new Konto(1, "Joe Mama", 1000.0);
        Konto konto2 = new Konto(2, "Svend Bendt", 500.0);

        konto.overfør(200.0, konto2);

        kontoSaldo = konto.getSaldo();
        konto2Saldo = konto2.getSaldo();

        //795.0 cause we are transfering 200 and the fee is 5
        assertEquals(795.0, kontoSaldo, 0.0001);
        assertEquals(700.0, konto2Saldo, 0.0001);


        // checks for invalid transfer amounts larger than saldo
        double overførReturnValue;
        Konto konto3 = new Konto(3, "Svend Bendt", 10.0);

        overførReturnValue = (konto3.overfør(300.0, konto2));

        assertEquals(-1, overførReturnValue, 0.0001);
    }
}