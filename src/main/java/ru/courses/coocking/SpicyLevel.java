package ru.courses.coocking;

public enum SpicyLevel {
    NOT_SPICY("Не острый"),
    SPICY("Острый"),
    VERY_SPICY("Очень острый");
    private final String description;

    SpicyLevel(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
