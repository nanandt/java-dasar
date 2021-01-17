package com.tutorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //menghitung nilai deret fibonacci ke-n

    int f_n, f_n_1, f_n_2, n;
    Scanner inputUser = new Scanner(System.in);
//    System.out.print("masukan tinggi : ");
    System.out.print("mengambil nilai fibonacci ke - : ");
    n = inputUser.nextInt();
//
    f_n_2 = 0;
    f_n_1 = 1;
    f_n = 1;

//    int i = 1;

//    menggunakan for
    for (int i = 0; i <= n; i++){
      System.out.println("nilai ke - " + i + " adalah " + f_n);
      f_n = f_n_1 + f_n_2;
      f_n_2 = f_n_1;
      f_n_1 = f_n;
    }

//    menggunakan while
//    while(i <= n){
//      System.out.println("nilai ke - " + i + " adalah " + f_n);
//      f_n = f_n_1 + f_n_2;
//      f_n_2 = f_n_1;
//      f_n_1 = f_n;
//      i++;
//    }
//      menggunakan do while
//    do{
//      f_n = f_n_1 + f_n_2;
//      f_n_2 = f_n_1;
//      f_n_1 = f_n;
//      System.out.println("nilai ke - " + i + " adalah " + f_n);
//      i++;
//    } while( i<= n);

//    looping piramid
//    for(int t=0; t<tinggi; t++){
//      for(int s=0; s<tinggi; s++){
//        System.out.print("");
//      }
//      for(int b=0; b<=t; b++){
//        System.out.print("*");
//      }
//      System.out.println();
//    }

  }
}
