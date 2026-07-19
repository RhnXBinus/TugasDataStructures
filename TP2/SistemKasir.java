import java.util.Scanner;

// Class utama Sistem Kasir Toko
public class SistemKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue antrian = new Queue();  // Inisialisasi Queue untuk antrian pelanggan
        Stack riwayat = new Stack();  // Inisialisasi Stack untuk riwayat transaksi

        int pilih = 0;

        // Loop menu program
        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilih = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Harap masukkan angka 1-5.");
                continue;
            }

            switch (pilih) {
                case 1:
                    // Validasi batas jumlah antrian ≤ 5 pelanggan
                    if (antrian.size() >= 5) {
                        System.out.println("Antrian penuh! Maksimal 5 pelanggan dalam antrian.");
                        break;
                    }

                    System.out.println();
                    System.out.print("Masukkan Nomor Antrian: ");
                    String nomor = input.nextLine().trim();

                    System.out.print("Masukkan Nama Pelanggan: ");
                    String nama = input.nextLine().trim();

                    double total = 0;
                    System.out.print("Masukkan Total Belanja: ");
                    try {
                        total = Double.parseDouble(input.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Total belanja harus berupa angka!");
                        break;
                    }

                    // Enqueue ke antrian
                    antrian.enqueue(nomor, nama, total);
                    break;

                case 2:
                    // Melayani pelanggan: Dequeue dari antrian, lalu Push ke Stack riwayat
                    System.out.println();
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada pelanggan dalam antrian!");
                        break;
                    }

                    Node dilayani = antrian.dequeue();
                    if (dilayani != null) {
                        System.out.println("Melayani pelanggan " + dilayani.kode + " (" + dilayani.nama + ")");
                        riwayat.push(dilayani);
                        System.out.println("Transaksi disimpan ke riwayat.");
                    }
                    break;

                case 3:
                    // Tampilkan antrian pelanggan saat ini (FIFO)
                    antrian.tampilAntrian();
                    break;

                case 4:
                    // Lihat riwayat transaksi dari terbaru ke lama (LIFO)
                    riwayat.tampilRiwayat();
                    break;

                case 5:
                    // Keluar program
                    System.out.println("\nTerima kasih telah menggunakan Sistem Kasir Toko.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak tersedia. Harap pilih 1 - 5.");
            }

        } while (pilih != 5);

        input.close();
    }
}
