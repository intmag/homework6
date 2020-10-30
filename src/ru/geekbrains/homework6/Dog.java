package ru.geekbrains.homework6;

public class Dog extends Animal {

    public Dog(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        super(runMaxDistance, swimMaxDistance, jumpMaxDistance);
    }

    public Dog() {
        this(500, 10, (float)0.5);
    }
}

