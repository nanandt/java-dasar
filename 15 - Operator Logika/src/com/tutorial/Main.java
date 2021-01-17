package com.tutorial;


public class Main {
  public static void main(String[] args) {
    // Operator Logika --> operasi yg kita lakukan kepada tipe data boolean
    // OR, AND, XOR, Negasi

    boolean a,b,c;

    // OR / atau (||) menggunakan operasi +
    System.out.println("=== OR (||) ===");
    a = false;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    a = false;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    a = true;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    a = true;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);

    System.out.print("\n");

    // AND / dan (&&) menggunakan operasi x
    System.out.println("=== AND (&&) ===");
    a = false;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    a = false;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    a = true;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    a = true;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);

    System.out.print("\n");

    // XOR / exlusive or (^) berguna ketika menggukanakan switch case
    System.out.println("=== XOR (^) ===");
    a = false;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

    a = false;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

    a = true;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

    a = true;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);

    //NOT / negasi --> flipping (!)
    System.out.println("=== NEGASI (!) ===");
    a = true;
    c = !a;
    System.out.println(a + " --> (!) = " + c);

    System.out.println("=== NEGASI (!) ===");
    a = false;
    c = !a;
    System.out.println(a + " --> (!) = " + c);

  }
}
