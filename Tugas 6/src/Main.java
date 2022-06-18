import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Manusia manusia1 = new Manusia("Andi", "523234537", true, true);
        Manusia manusia2 = new Manusia("Jamal", "472634793", true, false);
        Manusia manusia3 = new Manusia("Keisya", "487267364", false, false);

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Childe", "476389018", true, false, "215150700111012", 3.5);
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Yelan", "536782936", false, true, "205150787999034", 3.8);
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Hutao", "524318765", false, false, "205150600293888", 3.6);
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Thoma", "467898989", true, true, "215150301891003", 3.9);

        Pekerja pekerja_1 = new Pekerja("Ayaka", "673898467", false, false, 4, 25, "666758432342");
        Pekerja pekerja_2 = new Pekerja("Xingqiu", "487596872", true, false, 7, 22, "728736546789");
        Pekerja pekerja_3 = new Pekerja("Zhongli", "551121313", true, true, 4 , 15, "376287658790");
        Pekerja pekerja_4 = new Pekerja("Diluc", "443555421", true,false, 9, 23, "422716526536");
        Pekerja pekerja_5 = new Pekerja("Yoimiya", "545343651", true, true, 11, 25, "676456276888");

        Manajer manajer_1 = new Manajer("Chongyun", "564736666", true, false, 5, 26, "276758938787", 1300);
        Manajer manajer_2 = new Manajer("Kazuha", "555627635", true, true, 13, 21, "123453678987", 1600);
        Manajer manajer_3 = new Manajer("Barbara", "467365461", false, false, 7, 15, "578391524312", 1800);

        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();
        ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();
        ArrayList<Manajer> listManajer = new ArrayList<Manajer>();
        ArrayList<MahasiswaFilkom> listMahasiswaFilkom = new ArrayList<MahasiswaFilkom>();

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);

        listPekerja.add(pekerja_1);
        listPekerja.add(pekerja_2);
        listPekerja.add(pekerja_3);
        listPekerja.add(pekerja_4);
        listPekerja.add(pekerja_5);

        listManajer.add(manajer_1);
        listManajer.add(manajer_2);
        listManajer.add(manajer_3);

        listMahasiswaFilkom.add(mhs1);
        listMahasiswaFilkom.add(mhs2);
        listMahasiswaFilkom.add(mhs3);
        listMahasiswaFilkom.add(mhs4);

        System.out.println("====>  Data Manusia  <====\n");
        listManusia.toString();
        System.out.println("=================================================\n");
        System.out.println("====>  Data Pekerja  <====\n");
        listPekerja.toString();
        System.out.println("=================================================\n");
        System.out.println("====>  Data Manajer  <====\n");
        listManajer.toString();
        System.out.println("=================================================\n");
        System.out.println("====>  Data Mahasiswa Filkom  <====\n");
        listMahasiswaFilkom.toString();
        System.out.println("=================================================");

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Total Manusia          : " + listManusia.size());
        System.out.println("Total Pekerja          : " + listPekerja.size());
        System.out.println("Total Manajer          : " + listManajer.size());
        System.out.println("Total Mahasiswa Filkom : " + listMahasiswaFilkom.size());
        System.out.println("---------------------------");

        
    }
}
