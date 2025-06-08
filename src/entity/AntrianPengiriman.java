package entity;

import java.time.LocalDateTime;

public class AntrianPengiriman {
    private Pelanggan pelanggan;
    private Barang barang;
    private Petugas petugas;
    private LocalDateTime waktuMasuk;

  //Konstruktor
    public AntrianPengiriman(Pelanggan pelanggan, Barang barang, Petugas petugas) {
        this.pelanggan = pelanggan;
        this.barang = barang;
        this.petugas = petugas;
        this.waktuMasuk = LocalDateTime.now();
    }

    //Getters
    public Pelanggan getPelanggan() { 
    	return pelanggan; 
    	}
    
    public Barang getBarang() { 
    	return barang; 
    	}
    
    public Petugas getPetugas() { 
    	return petugas; 
    	}
    
    public LocalDateTime getWaktuMasuk() { 
    	return waktuMasuk; 
    	}

    @Override
    public String toString() {
        return "\n--- Antrian Pengiriman ---" +
        		"\nID Pengirim  : " + pelanggan.getId() +
                "\nNama Pengirim  : " + pelanggan.getNama() +
                "\nNo Telepon     : " + pelanggan.getNoTelepon() +
                "\nKode Barang    : " + barang.getKodeBarang() +
                "\nNama Barang    : " + barang.getNamaBarang() +
                "\nBerat Barang   : " + barang.getBerat() + " kg" +
                "\nWaktu Masuk    : " + waktuMasuk;
    }
}