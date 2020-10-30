package ru.geekbrains.homework6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(dog.jump((float)0.1));
        System.out.println(cat.jump(3));
        
    }

}
