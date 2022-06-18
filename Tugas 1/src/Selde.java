import java.util.*;
public class Selde {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();

        cekSelde(angka);

    }

    public static int reverse(int angka) {
        int hasil = 0, temp;

        while (angka > 0) {
            temp = angka % 10;
            hasil = hasil * 10 + temp;
            angka = angka / 10;
        }
        return hasil;
    }

    public static void cekSelde(int angka) {
        if (angka == reverse(angka))
            System.out.println(angka + " adalah selde.");
        else
            System.out.println(angka + " bukan selde.");
    }
}
