import java.util.*;
public class Suratkaisar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String teksAwal = scan.nextLine();
        int geser = scan.nextInt();

        System.out.println(penggeseran(teksAwal, geser));
    }

    public static String penggeseran(String teksAwal, int geser){
        char huruf = ' ';
        String hasil = "";

        for (int i=0; i<teksAwal.length(); i++){
            huruf = teksAwal.charAt(i);

            if (huruf >= 'a' &&  huruf <= 'z'){
                huruf = (char) (huruf + geser);

                if (huruf > 'z'){
                    huruf = (char) (huruf - 26);
                }
                hasil = hasil + huruf;
            }
            else if (huruf >= 'A' &&  huruf <= 'Z'){
                huruf = (char) (huruf + geser);

                if (huruf > 'Z'){
                    huruf = (char) (huruf - 26);
                }
                hasil = hasil + huruf;
            }
            else {
                hasil = hasil + huruf;
            }

        }
        return hasil;
    }
}