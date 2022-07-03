package Hw1;

public class OOP {
    public static void main(String[] args) {
        /*
        Phone p1 = new Phone("+375291231231", "Iphone X", 100);
        Phone p2 = new Phone("+375296666666", "Xiaomi Mi 13", 250);
        Phone p3 = new Phone("+375297777777", "Samsung S22", 140);
        */
    }
}


class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    Phone(String number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит {"+name+"}");
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит {"+name+"}, number");
    }

    void sendMessage(String[] numbers) {
        for (String el : numbers) {
            System.out.println(el);
        }
    }

    String getNumber() {
        return number;
    }
}


class Person {
    String fullName;
    int age;

    Person() {
        fullName = "";
        age = 0;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(fullName + " Person идёт");
    }

    void talk() {
        System.out.println(fullName + " Person говорит");
    }
}


class Book {
    public String title;
    public String authorName;
}


class Reader {
    private final String name;
    private final int ticketId;
    private final String faculty;
    private final String birthDay;
    private final String phoneNumber;

    public Reader(String name, int ticketId, String faculty,
                  String birthDay, String phoneNumber) {
        this.name = name;
        this.ticketId = ticketId;
        this.faculty = faculty;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int booksAmount) {
        System.out.println(name + " взял " + booksAmount + " книг");
    }

    public void takeBook(String[] bookNames) {
        System.out.print(name + " взял книги: ");
        for (String book: bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book[] books) {
        System.out.print(name + " взял книги: ");
        for (Book book: books) {
            System.out.print(book.title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int booksAmount) {
        System.out.println(name + " вернул " + booksAmount + " книг");
    }

    public void returnBook(String[] bookNames) {
        System.out.print(name + " вернул книги: ");
        for (String book: bookNames) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book[] books) {
        System.out.print(name + " вернул книги: ");
        for (Book book: books) {
            System.out.print(book.title + ", ");
        }
        System.out.println();
    }
}
