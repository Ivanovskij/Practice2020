package org.practice2020.oop.abstraction.uno.enums;

public enum Color {

    YELLOW,
    GREEN,
    RED,
    BLUE,
    WILD;

    private static Color[] colors = Color.values();

    public Color getColor(int index) {
        return colors[index];
    }
}
