public class Main {

    public static void main(String[] args) {
    
    System.out.println("------ Pegawai Tetap ------");

        Pegawai tetap1 = new PegawaiTetap("Yanfei", "2164352643", 1600000);
        Pegawai tetap2 = new PegawaiTetap("Zhongli", "2534613652", 3000000);
        Pegawai tetap3 = new PegawaiTetap("Childe", "2159289280", 5000000);
        Pegawai tetap4 = new PegawaiTetap("Bennet", "2354626482", 2500000 );

        tetap1.toString();
        tetap2.toString();
        tetap3.toString();
        tetap4.toString();
        
    System.out.println("------ Pegawai Harian ------");

        Pegawai harian1 = new PegawaiHarian("Sayu", "3591812810", 70000, 50);
        Pegawai harian2 = new PegawaiHarian("Yae", "2502810820", 90000, 40);
        Pegawai harian3 = new PegawaiHarian("Ayato", "2811910296", 80000, 50);
        Pegawai harian4 = new PegawaiHarian("Gorou", "3691109201", 90000, 45);

        harian1.toString();
        harian2.toString();
        harian3.toString();
        harian4.toString();
        
    System.out.println("---------- Sales ----------");

        Pegawai sales1 = new Sales("Rosaria", "3481729112", 60, 65000);
        Pegawai sales2 = new Sales("Jean", "2471182010", 80, 45000);
        Pegawai sales3 = new Sales("Klee", "2711289019", 65, 50000);
        Pegawai sales4 = new Sales("Kaeya", "2171198918", 85, 55000);

        sales1.toString();
        sales2.toString();
        sales3.toString();
        sales4.toString();

    }
}
