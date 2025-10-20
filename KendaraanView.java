package View;
import java.lang.ModuleLayer.Controller;
import java.util.Scanner;
import Model.*;
import Controller.KendaraanController;
class CLIUtils {
  private static Scanner scanner;

  static {
    scanner = new Scanner(System.in);
  }

  public static int getInt() {
    return scanner.nextInt();
  }

  public static String getString() {
    return scanner.nextLine();
  }
  public static boolean getBoolean(){
    return scanner.nextBoolean();
  }

  public static int askForInt(String message) {
    System.out.println(message);
    return scanner.nextInt();
  }

  public static String askForString(String message) {
    System.out.println(message);
    return scanner.nextLine();
  }
  public static boolean askForBoolean(String message){
    System.out.println(message);
    return scanner.nextBoolean();
  }

}

public class KendaraanView {
private KendaraanController Controller;

    public KendaraanView(KendaraanController Controller) {
        this.Controller = Controller;
    }
  public void render() {
    this.printMenu();
    int menu = CLIUtils.getInt();
    while (menu != 0) {
      switch (menu) {
        case 1:
          this.handleTambahKendaraan();
          break;
        case 2:
          this.handlePrintKendaraan();
          break;
        case 3:
          this.handleSortKendaraan();
          break;
        case 0:
          return;
      }
      this.printMenu();
      menu = CLIUtils.getInt();
    }
  }

  private void printMenu() {
    System.out.println("Menu:");
    System.out.println("1. Tambah kendaraan");
    System.out.println("2. Tampilkan semua kendaraan");
    System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
    System.out.println("0. Keluar");
  }

  private void handleTambahKendaraan() {
    int tipe = 123;
    
    String nama = CLIUtils.askForString("Masukkan nama kendaraan: ");
    int kapasitasorang = CLIUtils.askForInt("Masukan kapasitas");
    int jumlahroda = CLIUtils.askForInt("masukan jumlahroda/balingbaling");
    switch (tipe) {
      case 1:
      System.out.println("bahan bakar 0.Bensin 1.Diesel 2. Avtur");
      int bahanbakarindex = CLIUtils.getInt();
        BahanBakar bahanbakar = BahanBakar.values()[bahanbakarindex - 1];
        jumlahroda = 4;
        Controller.tambahKendaraan(new Mobil(kapasitasorang, nama, jumlahroda, bahanbakar));
        break;
      case 2:
      bahanbakar = BahanBakar.values()[1];
        Controller.tambahKendaraan(new Truk(kapasitasorang, nama, jumlahroda, bahanbakar))
        break;
      case 3:
       bahanbakar = BahanBakar.values()[2];
       Controller.tambahKendaraan(new Helikopter(kapasitasorang, nama, jumlahroda, bahanbakar))
        break;
      case 4:
       bahanbakar = BahanBakar.values()[2];
       System.out.println("pesawat tempur atau bukan");
       boolean isPesawatTempur = CLIUtils.getBoolean();
       Controller.tambahKendaraan(new Pesawat(kapasitasorang, nama, jumlahroda, bahanbakar, isPesawatTempur))
        break;
    }
  }

  private void handlePrintKendaraan() {
    Controller.TampilkanSemua();
  }

  private void handleSortKendaraan() {
    Controller.SortKendaraan();
  }
  public static void main(String[] args) {
    Controller.KendaraanController Controller = new Controller.KendaraanController();
    KendaraanView view = new KendaraanView(Controller);
    view.render();
  }
}