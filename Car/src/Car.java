import javax.swing.*;

public class Car {
    double speed=0;
    double fuel=0;
    FuelType fuelType;

    void refuel(FuelTank tank){
        if (tank.type.equals(this.fuelType.type)){
            fuel+=tank.amount;
        }
    }
    void brake(double amount){
        if(amount >speed)
            speed=0;
        else speed-=amount;
    }
    void accelerate(double amount){
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
        System.out.println("Hello World");
    }
}
