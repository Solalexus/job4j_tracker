package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            String rsl = count < 3 ? player + ", введите число от 1 до " + count + ":" : player + ", введите число от 1 до 3:";
            System.out.println(rsl);
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= Math.min(3, count)) {
                count -= matches;
                System.out.println("Осталось " + count + " спичек");
                turn = !turn;
            } else {
                System.out.println("Вы нарушаете правила игры. Нужно вводить число от 1 до 3, но не более остатка.");
            }
        }
        if (!turn) {
            System.out.println("Победил первый игрок");
        } else {
            System.out.println("Победил второй игрок");
        }
    }
}
