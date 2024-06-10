package it.unive.po.fuel;

import it.unive.po.vehicles.Car;

public class FuelType {
    final String type;
    public double costPerLiter;
    public final double litresPerKmH;

    public FuelType(String type, double costPerLiter, double litresPerKmH){
        this.type=type;
        this.costPerLiter=costPerLiter;
        this.litresPerKmH=litresPerKmH;
    }

    public boolean isCompatible(Car c){
        return this.type.equals(c.fuelType.type);
    }
}
