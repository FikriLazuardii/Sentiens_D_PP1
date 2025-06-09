package main;

import entity.*;
import service.PengirimanQueue;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {

        //Input Data Petugas
        System.out.println("MULAI BEKERJA!");
        String idPetugas = InputUtil.inputString("Masukkan ID Petugas: ");
        String namaPetugas = InputUtil.inputString("Masukkan Nama: ");
        Petugas petugasAktif = new Petugas(idPetugas, namaPetugas);

        // Inisialisasi antrian dengan kapasitas tertentu
        int kapasitas = InputUtil.inputInteger("Masukkan kapasitas maksimum antrian: ");
        PengirimanQueue queue = new PengirimanQueue(kapasitas);

        // === MENU ===
        while (true) {
            System.out.println("\n===== MENU ANTRIAN PENGIRIMAN =====");
            System.out.println("1. Tambah Pengiriman");
            System.out.println("2. Proses Pengiriman");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Tampilkan Semua Antrian");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("0. Keluar");

            int pilih = InputUtil.inputInteger("Pilih menu: ");

            switch (pilih) {
                case 1 -> {
                    // Input data pelanggan
                    Pelanggan pelanggan = new Pelanggan(
                        InputUtil.inputString("ID Pelanggan: "),
                        InputUtil.inputString("Nama Pelanggan: "),
                        InputUtil.inputString("Alamat: "),
                        InputUtil.inputString("No Telepon: ")
                    );

                    // Input data barang dan penerima
                    Barang barang = new Barang(
                        InputUtil.inputString("Nama Penerima: "),
                        InputUtil.inputString("Alamat Penerima: "),
                        InputUtil.inputString("No Telepon Penerima: "),
                        InputUtil.inputString("Kode Barang: "),
                        InputUtil.inputString("Nama Barang: "),
                        InputUtil.inputDouble("Berat Barang (kg): ")
                    );

                    // Buat dan tambahkan ke antrian pengiriman
                    AntrianPengiriman antrian = new AntrianPengiriman(pelanggan, barang, petugasAktif);
                    queue.enqueue(antrian);
                }

                case 2 -> queue.dequeue(); // Proses pengiriman (hapus antrian terdepan)

                case 3 -> {
                    // Lihat antrian terdepan
                    AntrianPengiriman depan = queue.peek();
                    if (depan != null) {
                        System.out.println("\nAntrian Terdepan:" + depan);
                    } else {
                        System.out.println("Antrian kosong");
                    }
                }

                case 4 -> queue.display(); // Tampilkan seluruh antrian

                case 5 -> queue.clear(); // Kosongkan antrian

                case 0 -> {
                    System.out.println("Keluar dari sistem");
                    return;
                }

                default -> System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
