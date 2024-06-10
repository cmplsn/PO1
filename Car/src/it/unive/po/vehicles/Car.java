package it.unive.po.vehicles;
import it.unive.po.fuel.*;

public class Car {
    private double speed;
    private double fuel;
    private FuelType fuelType;
    final CarID carID;
    public Car(FuelType type, CarID ID){
        speed=0; fuel=0;
        this.fuelType=type;
        this.carID=ID;
    }

    void refuel(FuelTank tank){
        if (tank.type.isCompatible(this)){
            fuel=fuel+tank.amount;
        }
    }
    void fullBrake(){
        this.speed=0;
    }
    public void brake(double amount){
        if(amount >speed)
           this.fullBrake();
        else speed=speed-amount;
    }
    public void accelerate(double amount){
        double fuelConsumed=amount*fuelType.litresPerKmH;
        if (fuelConsumed<fuel) {
            speed += amount;
            fuel -= fuelConsumed;
        }
        else{
            double increaseSpeed=fuel/fuelType.litresPerKmH;
            speed+=increaseSpeed;
            fuel=0;
        }

    }

    public static void main(String[] args) {

    }
}
