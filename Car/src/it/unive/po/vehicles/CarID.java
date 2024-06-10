package it.unive.po.vehicles;

public class CarID {
    final String maker;
    final String model;
    final String licensePlate;
    final String VIN;
    public CarID(String maker, String model, String licensePlate, String VIN){
        this.maker=maker;
        this.model=model;
        this.licensePlate=licensePlate;
        this.VIN=VIN;
    }

    boolean isSameLicensePlate(Car car){
        return this.licensePlate.equals(car.carID.licensePlate);
    }
}
