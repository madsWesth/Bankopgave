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
        saldo =+ indsætAmount;
        return saldo;
    }

    public double hæv(double hævAmount) {
        if (hævAmount > saldo) {
            return -1;
        } else {
            saldo =- hævAmount;
            return saldo;
        }
    }

    public double overfør(double overførAmount, Konto konto) {
        double totalToSubtract;
        totalToSubtract = overførAmount + OVERFØRELSESGEBYR;

        saldo =- overførAmount;
        konto.saldo =+ overførAmount;
        saldo =- OVERFØRELSESGEBYR;
        return saldo;
    }
}