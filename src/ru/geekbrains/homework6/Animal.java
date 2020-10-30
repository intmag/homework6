package ru.geekbrains.homework6;

public class Animal {

    int runMaxDistance;
    int swimMaxDistance;
    float jumpMaxDistance;

    boolean run(int distance) {
        System.out.print("\nrun: ");
        return (distance <= runMaxDistance);
    }

    boolean swim(int distance) {
        System.out.print("\nswim: ");
        return (distance <= swimMaxDistance && swimMaxDistance != 0);
    }

    boolean jump(float distance) {
        System.out.print("\njump: ");
        return (distance <= jumpMaxDistance);
    }

    public Animal(int runMaxDistance, int swimMaxDistance, float jumpMaxDistance) {
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxDistance = jumpMaxDistance;
    }
}
