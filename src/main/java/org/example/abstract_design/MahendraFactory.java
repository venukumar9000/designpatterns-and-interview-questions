package org.example.abstract_design;

public class MahendraFactory implements CarFactory{

    @Override
    public FuelCars createFuelCars() {
        return new Thar();
    }

    @Override
    public ElectricCars createElectricCars() {
        return new Xuv();
    }
}
