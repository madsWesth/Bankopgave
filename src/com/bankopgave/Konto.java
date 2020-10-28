package com.bankopgave;

import java.util.ArrayList;

public class Konto{

    private int kontonummer;
    private String ejernavn;
    private double saldo;
    private final double OVERFØRELSESGEBYR = 5;

    Konto(int kontonummer, String ejernavn, double saldo) {
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = saldo;
    }

    ArrayList<Konto> konti = new ArrayList<>();

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getEjernavn() {
        return ejernavn;
    }

    public void setEjernavn(String ejernavn) {
        this.ejernavn = ejernavn;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double indsæt(double indsætAmount) {
        setSaldo(getSaldo() + indsætAmount);
        return getSaldo();
    }

    public double hæv(double hævAmount) {
        if (hævAmount > getSaldo()) {
            return -1;
        } else {
            setSaldo(getSaldo() - hævAmount);
            return getSaldo();
        }
    }

    public double overfør(double overførAmount, Konto targetKonto) {
        double totalToSubtract;
        totalToSubtract = overførAmount + OVERFØRELSESGEBYR;

        if (totalToSubtract > getSaldo()) {
            return -1;
        } else {
            //removes amount+fee from original account
            setSaldo(getSaldo() - totalToSubtract);
            //adds amount to target account
            targetKonto.setSaldo(targetKonto.getSaldo() + overførAmount);

            return getSaldo();
        }

    }
}