public class Main {
    public static void main(String[] args) {
        CarRider tegar = new CarRider("Tegar Abiram",19,"899023");
        CarRider harsyu = new CarRider("Harsyu Bahtiar",28,"325434");
        CarRider sanusi = new CarRider("Amir Sanusi",25,"884563");
        CarRider yoda = new CarRider("Yoda Amirulah",22,"435472");

        CarData data = new CarData();

        data.addCar("SUV","N 123 HJ", "Honda");
        data.addCar("SUV","N 435 KS", "Toyota");
        data.addCar("Truck","N 443 LS", "Hino");
        data.addCar("Sport","N 546 BV", "Audi");

        data.listOfCar();

        RentArchive arsip = new RentArchive();

        System.out.println();
        arsip.Rent(tegar, data.carList.get(1), 7);
        arsip.Rent(harsyu, data.carList.get(3), 4);
        arsip.Rent(sanusi, data.carList.get(0), 8);
        arsip.Rent(yoda, data.carList.get(3), 2);
        System.out.println();

        arsip.info();
    }
}
