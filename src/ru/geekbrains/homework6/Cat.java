package ru.geekbrains.homework6;

public class Cat extends Animal {

    public Cat(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
    }

    public Cat() {
        this(200, 0, 2);
    }
}
