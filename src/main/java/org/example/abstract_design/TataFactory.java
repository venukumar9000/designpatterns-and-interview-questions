package org.example.abstract_design;

public class TataFactory implements CarFactory{


    @Override
    public FuelCars createFuelCars() {
        return new Nexon();
    }

    @Override
    public ElectricCars createElectricCars() {
        return new Punch();
    }
}
