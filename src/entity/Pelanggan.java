package entity;

public class Pelanggan {
    private String id;
    private String nama;
    private String alamat;
    private String noTelepon;

  //Konstruktor
    public Pelanggan(String id, String nama, String alamat, String noTelepon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

  //Getter
    public String getId() { 
    	return id; 
    	}
    
    public String getNama() { 
    	return nama; 
    	}
    
    public String getAlamat() { 
    	return alamat; 
    	}
    
    public String getNoTelepon() { 
    	return noTelepon; 
    	}

    @Override
    public String toString() {
        return "Pelanggan{" +
                "ID='" + id + '\'' +
                ", Nama='" + nama + '\'' +
                ", Alamat='" + alamat + '\'' +
                ", No.Telepon='" + noTelepon + '\'' +
                '}';
    }
}
