public class Main {
    public static void main(String[] args) {

        System.out.println("Dal Main!");
        Car x = new Car(); //creazione nuovo oggetto di tipo Car
        x.refuel(12);
        x.accelerate(100);
        x.brake(20);
    }
}