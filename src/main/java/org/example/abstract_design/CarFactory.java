package org.example.abstract_design;

public interface CarFactory {

    FuelCars createFuelCars();
    ElectricCars createElectricCars();
}
