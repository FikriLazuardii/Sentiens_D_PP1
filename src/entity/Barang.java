package TUBES;

public class Barang {
    private String namaPenerima;
    private String alamatPenerima;
    private String noTeleponPenerima;
    private String kodeBarang;
    private String namaBarang;
    private double berat;

    //Konstruktor
    public Barang(String namaPenerima, String alamatPenerima, String noTeleponPenerima, String kodeBarang, String namaBarang, double berat) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.berat = berat;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.noTeleponPenerima = noTeleponPenerima;
    }

    // Getter
    public String getNamaPenerima() { 
    	return namaPenerima; 
    	}
    
    public String getAlamatPenerima() { 
    	return alamatPenerima; 
    	}
    
    public String getNoTeleponPenerima() { 
    	return noTeleponPenerima; 
    	}
    
    public String getKodeBarang() { 
    	return kodeBarang; 
    	}
    
    public String getNamaBarang() { 
    	return namaBarang; 
    	}
    
    public double getBerat() { 
    	return berat; 
    	}

    @Override
    public String toString() {
        return "Barang{" +
                "Kode='" + kodeBarang + '\'' +
                ", Nama='" + namaBarang + '\'' +
                ", Berat=" + berat + " kg" +
                ", Nama Penerima='" + namaPenerima + '\'' +
                ", Alamat='" + alamatPenerima + '\'' +
                ", No. Telepon='" + noTeleponPenerima + '\'' +
                '}';
    }
}