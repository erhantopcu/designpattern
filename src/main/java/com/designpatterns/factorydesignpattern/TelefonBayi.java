package com.designpatterns.factorydesignpattern;

import java.net.SocketOption;

public class TelefonBayi {
    public static  void main(String[] args){
        Telefon S8 = TelefonFabrikasi.getTelefon("S8",  "2600mah", 4, 7);
        Telefon Note8 = TelefonFabrikasi.getTelefon("Note8", "3600mah", 5, 8);
        System.out.println("S8 için:");
        System.out.println(S8);
        System.out.println("Note8 için:");
        System.out.println(Note8);
    }
}
