import java.util.*;

enum bahan {
    Besi, Kayu, Plastik
}

abstract class Furniture {
    protected String bahanutama;
    protected int berat;

    public abstract String getNamaProduk();

     public String printdata(){
        return getNamaProduk() + bahanutama + berat;
    }

    
}

class kursi extends Furniture {
    protected boolean adaSandaran;

    public kursi(String bahanutama, int berat, boolean adaSandaran) {
        super(bahanutama, berat);
        this.adaSandaran = adaSandaran;
    }
  @Override
    public String getNamaProduk() {
        return "kursi";
    }
   @Override
    public String printdata() {
        return "Type: kursi\n" + super.printdata();
   }
}

class Meja extends Furniture {
protected int jumlahlaci;
public Meja (String bahanutama, int berat, int jumlahlaci){
        super(bahanutama, berat);
        this.jumlahlaci = jumlahlaci;
}
  @Override
    public String getNamaProduk(){
        return "Meja";
    }
          @Override
    public String printdata() {
        return "Type: Meja\n" + super.printdata();
   }
}

class MejaLipat extends Furniture {
public MejaLipat(String bahanutama, int berat){
    super(bahanutama, berat);
}
      @Override
    public String getNamaProduk(){
        return "MejaLipat";
    }
     @Override
    public String printdata() {
        return "Type: MejaLipat\n" + super.printdata();
   }
    
}

class Sofa extends Furniture {
    
protected int jumlahdudukan;
public Sofa (String bahanutama, int berat, int jumlahdudukan){
    super(bahanutama ,berat);
    this.jumlahdudukan = jumlahdudukan;
}
      @Override
    public String getNamaProduk(){
        return "Sofa";
    }
    @Override
     public String printdata() {
        return "Type: MejaLipat\n" + super.printdata();
   }
}

public class FurniturView {
    Furniture[]list = new Furniture[10];
Scanner scan = new Scanner(System.in);
    public void render() {
        int menu = this.getMenuInput();
        int berat = 0;
        int tipe = 0;
        int count = 0;
        while (menu != 0) {
            // this.handleMenu(menu);
            menu = this.getMenuInput();
            if (menu == 1) {
                if (count == 10) {
                    break;
                }
                int furnitur = this.getMenuFurnitur();
                furnitur = this.getMenuFurnitur();
                System.out.println("masukan berat:");
                berat = scan.nextInt();
                System.out.println("masukan tipe");
                tipe = scan.nextInt();
                String bahanutama = "";
                if (tipe == 1) {
                    bahanutama = bahan.Plastik;
                }
                if (tipe == 2) {
                    bahanutama = bahan.Kayu;
                }
                if (tipe == 3) {
                    bahanutama = bahan.Besi;
                }
                if (furnitur == 1) {
                    System.out.println("masukan jumlah laci");
                    int laci = scan.nextInt();
                    list[count++] = new Meja(bahanutama,berat,laci);
                }
                 else if (furnitur == 2) {
                    System.out.println("ada sandaran?");
                    boolean sandaran = scan.nextBoolean();
                    list [count++] = new kursi(bahanutama,berat,sandaran);
                }
                 else if (furnitur == 3) {
                    list [count++] = new MejaLipat(bahanutama,berat);
                }
                 if (furnitur == 4) {
                    System.out.println("masukan jumlah dudukan");
                    int dudukan = scan.nextInt();
                    list [count++] = new Meja(bahanutama,berat,dudukan);
                }
            }
            if (menu == 2) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i+1);
                }
            }
        }
    }

    private int getMenuInput() {
        System.out.println("Menu:");
        System.out.println("1. Tambah furnitur");
        System.out.println("2. Tampilkan semua");
        System.out.println("0. Keluar");
        System.out.print("Pilihanmu: ");
        return CLIUtil.getInt();
    }

    private int getMenuFurnitur() {
        System.out.println("Menu:");
        System.out.println("1. Meja");
        System.out.println("2. Kursi");
        System.out.println("3. Meja lipat");
        System.out.println("4. Sofa");
        System.out.println("0. Keluar");
        System.out.print("Pilihanmu: ");
        return CLIUtil.getInt();
    }
    private int getMenuTipe(){
        System.out.println("menu");
        System.out.println("1.plastik");
        System.out.println("2.kayu");
        System.out.println("3.Besi");
        return CLIUtil.getInt();
    }
}

public class CLIUtil {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt() {
        return scanner.nextInt();
    }

    public static double getDouble() {
        return scanner.nextDouble();
    }

}

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FurniturView list = new FurniturView();
        list.render();
    }
}
