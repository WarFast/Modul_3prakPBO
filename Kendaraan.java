package Model;

public abstract class Kendaraan {
    private BahanBakar bahanbakar;
    private int kapasitasorang;
    private String nama;
    private int jumlahroda;
    public Kendaraan(int kapasitasorang,String nama, int jumlahroda, BahanBakar bahanbakar){
        this.kapasitasorang = kapasitasorang;
        this.nama = nama;
        this.jumlahroda = jumlahroda;
        this.bahanbakar = bahanbakar;
    }
    public int getKapasitasOrang(){
        return kapasitasorang;
    }
    public String getNama(){
        return nama;
    }
    public int getJumlahRoda(){
        return jumlahroda;
    }
    public BahanBakar getBahanBakar(){
        return bahanbakar;
    }
    public abstract String getDetails();
}
