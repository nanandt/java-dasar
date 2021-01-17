package com.tutorial;

public class Main {
  public static void main(String[] args) {
    // operator komparasi...akan mengasilkan nilai boolean

    int a,b;
    boolean hasilKomparasi;
    // operator equal atau persamaan
    System.out.println("==========PERSAMAAN=========");
    a = 10;
    b = 10;
    hasilKomparasi = (a == b);
    System.out.printf("%d == %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a == b);
    System.out.printf("%d == %d ==> %s \n", a,b, hasilKomparasi);


    // operator not equal atau pertidaksamaan
    System.out.println("==========PERTIDAKSAMAAN=========");
    a = 10;
    b = 10;
    hasilKomparasi = (a != b);
    System.out.printf("%d != %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a != b);
    System.out.printf("%d != %d ==> %s \n", a,b, hasilKomparasi);

    // operator less than atau kurangdari
    System.out.println("==========KURANG DARI=========");
    a = 9;
    b = 10;
    hasilKomparasi = (a < b);
    System.out.printf("%d < %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a < b);
    System.out.printf("%d < %d ==> %s \n", a,b, hasilKomparasi);

    // operator greater than atau lebihdari
    System.out.println("==========LEBIH DARI=========");
    a = 9;
    b = 10;
    hasilKomparasi = (a > b);
    System.out.printf("%d > %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a > b);
    System.out.printf("%d > %d ==> %s \n", a,b, hasilKomparasi);

    // operator less than equal atau kurangdari sama dengan
    System.out.println("==========KURANG DARI SAMA DENGAN=========");
    a = 9;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d <= %d ==> %s \n", a,b, hasilKomparasi);

    a = 10;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d <= %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d <= %d ==> %s \n", a,b, hasilKomparasi);

    // operator greater than equal atau lebihdari
    System.out.println("==========LEBIH DARI SAMA DENGAN=========");
    a = 9;
    b = 10;
    hasilKomparasi = (a >= b);
    System.out.printf("%d >= %d ==> %s \n", a,b, hasilKomparasi);

    a = 10;
    b = 10;
    hasilKomparasi = (a <= b);
    System.out.printf("%d <= %d ==> %s \n", a,b, hasilKomparasi);

    a = 12;
    b = 10;
    hasilKomparasi = (a > b);
    System.out.printf("%d > %d ==> %s \n", a,b, hasilKomparasi);

  }
}
