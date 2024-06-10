package it.unive.po.fuel;
import it.unive.po.fuel.FuelType;

public class FuelTank {
    static int numberOfTanks;
    public FuelType type;
    public double amount;
    int id = numberOfTanks++;
    FuelTank(FuelType type,double amount){
        this.type=type;
        this.amount=amount;
    }
    FuelTank(FuelType type){
        this(type,0.0);
    }
    static{
        FuelTank.resetCounter();
    }
    static void resetCounter(){
        FuelTank.numberOfTanks=0;
    }


}
