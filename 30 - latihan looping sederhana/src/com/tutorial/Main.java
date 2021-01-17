package com.tutorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //progam untuk menjumlahkan angka dengan rentan
    int nilaiAwal, nilaiAkhir, total;
    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukan Nilai Awal = ");
    nilaiAwal = inputUser.nextInt();

    System.out.print("Masukan Nilai Akhir = ");
    nilaiAkhir = inputUser.nextInt();

    total = 0;

//    while(nilaiAwal <= nilaiAkhir){
//      total = total + nilaiAwal;
//      System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//      nilaiAwal++;
//    }

//    menggunakan do while
//    do{
//      total = total + nilaiAwal;
//      System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
//      nilaiAwal++;
//    } while(nilaiAwal <= nilaiAkhir);

//    menggunakan for
    for(; nilaiAwal <= nilaiAkhir; nilaiAwal++){
      total = total + nilaiAwal;
      System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
    }

  }
}
