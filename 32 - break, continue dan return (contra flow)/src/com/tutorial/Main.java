package com.tutorial;

public class Main {
  public static void main(String[] args) {

    // break, continue, dan return

    int a = 0;
    while(true){
      a++;
      if(a == 10){
        break;
        //keyword untk memaksa keluar dari loop
      } else if( a == 5){
        continue;
        // keyword untuk memulai aksi dari awal
      } else if(a == 7){
        return;
        // exit dari progam (dimanapun ada return maka progam tsb akan berhenti)
      }
      System.out.println("looping ke - " + a);
    }

    System.out.println("akhir dari looping");

  }
}
