package com.sayem.games;
import java.io.*;
import java.util.Scanner;

public class Guess
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String a[]) throws Exception
    {
        System.out.println("Welcome to the Guess project!");
        System.out.println("Raad een nummer tussen 1 en 5000");

        startGame();
    }

    public static void startGame()
    {
        int nummer, winnend, guess = 1;
        boolean win = false;

        winnend = (int) (Math.random() * 5000);


        while (!win) {

            System.out.print("\nGok Nummer: ");
            nummer =  scanner.nextInt();
            if (nummer < winnend)
                System.out.print("Het nummer is groter dan " + nummer);
            else if (nummer > winnend)
                System.out.print("Het nummer is kleiner dan " + nummer);
            else {
                System.out.print("Gefeliciteerd: je raadde dit in "+ guess +" beurten");
                win = true;
            }
            guess++;
        }
    }
}