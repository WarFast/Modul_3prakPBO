package Model;

public class Pesawat extends Kendaraan implements Kargoable {
    private boolean isPesawatTempur ;
    public Pesawat(int kapasitasorang, String nama, int jumlahroda, BahanBakar bahanbakar, boolean isPesawatTempur) {
        super(kapasitasorang, nama, jumlahroda, bahanbakar);
    }

    public boolean isPesawatTempur() {
        return isPesawatTempur;
    }
    @Override
    public String Kargoable() {
        return "Kendaraan ini Kargoable";
    }
    @Override
    public String getDetails() {
        return "Pesawat (Tempur: " + (isPesawatTempur ? "Ya" : "Tidak") + ")";
    }
}
