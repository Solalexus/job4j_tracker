package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Передвигается по железной дороге");
    }

    @Override
    public void passengers() {
        System.out.println("Вместимость до 80 человек в вагоне.");
    }
}
