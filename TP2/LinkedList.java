// Class LinkedList
public class LinkedList {
    public Node head;

    // Tambah buku di akhir
    public void push(String kode, String judul, String penulis) {
        Node baru = new Node(kode, judul, penulis);

        if (head == null) {
            head = baru;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }

        System.out.println("Data berhasil ditambahkan!");
    }

    // Hapus buku terakhir
    public void pop() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }

        if (head.next == null) {
            head = null;
            System.out.println("Data terakhir berhasil dihapus.");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        System.out.println("Data terakhir berhasil dihapus.");
    }

    // Cari buku
    public void cari(String kode) {
        Node temp = head;

        while (temp != null) {
            if (temp.kodeBuku.equalsIgnoreCase(kode)) {
                System.out.println("\n=== Data Buku Ditemukan ===");
                System.out.println("Kode Buku : " + temp.kodeBuku);
                System.out.println("Judul     : " + temp.judul);
                System.out.println("Penulis   : " + temp.penulis);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Tampilkan semua buku
    public void tampil() {
        if (head == null) {
            System.out.println("Belum ada data buku.");
            return;
        }

        Node temp = head;
        int jumlah = 0;

        System.out.println("\n===== DAFTAR BUKU =====");

        while (temp != null) {
            System.out.println("Kode: " + temp.kodeBuku +
                    " | Judul: " + temp.judul +
                    " | Penulis: " + temp.penulis);

            jumlah++;
            temp = temp.next;
        }

        System.out.println("----------------------------");
        System.out.println("Total Buku : " + jumlah);
    }

    // Menghitung jumlah buku
    public int size() {
        Node temp = head;
        int jumlah = 0;

        while (temp != null) {
            jumlah++;
            temp = temp.next;
        }

        return jumlah;
    }
}
