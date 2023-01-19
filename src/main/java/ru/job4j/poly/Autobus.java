package ru.job4j.poly;

public class Autobus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Перевозит пассажиров по автомобильным дорогам.");
    }

    @Override
    public void passengers() {
        System.out.println("Вместимость салона до 65 человек.");
    }
}
