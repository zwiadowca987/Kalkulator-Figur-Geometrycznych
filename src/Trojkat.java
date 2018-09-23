package com.company;

import java.util.Scanner;

public class Trojkat implements Figura{
    private double a;
    private double b;
    private double c;
    private double h;

    public void Pobierz_Dane() {
        Scanner Dane = new Scanner(System.in);
        System.out.print("Podaj długość boku a: ");
        a = Dane.nextDouble();
        System.out.print("Podaj długość boku b: ");
        b = Dane.nextDouble();
        System.out.print("Podaj długość boku c: ");
        c = Dane.nextDouble();
        System.out.print("Podaj długość wysokości: ");
        h = Dane.nextDouble();
    }

    public double Obwod() {
        return a + b + c;
    }

    public double Pole() {
        return a * h * 1/2;
    }
}
