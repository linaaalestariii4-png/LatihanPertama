package com.mycompany.latihanpertama;

public class LatihanKeempat {

    // Method untuk menampilkan daftar barang
    public static void tampilkanDaftarBarang(String namaBarang, int jumlahBeli) {

        System.out.println("DAFTAR BARANG YANG DIBELI");

        for (int i = 1; i <= jumlahBeli; i++) {
            System.out.println("Barang ke-" + i + ": " + namaBarang);
        }
    }

    public static void main(String[] args) {

        String namaBarang = "Buku Tulis";
        int jumlahBeli = 3;

        int hargaBarang = 5000;
        int totalHarga = hargaBarang * jumlahBeli;
        int uangBayar = 20000;

        System.out.println("PROGRAM PEMBELIAN BARANG");
        System.out.println("-------------------------");

        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Jumlah beli : " + jumlahBeli);
        System.out.println("Total harga : Rp" + totalHarga);
        System.out.println("Uang bayar  : Rp" + uangBayar);

        if (uangBayar >= totalHarga) {

            System.out.println("\nPembelian berhasil!");

            // Memanggil method daftar barang
            tampilkanDaftarBarang(namaBarang, jumlahBeli);

            int kembalian = uangBayar - totalHarga;

            System.out.println("Uang kembalian : Rp" + kembalian);

        } else {

            System.out.println("\nPembelian gagal!");
            System.out.println("Uang pembayaran tidak cukup.");
        }
    }
}
