import java.util.ArrayList;

public class CarData {
    ArrayList <Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType, String polNum, String merk) {
        Car car = new Car(carType, polNum, merk, false);
        carList.add(car);
    }
    public void listOfCar(){
        System.out.println("------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("------------------------------");
        for(int i = 0; i < carList.size(); i++){
            System.out.println("Tipe Mobil : "+ carList.get(i).getCarType());
            System.out.println("No. Polisi : "+ carList.get(i).getPolNum());
            System.out.println("Merk Mobil : "+ carList.get(i).getMerk());
            System.out.println("------------------------------");
        }
    }
}
