import it.unive.po.fuel.*;
import it.unive.po.vehicles.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dal Main!");
        Car x = new Car(new FuelType("diesel",1.76,1.05),
                new CarID("Fiat","Punto","EB599NK","192478")); //creazione nuovo oggetto di tipo it.unive.po.vehicles.Car
        x.accelerate(100);
        x.brake(20);
    }
}