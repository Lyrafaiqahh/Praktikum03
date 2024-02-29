
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    // Constructor untuk inisialisasi panjang dan lebar
    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    // Method untuk menghitung luas persegi panjang
    public int hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
