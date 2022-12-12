package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error success = new Error(true, 10, "Заданные параметры верны");
        Error err = new Error(false, 404, "Ошибка, заданные параметры не существуют");
        error.printInfo();
        System.out.println();
        success.printInfo();
        System.out.println();
        err.printInfo();
    }

    public void printInfo() {
        System.out.println("Действие - " + active);
        System.out.println("Состояние - " + status);
        System.out.println("Пояснение - " + message);
    }
}
