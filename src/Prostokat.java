package com.company;

import java.util.Scanner;

public class Prostokat implements Figura{
    private double a;
    private double b;

    public void Pobierz_Dane() {
        Scanner Dane = new Scanner(System.in);
        System.out.print("Podaj długość boku:");
        a = Dane.nextDouble();
        System.out.print("Podaj długość drugiego boku:");
        b = Dane.nextDouble();
    }

    public double Obwod() {
        return 2 * a + 2 * b;
    }

    public double Pole() {
        return a * b;
    }
}
