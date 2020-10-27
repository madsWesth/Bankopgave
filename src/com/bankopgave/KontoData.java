package com.bankopgave;

public class Konto {

    private int kontonummer;
    private String ejernavn;
    private double saldo;

    Konto(int kontonummer, String ejernavn, double saldo) {
        this.kontonummer = kontonummer;
        this.ejernavn = ejernavn;
        this.saldo = saldo;
    }

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
}