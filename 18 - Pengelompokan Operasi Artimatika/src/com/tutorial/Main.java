package com.tutorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // perkalian dan pembagian akan dikerjakan dahulu

    int hasil = 5 * 10 / 2;
    System.out.println(hasil);
    hasil = 5 + 2 - 10;
    System.out.println(hasil);

    // menggunakan pengelompokan dengan ()
    hasil = 5 * (2 + 10);
    System.out.println(hasil);

    Scanner userInput = new Scanner(System.in);
    // perhitungan persamaan kuadrat

    System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
    int m,x,c;

    System.out.print("nilai x = ");
    x = userInput.nextInt();
    System.out.print("Gradient m = ");
    m = userInput.nextInt();
    System.out.print("Bias c = ");
    c = userInput.nextInt();
    int y = (m*x*x) + c;

    System.out.println("Nilai y = " + y);



  }
}
