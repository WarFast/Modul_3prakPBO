import java.util.Scanner;

import bangunruang.Cuboid;
import bangunruang.Cylinder;

enum bangunruangg{
SPHERE , CYLINDER , CUBOID , CUBE
}
public abstract class bangunruang {
    protected String name;
    protected int Getvolume;
    protected int GetSurfacearea;
    public bangunruang(String name , int Getvolume , int GetSurfacearea){
        this.name = name;
        this.Getvolume = Getvolume;
        this.GetSurfacearea = GetSurfacearea;
        
    }
        public abstract Int PrintVolume();

        public abstract Int printSurfaceArea();
    public String printData() {
        return "Name: " + name +
                "\nvolume: " +Getvolume +
                "\nluas perukaan: " + GetSurfacearea;
                
    }
    class SPHERE extends bangunruang{
    public SPHERE(String name, int Getvolume , int GetSurfacearea){
        super(name, Getvolume, GetSurfacearea);
    }
    @Override
    public int PrintVolume (){
        return Getvolume;
    } 
    public int printSurfaceArea(){
        return GetSurfacearea;
    }
      @Override
    public String printData() {
        return "Type: SPHERE\n" + super.printData();
    }
    }
    class Cylinder extends bangunruang{
    public Cylinder(String name, int Getvolume , int GetSurfacearea){
        super(name, Getvolume, GetSurfacearea);
    }
    @Override
    public int PrintVolume (){
        return Getvolume;
    } 
    public int printSurfaceArea(){
        return GetSurfacearea;
    }
      @Override
    public String printData() {
        return "Type: Cylinder\n" + super.printData();
    }
    }
    class Cuboid extends bangunruang{
    public Cuboid(String name, int Getvolume , int GetSurfacearea){
        super(name, Getvolume, GetSurfacearea);
    }
    @Override
    public int PrintVolume (){
        return Getvolume;
    } 
    public int printSurfaceArea(){
        return GetSurfacearea;
    }
      @Override
    public String printData() {
        return "Type: Cuboid\n" + super.printData();
    }
    }
    class Cube extends bangunruang{
    public Cube(String name, int Getvolume , int GetSurfacearea){
        super(name, Getvolume, GetSurfacearea);
    }
    @Override
    public int PrintVolume (){
        return Getvolume;
    } 
    public int printSurfaceArea(){
        return GetSurfacearea;
    }
      @Override
    public String printData() {
        return "Type: Cube\n" + super.printData();
    }
    }
}

class Main{
    public static void main(String[] args) {
        bangunruang SPHERE = new SPHERE("keren" , 12 , 12 );
        int a = 3;
        String b = "";
        int volume = 0;
        int Surfacearea = 0;
        int radius = 0;
        int height = 0;
        int width = 0;
        int side = 0;
        int length = 0;
        Scanner scan = new Scanner(system.in);
        while (a!=0) {
            System.out.println("menu");
            System.out.println("1.add new bangunruang");
            System.out.println("2.print all");
            System.out.println("0.exit");
            a = scan.nextInt();
            if (a = 1) {
                System.out.println("sphere");
                System.out.println("cylindder");
                System.out.println("cuboid");
                System.out.println("Cube");
                b = scan.nextLine();
                if (b = "sphere") {
                    System.out.println("masukan radius");
                    radius = scan.nextInt();
                     bangunruang SPHERE = new SPHERE("SPHERE" , (4/3*3.14*radius*radius*radius) + (4/3*3.14*radius*radius) );
                }
                if (b = "cylinder") {
                    System.out.println("masukan radius");
                    radius = scan.nextInt();
                    System.out.println("masukan tinggi");
                    height = scan.nextInt();
                    bangunruang Cylinder = new Cylinder("Cylinder" , 3.14*radius*radius*height);
                }
                if (b = "cuboid") {
                    System.out.println("masukan lebar");
                    width = scan.nextInt();
                    System.out.println("masukan tinggi");
                    height = scan.nextInt();
                    System.out.println("masukan panjang");
                    length =scan.nextInt();
                    bangunruang Cuboid = new Cuboid("Cuboid" , width*height*length , 2*(length*width+width*height+length*height));
                }
                if (b = "cube") {
                    System.out.println("masukan sisi");
                    side = scan.nextInt();
                    bangunruang Cube = new Cube("Cube" + side * side * side + 6*side*side);
                }

            }
            else if (a=2) {
        System.out.println("Name : Sphere, Volume: " + Sphere.PrintVolume() + ",Surface Area : " + Sphere.printSurfaceArea);
        System.out.println("Name : Sphere, Volume: " + Cylinder.PrintVolume() + ",Surface Area : " + Cylinder.printSurfaceArea);
        System.out.println("Name : Sphere, Volume: " + Cuboid.PrintVolume() + ",Surface Area : " + Cuboid.printSurfaceArea);
        System.out.println("Name : Sphere, Volume: " + Cube.PrintVolume() + ",Surface Area : " + Cube.printSurfaceArea);
            }
        }
    }
}