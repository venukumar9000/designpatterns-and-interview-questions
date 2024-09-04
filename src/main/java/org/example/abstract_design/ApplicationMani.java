package org.example.abstract_design;

public class ApplicationMani {

    public static  final String TATA_MODEL_CARS="TATA";

    public static  final String MAHENDIRA_MODEL_CARS="MAHENDRIA";

    public static void main(String[] args) {
        String input =MAHENDIRA_MODEL_CARS;

        CarFactory factory=input.equals(TATA_MODEL_CARS)? new TataFactory() :new MahendraFactory();

        FuelCars fuelCars = factory.createFuelCars();
        fuelCars.getFuelCarsInfo();

        ElectricCars electricCars = factory.createElectricCars();
        electricCars.getElectricCarsInfo();


    }
}
