package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witam w kalkulatorze figur geometrycznych");
        System.out.println("Proszę wybrać podmenu:");
        System.out.println("1. Kwadrat");
        System.out.println("2. Prostokąt");
        System.out.println("3. Trójkąt");
        System.out.println("4. Trapez");

        Scanner Dane = new Scanner(System.in);
        int liczba = Dane.nextInt();
        System.out.println();

        switch(liczba){
            case 1: {
                Kwadrat k = new Kwadrat();
                k.Pobierz_Dane();

                System.out.println();
                System.out.println("Co mam liczyć?");
                System.out.println("1. Obwód");
                System.out.println("2. Pole");
                liczba = Dane.nextInt();

                if(liczba == 1) System.out.println(k.Obwod());
                else if(liczba == 2) System.out.println(k.Pole());
                else System.out.println("Nieobsługiwane polecenie ");
            } break;

            case 2: {
                Prostokat p = new Prostokat();
                p.Pobierz_Dane();

                System.out.println();
                System.out.println("Co mam liczyć?");
                System.out.println("1. Obwód");
                System.out.println("2. Pole");
                liczba = Dane.nextInt();

                if(liczba == 1) System.out.println(p.Obwod());
                else if(liczba == 2) System.out.println(p.Pole());
                else System.out.println("Nieobsługiwane polecenie ");
            } break;

            case 3: {
                Trojkat t = new Trojkat();
                t.Pobierz_Dane();

                System.out.println();
                System.out.println("Co mam liczyć?");
                System.out.println("1. Obwód");
                System.out.println("2. Pole");
                liczba = Dane.nextInt();

                if(liczba == 1) System.out.println(t.Obwod());
                else if(liczba == 2) System.out.println(t.Pole());
                else System.out.println("Nieobsługiwane polecenie ");
            } break;

            case 4: {
                Trapez t = new Trapez();
                t.Pobierz_Dane();

                System.out.println();
                System.out.println("Co mam liczyć?");
                System.out.println("1. Obwód");
                System.out.println("2. Pole");
                liczba = Dane.nextInt();

                if(liczba == 1) System.out.println(t.Obwod());
                else if(liczba == 2) System.out.println(t.Pole());
                else System.out.println("Nieobsługiwane polecenie ");
            } break;

            default: {
                System.out.println("Nieznana opcja");
            }
        }
    }
}
