package com.tutorial;

public class Main {
  public static void main(String[] args) {


      // Unary = Operasi yg dilakukan pada 1 variabel saja
      // Unary + dan -
      int angka = 1;
      System.out.printf("unary '-', %d menjadi %d \n",angka, -angka);
      System.out.printf("unary '+', %d menjadi %d \n",angka, +angka);

      // Unary Increment dan Decrement
      int angka2 = 10; // Increment
      angka2++;
      System.out.printf("Nilai dengan '++' menjadi = " + angka2 + "\n");

      int angka3 = 10; // Decrement
      angka3--;
      System.out.println("Nilai dengan '--' menjadi = " + angka3);

      int a = 5;
      System.out.printf("Nilai dengan hasil dari prefix menjadi = %d \n", ++a);

      int b = 5;
      System.out.printf("Nilai dengan hasil dari postfix menjadi = %d \n", b++);
      System.out.printf("Nilai dengan hasil dari postfix menjadi = %d \n", b);

      // Unary boolean dengan ! untuk negasi
      boolean harun = true;
      System.out.println("Nilai Boolean = " + harun);
      System.out.println("Nilai Boolean = " + !harun);


  }
}
