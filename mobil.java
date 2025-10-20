package Model;

public class Mobil extends Kendaraan {
    public Mobil(int kapasitasorang, String nama, int jumlahroda, BahanBakar bahanbakar) {
        super(kapasitasorang, nama, jumlahroda, bahanbakar);
    }
    @Override
    public String getDetails() {
        return "Mobil";
    }
}
