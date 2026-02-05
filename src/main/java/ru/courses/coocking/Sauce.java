package ru.courses.coocking;

public class Sauce{
    public String name;
    private SpicyLevel spicyLevel;

    public Sauce(String name, SpicyLevel spicyLevel) {
        this.name = name;
        this.spicyLevel = spicyLevel;
    }

    @Override
    public String toString() {
        return "Соус: " + name + ", уровень остроты: " + spicyLevel;
    }
}
