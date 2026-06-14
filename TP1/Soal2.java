
import java.util.Scanner;

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
}

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat 5 objek mahasiswa
        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Andi Saputra", "2440001", "Informatika", 3.75),
            new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 2.80),
            new Mahasiswa("Citra Lestari", "2440003", "Teknik Komputer", 3.90),
            new Mahasiswa("Dewi Anggraini", "2440004", "Informatika", 3.10),
            new Mahasiswa("Eko Pratama", "2440005", "Sistem Informasi", 2.95)
        };

        // Input NIM yang akan diupdate
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nimCari)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                mhs.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!\n");

                System.out.println("=== Data Mahasiswa ===");
                mhs.tampilkanInfo();
                mhs.cekKelulusan();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }

        input.close();
    }
}
