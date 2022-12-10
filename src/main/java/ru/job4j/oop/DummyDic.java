package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово" + eng;
    }

    public static void main(String[] args) {
        DummyDic trans = new DummyDic();
        String say = trans.engToRus(" language");
        System.out.println(say);
    }
}
