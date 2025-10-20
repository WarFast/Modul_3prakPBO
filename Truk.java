package Model;

public class Truk extends Kendaraan implements Kargoable{
  
    public Truk(int kapasitasorang, String nama, int jumlahroda, BahanBakar bahanbakar) {
        super(kapasitasorang, nama, jumlahroda, bahanbakar);
    }
     @Override
    public String Kargoable() {
        return "Kendaraan ini Kargoable";
    }
    @Override
    public String getDetails() {
        return "Truk";
    }
}
