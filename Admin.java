public class Admin {
    String nama;
    int umur;
    String alamat;
    String jenisKelamin;
    String status;

    public Admin(String nama, int umur, String alamat, String jenisKelamin, String status) {
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
}
