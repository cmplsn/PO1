import javax.swing.*;

public class Car {
    double speed=0;
    double fuel=0;
    double lPerKmH=0.01;

    void refuel(double amount){
        fuel +=amount;
    }
    void brake(double amount){
        if(amount >speed)
            speed=0;
        else speed-=amount;
    }
    void accelerate(double amount){
        double fuelConsumed=amount*lPerKmH;
        if (fuelConsumed<fuel) {
            speed += amount;
            fuel -= fuelConsumed;
        }
        else{
            double increaseSpeed=fuel/lPerKmH;
            speed+=increaseSpeed;
            fuel=0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
