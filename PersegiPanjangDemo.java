import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPersegiPanjang;

        // Meminta pengguna untuk memasukkan jumlah persegi panjang
        System.out.print("Masukkan jumlah persegi panjang: ");
        jumlahPersegiPanjang = sc.nextInt();

        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegiPanjang];
        int panjang, lebar;

             // arrayOfPersegiPanjang[i] = new PersegiPanjang();
        // System.out.println("Persegi panjang ke-" + (i + 1));
        // System.out.print("Masukkan panjang: ");
        // arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        // System.out.print("Masukkan lebar: ");    
        // arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    

        // Mengisi array dengan objek PersegiPanjang dari input pengguna
        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        // Menampilkan informasi persegi panjang, termasuk luas dan keliling
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            System.out.println("\nPersegi panjang ke-" + (i + 1));
            System.out.println("Panjang: " + arrayOfPersegiPanjang[i].panjang);
            System.out.println("Lebar: " + arrayOfPersegiPanjang[i].lebar);
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }
    }
}
