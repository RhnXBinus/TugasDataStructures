// Class Queue untuk mengelola antrian pelanggan (First-In, First-Out / FIFO)
public class Queue {
    private Node head;
    private Node tail;
    private int size;

    // Constructor mendefinisikan antrian kosong
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return head == null;
    }

    // Mengembalikan jumlah elemen dalam antrian
    public int size() {
        return size;
    }

    // Menambahkan pelanggan ke antrian (Enqueue)
    public boolean enqueue(String kode, String nama, double total) {
        // Memvalidasi jumlah data dalam antrian ≤ 5
        if (size >= 5) {
            System.out.println("Antrian penuh! Jumlah pelanggan dalam antrian maksimal 5.");
            return false;
        }

        Node baru = new Node(kode, nama, total);
        if (isEmpty()) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
        System.out.println("Data pelanggan ditambahkan ke antrian!");
        return true;
    }

    // Melayani / menghapus pelanggan dari depan antrian (Dequeue)
    public Node dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada pelanggan untuk dilayani.");
            return null;
        }

        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        temp.next = null; // Putuskan relasi
        size--;
        return temp;
    }

    // Menampilkan seluruh antrian pelanggan dari depan ke belakang
    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian saat ini kosong.");
            return;
        }

        System.out.println("\n===== DAFTAR ANTRIAN SAAT INI =====");
        Node temp = head;
        int no = 1;
        while (temp != null) {
            System.out.printf("%d. Nomor Antrian: %s | Nama: %s | Total Belanja: Rp %.0f\n", 
                no, temp.kode, temp.nama, temp.total);
            temp = temp.next;
            no++;
        }
        System.out.println("------------------------------------");
        System.out.println("Total pelanggan dalam antrian: " + size);
    }
}
