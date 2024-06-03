public class Car {
    double speed=0;
    double fuel=0;
    double lPerKmH=0.01;

    void refuel(double amount){
        fuel +=amount;
    }
    void brake(double amount){
        speed-=amount;
    }
    void accelerate(double amount){
        double fuelConsumed=amount*lPerKmH;
        speed+=amount;
        fuel-=fuelConsumed;
    }
}
