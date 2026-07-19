import java.util.Scanner;

public class SoalLinkedList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList daftar = new LinkedList();

        int pilih;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    if (daftar.size() >= 5) {
                        System.out.println("Jumlah buku maksimal 5.");
                        break;
                    }

                    System.out.print("Masukkan Kode Buku : ");
                    String kode = input.nextLine();

                    if (kode.length() > 5) {
                        System.out.println("Kode buku maksimal 5 karakter!");
                        break;
                    }

                    System.out.print("Masukkan Judul Buku : ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Penulis : ");
                    String penulis = input.nextLine();

                    daftar.push(kode, judul, penulis);
                    break;

                case 2:
                    daftar.pop();
                    break;

                case 3:
                    System.out.print("Masukkan Kode Buku : ");
                    kode = input.nextLine();
                    daftar.cari(kode);
                    break;

                case 4:
                    daftar.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 5);

        input.close();
    }
}