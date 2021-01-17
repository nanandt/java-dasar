package com.tutorial;

public class Main {
  public static void main(String[] args) {

    // Konversi tipe data

    int nilaiInt = 256; // 32 bit
    System.out.println("Nilai Int = " + nilaiInt);

    // Memperluas rentan tipe data yg lebih besar
    long nilaiLong = nilaiInt;
    System.out.println("Nilai Long = " + nilaiLong);

    // Memperkecil rentang tipe data yg lebih kecil
    byte nilaiByte =  (byte) nilaiInt;
    System.out.println("Nilai Byte = " + nilaiByte);
    System.out.println("Nilai Max Byte = " + Byte.MAX_VALUE);
    System.out.println("Nilai Max Byte = " + Byte.MIN_VALUE);

    // Casting Pembagian
    float a = 10;
    int b = 4;

    float c = a/b;
    System.out.printf("%f / %d = %f \n",a,b,c);

    //

    int x = 10;
    int y = 4;

    float z = (float) x/y;
    System.out.printf("%d / %d = %f \n",x,y,z);
  }
}
