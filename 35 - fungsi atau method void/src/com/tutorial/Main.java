package com.tutorial;

public class Main {
  public static void main(String[] args) {

    // void adalah tipe data yg hampa

    System.out.println(simple());

    fungsiVoid("apapun");

    selamatPagi("rizky");

  }

  private static void selamatPagi(String nama){
    System.out.println("selamat siang " + nama);
  }


  // fungsi atau method tanpa kembalian
  private static void fungsiVoid(String input){
    System.out.println(input);
  }




  // fungsi atau method dengan kembalian
  //shg menggunakan return untuk
  //mengembalikan nilai (10.0f)
  private static float simple(){
    return 10.0f;
  }
}
