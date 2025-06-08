package entity;

public class Petugas {
    private String id;
    private String nama;

  //Konstruktor
    public Petugas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    //Getter
    public String getId() {
    	return id; 
    	}
    
    public String getNama() { 
    	return nama; 
    	}

    @Override
    public String toString() {
        return "Petugas{" +
                "ID='" + id + '\'' +
                ", Nama='" + nama + '\'' +
                '}';
    }
}
