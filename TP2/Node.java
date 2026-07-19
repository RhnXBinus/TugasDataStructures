// Class Node untuk menyimpan data pelanggan (Stack & Queue) maupun data buku (LinkedList)
public class Node {
    // Data Pelanggan Kasir
    public String kode; // Nomor Antrian / Kode Pelanggan
    public String nama; // Nama Pelanggan
    public double total; // Total Belanja

    // Data Buku (Kompatibilitas tugas sebelumnya)
    public String kodeBuku;
    public String judul;
    public String penulis;

    public Node next; // Pointer ke node berikutnya

    // Constructor untuk Data Pelanggan (Sistem Kasir Toko)
    public Node(String kode, String nama, double total) {
        this.kode = kode;
        this.nama = nama;
        this.total = total;
        this.next = null;
    }

    // Constructor untuk Data Buku (Kompatibilitas tugas sebelumnya)
    public Node(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }
}
