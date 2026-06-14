
class Mahasiswa {

    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("IPK      : " + ipk);
        System.out.println("");
    }
}

public class Soal1 {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Andi Saputra", "2201001", "Informatika", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "2201002", "Sistem Informasi", 3.60);
        Mahasiswa mhs3 = new Mahasiswa("Citra Lestari", "2201003", "Teknik Komputer", 3.90);
        Mahasiswa mhs4 = new Mahasiswa("Dewi Anggraini", "2201004", "Informatika", 3.85);
        Mahasiswa mhs5 = new Mahasiswa("Eko Pratama", "2201005", "Sistem Informasi", 3.50);

        System.out.println("=== Data Mahasiswa ===");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        mhs4.tampilkanInfo();
        mhs5.tampilkanInfo();
    }
}
