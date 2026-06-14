

class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Tampilkan data mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    // Cek kelulusan
    public void cekKelulusan() {
        if (ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    // Method untuk menentukan predikat akademik
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }
}

public class Soal3 {

    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Andi Saputra", "2440001", "Informatika", 3.75),
            new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 2.80),
            new Mahasiswa("Citra Lestari", "2440003", "Teknik Komputer", 3.90),
            new Mahasiswa("Dewi Anggraini", "2440004", "Informatika", 3.10),
            new Mahasiswa("Eko Pratama", "2440005", "Sistem Informasi", 2.95)
        };
        System.out.println("=== Data Mahasiswa ===");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanInfo();
            mhs.cekKelulusan();
            System.out.println("Predikat : " + mhs.hitungPredikat());
            System.out.println("");
        }
    }
}
