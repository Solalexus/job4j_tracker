package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Летает по воздуху");
    }

    @Override
    public void passengers() {
        System.out.println("Вместимость до 450 человек.");
    }
}
