import java.util.Scanner;

public class PersegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar;
        // myArrayOfPersegiPanjang[5]. panjang = 20;

        for (int i = 0; i < 3; i++) {
        System.out.println("Persegi panjang ke-" + (i + 1));
        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt();

        arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);
        }

        // arrayOfPersegiPanjang[i] = new PersegiPanjang();
        // System.out.println("Persegi panjang ke-" + (i + 1));
        // System.out.print("Masukkan panjang: ");
        // arrayOfPersegiPanjang[i].panjang = sc.nextInt();
        // System.out.print("Masukkan lebar: ");    
        // arrayOfPersegiPanjang[i].lebar = sc.nextInt();
    
        
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){
            System.out.print("\nPersegi panjang ke-" + (i + 1));
            arrayOfPersegiPanjang[i].cetakInfo();
        }

      
        
       
    }
}
