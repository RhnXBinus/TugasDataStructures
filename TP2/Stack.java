// Class Stack untuk mengelola riwayat transaksi pelanggan (Last-In, First-Out / LIFO)
public class Stack {
    private Node top;
    private int size;

    // Constructor mendefinisikan stack kosong
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == null;
    }

    // Mengembalikan jumlah transaksi dalam stack
    public int size() {
        return size;
    }

    // Menambahkan transaksi baru ke bagian atas stack (Push)
    public void push(String kode, String nama, double total) {
        Node baru = new Node(kode, nama, total);
        baru.next = top;
        top = baru;
        size++;
    }

    // Overload push untuk menerima objek Node dari dequeue Queue
    public void push(Node node) {
        if (node == null) return;
        node.next = top;
        top = node;
        size++;
    }

    // Menghapus dan mengembalikan transaksi terbaru (Pop)
    public Node pop() {
        if (isEmpty()) {
            System.out.println("Riwayat transaksi kosong.");
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        size--;
        return temp;
    }

    // Menampilkan seluruh riwayat transaksi dari yang terbaru ke yang terlama
    public void tampilRiwayat() {
        if (isEmpty()) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }

        System.out.println("\n===== RIWAYAT TRANSAKSI (Terbaru -> Terlama) =====");
        Node temp = top;
        int no = 1;
        while (temp != null) {
            System.out.printf("%d. Nomor Antrian: %s | Nama: %s | Total Belanja: Rp %.0f\n", 
                no, temp.kode, temp.nama, temp.total);
            temp = temp.next;
            no++;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Total Transaksi Selesai: " + size);
    }
}
