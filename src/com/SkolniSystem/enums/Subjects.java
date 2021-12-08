package com.SkolniSystem.enums;

public enum Subjects {
    LANGUEAGE(0),
    MATH(1),
    PHYSICS(2),
    CHEMISTRY(3),
    PE(4);

    private int index;

    Subjects(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
