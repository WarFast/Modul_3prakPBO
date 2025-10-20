package Model;

public class Helikopter extends Kendaraan {
    public Helikopter(int kapasitasorang, String nama, int jumlahroda, BahanBakar bahanbakar) {
        super(kapasitasorang, nama, jumlahroda, bahanbakar);
    }
    @Override
    public String getDetails() {
        return "Helikopter";
    }
}
