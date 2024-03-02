import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Looping untuk meminta informasi dan membuat objek Mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan informasi mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine();

            Mahasiswa mahasiswaBaru = new Mahasiswa(nama, nim, jenisKelamin, ipk);
            daftarMahasiswa.add(mahasiswaBaru);
        }

        // Mencetak informasi mahasiswa dengan nomor urut
        System.out.println();
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mahasiswa = daftarMahasiswa.get(i);
            System.out.println("Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + mahasiswa.nama + "\nNIM: " + mahasiswa.nim + "\nJenis Kelamin: " +
                    mahasiswa.jenisKelamin + "\nIPK: " + mahasiswa.ipk);
        }

        // Menghitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.ipk;
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        // Menampilkan rata-rata IPK
        System.out.printf("\nRata-rata IPK: %.2f", rataRataIpk);
    }
}
