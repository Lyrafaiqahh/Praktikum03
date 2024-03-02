import java.util.Scanner;

public class PapanTulisDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String spidol, penghapus, tinta, tisu;

        System.out.print("Masukkan jumlah papan tulis: ");
        int jumlahPapanTulis = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PapanTulis[] papanTulisArray = new PapanTulis[jumlahPapanTulis];

        // Meminta input informasi untuk setiap papan tulis
        for (int i = 0; i < jumlahPapanTulis; i++) {
            System.out.println("\nMasukkan informasi untuk papan tulis ke-" + (i + 1) + ":");
            System.out.print("Spidol (hitam / biru): ");
            spidol = scanner.nextLine();
            System.out.print("Penghapus (kayu/plastik): ");
            penghapus = scanner.nextLine();
            System.out.print("Tinta (hitam/biru): ");
            tinta = scanner.nextLine();
            System.out.print("Tisu diperlukan? (iya/tidak): ");
            tisu = scanner.nextLine();

            // Membuat objek PapanTulis dan menyimpannya dalam array
            papanTulisArray[i] = new PapanTulis(spidol, penghapus, tinta, tisu);
        }

        // Menampilkan informasi setiap papan tulis
        System.out.println("\nInformasi Papan Tulis:");
        for (int i = 0; i < jumlahPapanTulis; i++) {
            System.out.println("Data Papan Tulis ke-" + (i + 1) + ":");
            papanTulisArray[i].displayInfo();
        }
    }
}
