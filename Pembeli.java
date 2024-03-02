public class Pembeli {
    String nama;
    int umur;
    String alamat;
    String jenisKelamin;
    String status;

    public Pembeli(String nama, int umur, String alamat, String jenisKelamin, String status) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Status: " + status);
    }

    public void fiturPembayaran() {
        // Implementasi fitur pembayaran
        System.out.println("Melakukan pembayaran...");
    }

    public void tampilkanRingkasanPembelian() {
        // Implementasi fitur tampilkan ringkasan pembelian
        System.out.println("Menampilkan ringkasan pembelian...");
    }

    public double hitungDiskon(double totalPembelian) {
        // Implementasi fitur hitung diskon
        double diskon = 0.0;
        // Logika perhitungan diskon
        return diskon;
    }
}


