package service;

import entity.AntrianPengiriman;

public class PengirimanQueue {
    // Array untuk menyimpan data antrian pengiriman
    private AntrianPengiriman[] array;

    // Indeks posisi awal (front) dan akhir (rear) dari antrian
    // Ukuran saat ini dari antrian dan kapasitas maksimum
    private int front, rear, size, capacity;

    // Konstruktor untuk menginisialisasi antrian
    public PengirimanQueue(int capacity) {
        this.capacity = capacity;
        this.array = new AntrianPengiriman[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Menambahkan data ke antrian (enqueue)
    public void enqueue(AntrianPengiriman data) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan data pengiriman.");
            return;
        }

        // Gunakan konsep circular array
        rear = (rear + 1) % capacity;
        array[rear] = data;
        size++;
        System.out.println("Pengiriman berhasil ditambahkan ke antrian.");
    }

    // Menghapus dan mengembalikan data dari antrian terdepan (dequeue)
    public AntrianPengiriman dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada data untuk diproses.");
            return null;
        }

        AntrianPengiriman removed = array[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Pengiriman diproses.");
        return removed;
    }

    // Melihat data pada antrian terdepan tanpa menghapusnya
    public AntrianPengiriman peek() {
        if (isEmpty()) {
            return null;
        }
        return array[front];
    }

    // Menampilkan seluruh isi antrian
    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("\n===== Daftar Antrian Pengiriman =====");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity; // Konsep circular
            System.out.println(array[index]);
        }
    }

    // Mengosongkan seluruh data dalam antrian
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }
}
