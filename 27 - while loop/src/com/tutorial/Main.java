package com.tutorial;

public class Main {
  public static void main(String[] args) {


//    while(kondisi) {
//      aksi
//    }
    int a = 0;
    boolean kondisi = true;

    System.out.println("awal progam");


    while(kondisi) {
      System.out.println("while loop ke-" + a);
//      a++;
      if(a == 10){
        kondisi = false;
      }
      a++;
    }
    System.out.println("akhir progam");
  }
}
