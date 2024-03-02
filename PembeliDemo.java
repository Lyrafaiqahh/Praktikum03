import java.util.Scanner;

public class PembeliDemo {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pembeli: ");
        int jumlahPembeli = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Pembeli[] pembeliArray = new Pembeli[jumlahPembeli];

        // Meminta input informasi untuk setiap pembeli
        for (int i = 0; i < jumlahPembeli; i++) {
            System.out.println("\nMasukkan informasi untuk pembeli ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Umur: ");
            int umur = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("Status: ");
            String status = scanner.nextLine();

            // Membuat objek Pembeli dan menyimpannya dalam array
            pembeliArray[i] = new Pembeli(nama, umur, alamat, jenisKelamin, status);
        }

        // Menampilkan informasi setiap pembeli
        System.out.println("\nInformasi Pembeli:");
        for (int i = 0; i < jumlahPembeli; i++) {
            System.out.println("Data Pembeli ke-" + (i + 1) + ":");
            pembeliArray[i].displayInfo();
        }
    }
}


