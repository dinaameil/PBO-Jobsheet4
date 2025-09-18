import java.time.LocalDate;

public class PerpustakaanMain {
    public static void main(String[] args) {
        // Buat objek Anggota (exists independently)
        Anggota anggota1 = new Anggota("Budi", "Jl. Merdeka No. 1");
        
        // Buat objek Buku (exists independently)
        Buku buku1 = new Buku("Pemrograman Java", "John Doe", "12345");
        Buku buku2 = new Buku("Struktur Data", "Jane Smith", "67890");
        Buku buku3 = new Buku("Algoritma", "Alan Turing", "99999");

        // Buat Peminjaman (agregasi dengan Anggota, komposisi dengan Buku)
        Peminjaman pinjam1 = new Peminjaman(anggota1, LocalDate.now());
        pinjam1.tambahBuku(buku1);
        pinjam1.tambahBuku(buku2);
        pinjam1.tambahBuku(buku3);

        // Tampilkan info
        System.out.println(anggota1.getInfo());
        System.out.println("\n" + pinjam1.getInfo());
        
        // Tampilkan riwayat peminjaman anggota
        System.out.println("\nRiwayat Peminjaman:");
        for (Peminjaman p : anggota1.getRiwayatPeminjaman()) {
            System.out.println("- " + p.getTanggalPinjam() + " (" + p.getJumlahBuku() + " buku)");
        }
    }
}