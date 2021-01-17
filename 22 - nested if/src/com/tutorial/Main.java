package com.tutorial;

public class Main {
  public static void main(String[] args) {

    // nested if

    int a = 5;
    int b = 50;
    int c = 2;

    System.out.println("ini adalah awal program");

    if(a == 6){
      System.out.println("aksi dimana a = 5");
    } else {
      if(b == 5){

        System.out.println("ini adalah aksi dimana b = 50");

      } else {
        if(c == 20){
          System.out.println("ini adalah aksi dimana c = 2");
        } else {
          System.out.println("ini adalah aksi diman c bukan 2");
        }
      }
    }

    System.out.println("ini adalah akhir program");


  }
}
