import java.util.ArrayList;
import java.time.LocalDate;

public class Peminjaman {
    private Anggota anggota;          
    private ArrayList<Buku> bukuList;
    private LocalDate tanggalPinjam;
    private static final int MAX_BUKU = 5;

    public Peminjaman(Anggota anggota, LocalDate tanggalPinjam) {
        this.anggota = anggota;
        this.tanggalPinjam = tanggalPinjam;
        this.bukuList = new ArrayList<>();
        anggota.tambahPeminjaman(this);
    }

    public boolean tambahBuku(Buku buku) {
        if (bukuList.size() < MAX_BUKU) {
            bukuList.add(buku);
            return true;
        }
        return false;
    }

    public boolean hapusBuku(Buku buku) {
        return bukuList.remove(buku);
    }

    // Getter dan Setter
    public Anggota getAnggota() { return anggota; }
    public void setAnggota(Anggota anggota) { this.anggota = anggota; }
    
    public ArrayList<Buku> getBukuList() { return bukuList; }
    
    public LocalDate getTanggalPinjam() { return tanggalPinjam; }
    public void setTanggalPinjam(LocalDate tanggalPinjam) { this.tanggalPinjam = tanggalPinjam; }
    
    public int getJumlahBuku() { return bukuList.size(); }
    public static int getMaxBuku() { return MAX_BUKU; }

    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Peminjaman pada: ").append(tanggalPinjam)
            .append("\nAnggota: ").append(anggota.getName())
            .append("\nBuku yang dipinjam (").append(bukuList.size()).append("):\n");
        
        for (Buku buku : bukuList) {
            info.append("- ").append(buku.getJudul()).append("\n");
        }
        
        return info.toString();
    }
}