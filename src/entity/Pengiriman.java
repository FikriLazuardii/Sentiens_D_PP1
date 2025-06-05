package entity;

import java.time.LocalDateTime;

/**
 * Class Pengiriman merepresentasikan data pengiriman barang kepada penerima.
 */
public class Pengiriman {
    private String resiPengiriman;      // ID unik pengiriman
    private String namaPenerima;      // Nama penerima barang
    private String alamat;            // Alamat tujuan pengiriman
    private String noHp;              // Nomor HP penerima
    private LocalDateTime waktuDaftar; // Waktu saat pengiriman didaftarkan

    /**
     * Konstruktor untuk membuat objek Pengiriman.
     * @param resiPengiriman ID unik pengiriman
     * @param namaPenerima Nama penerima
     * @param alamat Alamat tujuan
     * @param noHp Nomor HP penerima
     */
    public Pengiriman(String idPengiriman, String namaPenerima, String alamat, String noHp) {
        this.resiPengiriman = idPengiriman;
        this.namaPenerima = namaPenerima;
        this.alamat = alamat;
        this.noHp = noHp;
        this.waktuDaftar = LocalDateTime.now(); // Diisi otomatis saat objek dibuat
    }

    // Getter untuk ID Pengiriman
    public String getResiPengiriman() {
        return resiPengiriman;
    }

    // Setter untuk ID Pengiriman
    public void setResiPengiriman(String resiPengiriman) {
        this.resiPengiriman = resiPengiriman;
    }

    // Getter untuk Nama Penerima
    public String getNamaPenerima() {
        return namaPenerima;
    }

    // Setter untuk Nama Penerima
    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    // Getter untuk Alamat
    public String getAlamat() {
        return alamat;
    }

    // Setter untuk Alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter untuk Nomor HP
    public String getNoHp() {
        return noHp;
    }

    // Setter untuk Nomor HP
    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // Getter untuk Waktu Daftar (tidak ada setter karena otomatis)
    public LocalDateTime getWaktuDaftar() {
        return waktuDaftar;
    }

    /**
     * Representasi string dari objek Pengiriman.
     */
    @Override
    public String toString() {
        return "[ID: " + resiPengiriman +
               ", Nama: " + namaPenerima +
               ", Alamat: " + alamat +
               ", No HP: " + noHp +
               ", Daftar: " + waktuDaftar + "]";
    }
}
