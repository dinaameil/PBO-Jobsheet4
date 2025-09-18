import java.util.ArrayList;

public class Anggota {
    private String name;
    private String alamat;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String name, String alamat) {
        this.name = name;
        this.alamat = alamat;
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    
    public ArrayList<Peminjaman> getRiwayatPeminjaman() { return riwayatPeminjaman; }
    
    public void tambahPeminjaman(Peminjaman peminjaman) {
        riwayatPeminjaman.add(peminjaman);
    }
    
    public String getInfo() {
        return "Anggota: " + name + ", Alamat: " + alamat;
    }
}