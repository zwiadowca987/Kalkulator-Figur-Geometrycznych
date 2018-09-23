package com.company;

import java.util.Scanner;

public class Kwadrat implements Figura{
    private double a;

    public void Pobierz_Dane() {
        Scanner Dane = new Scanner(System.in);
        System.out.print("Podaj długość boku:");
        a = Dane.nextDouble();
    }

    public double Obwod() {
        return a * 4;
    }

    public double Pole() {
        return a * a;
    }
}
