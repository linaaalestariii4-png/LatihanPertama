package com.mycompany.latihanpertama;

public class LatihanPertama {

    public static void main(String[] args) {

        System.out.println("NOMOR URUT BARANG 1 SAMPAI 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Barang ke-" + i);
        }

        System.out.println("\nNOMOR URUT BARANG 10 SAMPAI 1");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Barang ke-" + i);
        }
    }
}
