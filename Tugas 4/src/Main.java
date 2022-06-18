import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String jenisBaju;
        int jumlah;

        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");

        System.out.print("Masukan tipe baju yang anda beli : ");
        jenisBaju = scan.nextLine();
        System.out.print("Masukan jumlah baju              : ");
        jumlah = scan.nextInt();

        Baju x = new Baju(jenisBaju,jumlah);
        x.display();

    }
}

class Baju{
    String jenis;
    int harga;
    int jumlah;

    public Baju (String a, int b){
        jenis = a;
        jumlah = b;
    }

    final int bajuA = 100000;
    final int bajuB = 125000;
    final int bajuC = 175000;

    void hargaA(){
        if (jumlah > 100){
            harga = 95000;
        }else {
            harga = bajuA;
        }
    }
    void hargaB(){
        if (jumlah > 100){
            harga = 120000;
        }else {
            harga = bajuB;
        }
    }
    void hargaC(){
        if (jumlah > 100){
            harga = 160000;
        }else {
            harga = bajuC;
        }
    }

    void display(){
        if (jenis.equalsIgnoreCase("a"))
            hargaA();
        else if (jenis.equalsIgnoreCase("b"))
            hargaB();
        else if (jenis.equalsIgnoreCase("c"))
            hargaC();

        System.out.println("Jenis yang anda beli : " +jenis);
        System.out.println("Harga per buah       : " +harga);
        System.out.println("Total harga          : " +harga*jumlah);
    }
}