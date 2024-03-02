import java.util.Scanner;

public class AdminDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah admin: ");
        int jumlahAdmin = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Admin[] adminDemo = new Admin[jumlahAdmin];

        // Meminta input informasi untuk setiap admin
        for (int i = 0; i < jumlahAdmin; i++) {
            System.out.println("\nMasukkan informasi untuk admin ke-" + (i + 1) + ":");
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

            // Membuat objek Admin dan menyimpannya dalam array
            adminDemo[i] = new Admin(nama, umur, alamat, jenisKelamin, status);
        }

        // Menampilkan informasi setiap admin
        System.out.println("\nInformasi Admin:");
        for (int i = 0; i < jumlahAdmin; i++) {
            System.out.println("Data Admin ke-" + (i + 1) + ":");
            adminDemo[i].displayInfo();
        }
    }
}
