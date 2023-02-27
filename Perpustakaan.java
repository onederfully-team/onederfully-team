import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    static ArrayList<String> buku = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n\n----- Perpustakaan -----");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Lihat Daftar Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    hapusBuku();
                    break;
                case 3:
                    lihatBuku();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        buku.add(judul);
        System.out.println("Buku berhasil ditambahkan.");
    }

    static void hapusBuku() {
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        String judul = scanner.nextLine();
        boolean hasil = buku.remove(judul);
        if (hasil) {
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    static void lihatBuku() {
        if (buku.size() > 0) {
            System.out.println("\nDaftar Buku:");
            for (int i = 0; i < buku.size(); i++) {
                System.out.println((i+1) + ". " + buku.get(i));
            }
        } else {
            System.out.println("Tidak ada buku dalam daftar.");
        }
    }
}