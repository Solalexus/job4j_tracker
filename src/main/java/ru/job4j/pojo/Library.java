package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book dictionary = new Book("Dictionary", 130);
        Book cleanCode = new Book("Clean code", 900);
        Book recipeBook = new Book("Recipe book", 360);
        Book poems = new Book("Poems", 92);
        Book[] books = new Book[4];
        books[0] = dictionary;
        books[1] = cleanCode;
        books[2] = recipeBook;
        books[3] = poems;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getTitle() + " - " + b.getQuantityPages() + " pages");
        }
        System.out.println();
        System.out.println("(Swap places index 0 to 3)");
            books[0] = poems;
            books[3] = dictionary;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getTitle() + " - " + b.getQuantityPages() + " pages");
        }
        System.out.println();
        System.out.println("(Show only \"Clean code\")");
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            if (b.getTitle().equals("Clean code")) {
                System.out.println(b.getTitle() + " - " + b.getQuantityPages() + " pages");
            }
        }
    }
}

