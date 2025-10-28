package org.example;

    public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return getName() + " каже: Гав!";
    }
}
