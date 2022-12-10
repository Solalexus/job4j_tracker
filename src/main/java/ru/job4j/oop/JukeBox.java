package ru.job4j.oop;

public class JukeBox {
    public String music(int position) {
        return switch (position) {
            case 1 -> "Пусть бегут неуклюже";
            case 2 -> "Спокойной ночи";
            default -> "Песня не найдена";
        };
    }

    public static void main(String[] args) {
        JukeBox song = new JukeBox();
        System.out.println(song.music(1));
        System.out.println(song.music(8));
        System.out.println(song.music(2));

    }
}
