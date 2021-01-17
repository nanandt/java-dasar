package com.tutorial;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    // switch case

    String input;

    Scanner userInput = new Scanner(System.in);

    System.out.print("panggil nama: ");
    input = userInput.next();

    // ekspresinya berupa satuan (int, long, short, byte,) string dan enum

    switch(input){
      case "wahyu":
        System.out.println("saya wahyu hadir ndan");
        break;

      case "harun":
        System.out.println("saya harun hadir ndan");
        break;

      case "mulyadi":
        System.out.println("saya mulyadi hadir ndan");
        break;

      default:
        System.out.println(input + " tidak hadir ndan");
    }

    System.out.println("progam selesai");
  }
}
