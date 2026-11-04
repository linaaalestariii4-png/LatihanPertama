package com.mycompany.latihanpertama;

public class LatihanKedua {

    public static void main(String[] args) {

        int stok = 5;

        System.out.println("SIMULASI STOK BARANG");
        System.out.println("--------------------");

        while (stok > 0) {

            stok--;

            System.out.println("Sisa stok barang: " + stok);
        }

        System.out.println("Stok habis");
    }
}
