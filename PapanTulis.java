public class PapanTulis {
    String spidol;
    String penghapus;
    String tinta;
    String tisu;

    public PapanTulis(String spidol, String penghapus, String tinta, String tisu) {
        this.spidol = spidol;
        this.penghapus = penghapus;
        this.tinta = tinta;
        this.tisu = tisu;
    }

    public void displayInfo() {
        System.out.println("Spidol: " + spidol);
        System.out.println("Penghapus: " + penghapus);
        System.out.println("Tinta: " + tinta);
        System.out.println("Tisu diperlukan: " + tisu);
    }
}


