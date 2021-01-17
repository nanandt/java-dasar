package com.tutorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    System.out.print("Masukan nilai : ");
    int nilai = userInput.nextInt();
    System.out.println("nilai anda adalah = " +nilai);

    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
    System.out.println("jumlah parameter = " +jumlah);

    System.out.print("\n");

    int faktorial = hitungFaktorial(nilai);
    System.out.println("jumlah faktorial = " +faktorial);



  }

  // fungsi rekursif sederhana
  private static int hitungFaktorial(int parameter){
    System.out.println("faktorial = " +parameter);
    if(parameter == 1){
      return parameter;
    }
    return parameter * hitungFaktorial(parameter-1);
  }


  private static int jumlahNilai(int parameter){
    System.out.println("parameter = " +parameter);
    if(parameter == 0){
      return parameter;
    }
    return parameter + jumlahNilai(parameter-1);
  }

  private static void printNilai(int parameter){
    System.out.println("nilai = " +parameter);
    if(parameter == 0){
      return;
    }
    parameter--;
    printNilai(parameter);

  }
}
