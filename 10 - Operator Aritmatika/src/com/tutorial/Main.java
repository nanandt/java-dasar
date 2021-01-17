package com.tutorial;

public class Main {
  public static void main(String[] args) {
    // Operator Artimatika
    int variabel1 = 13;
    int variabel2 = 5;

    int hasil;

    // 1. Penjumlahan
    hasil = variabel1 + variabel2;
    System.out.println(variabel1 + " + " + variabel2 + " = " + hasil );

    // 2. Pengurangan
    hasil = variabel1 - variabel2;
    System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);

    // 3. Perkalian
    hasil = variabel1 * variabel2;
    System.out.printf("%d x %d = %d \n",variabel1,variabel2,hasil);

    // 4. Pembagian
    hasil = variabel1 / variabel2;
    System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);

    float a = 6;
    float b = 5;

    float hasilFloat = a/b;
    System.out.println(a + " / " + b + " = " + hasilFloat);

    // 5. Modulus (sisa Pembagian)
    hasil = variabel1 % variabel2;
    System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);



  }
}
