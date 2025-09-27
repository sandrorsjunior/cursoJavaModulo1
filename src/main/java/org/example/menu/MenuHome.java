package org.example.menu;

public enum MenuHome implements MenuOptions {
    ModuleOne(1),
    EXIT(0);

    private final int value;

    MenuHome(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
