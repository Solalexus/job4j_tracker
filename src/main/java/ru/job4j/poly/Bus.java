package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Максимальная скорость 100 км/ч.");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("Вместимость салона - 50 чел.");
    }

    @Override
    public double refuel(double fuel) {
        double priceFuel = 45.2;
        return priceFuel * fuel;
    }
}
