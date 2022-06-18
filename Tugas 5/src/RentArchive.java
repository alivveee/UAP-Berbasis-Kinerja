import java.util.ArrayList;
import java.util.Collections;

public class RentArchive {
    private ArrayList <CarRent> rentData;

    RentArchive(){
        rentData = new ArrayList<CarRent>();
    }

    public void Rent(CarRider rider,Car car, int rentDur){
        CarRent data = new CarRent(rider, car, rentDur);
        rentData.add(data);
        if (car.isStatus() == false){
            System.out.println("Mobil Berhasil Disewa");
            car.setStatus(true);
        } else {
            System.out.println("Maaf, Mobil Sudah Disewa");
            rentData.removeIf(item -> item.getRider() == rider );
        }

    }
    public void info(){
        System.out.println("------------------------------");
        System.out.println("Informasi Pelanggan");
        System.out.println("------------------------------");
        for(int i = 0; i < rentData.size(); i++){
            System.out.println("Nama Peminjam : "+ rentData.get(i).getRider().getName());
            System.out.println("Tipe Mobil    : "+ rentData.get(i).getCar().getCarType());
            System.out.println("No. Polisi    : "+ rentData.get(i).getCar().getPolNum());
            System.out.println("Lama Rental   : "+ rentData.get(i).getRentDur());
            System.out.println("------------------------------");
        }
    }
}
