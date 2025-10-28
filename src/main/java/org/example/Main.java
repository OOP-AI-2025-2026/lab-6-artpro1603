package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Пес");
        Animal cat = new Cat("Кіт");

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}

