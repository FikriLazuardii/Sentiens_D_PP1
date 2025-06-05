package entity;

/**
 * Class Kurir merepresentasikan data seorang kurir dalam sistem pengiriman.
 * Termasuk ID, nama, dan nomor telepon kurir.
 */
public class Kurir {
    // Atribut untuk menyimpan ID unik kurir
    private String idKurir;

    // Atribut untuk menyimpan nama kurir
    private String nama;

    // Atribut baru untuk menyimpan nomor telepon kurir
    private String telepon;

    /**
     * Konstruktor untuk menginisialisasi objek Kurir dengan ID, nama, dan nomor telepon.
     *
     * @param idKurir ID unik kurir
     * @param nama Nama kurir
     * @param telepon Nomor telepon kurir
     */
    public Kurir(String idKurir, String nama, String telepon) {
        this.idKurir = idKurir;
        this.nama = nama;
        this.telepon = telepon;
    }

    /**
     * Mengembalikan representasi string dari objek Kurir,
     * menampilkan ID, nama, dan nomor telepon.
     */
    @Override
    public String toString() {
        return "[ID Kurir: " + idKurir + ", Nama: " + nama + ", Telepon: " + telepon + "]";
    }

    // Getter (opsional jika diperlukan untuk akses luar class)
    public String getIdKurir() {
        return idKurir;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    // Setter (opsional jika data bisa diubah setelah dibuat)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
}
