package com.mycompany.latihanpertama;

public class LatihanKetiga {

    // Method untuk menghitung uang kembalian
    public static int hitungKembalian(int uangBayar, int totalHarga) {

        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        int totalHarga = 25000;
        int uangBayar = 30000;

        System.out.println("PROGRAM PEMBAYARAN BARANG");
        System.out.println("--------------------------");

        System.out.println("Total harga : Rp" + totalHarga);
        System.out.println("Uang bayar  : Rp" + uangBayar);

        if (uangBayar >= totalHarga) {

            int kembalian = hitungKembalian(uangBayar, totalHarga);

            System.out.println("Pembayaran berhasil!");
            System.out.println("Uang kembalian : Rp" + kembalian);

        } else {

            System.out.println("Uang pembayaran tidak cukup!");
        }
    }
}
