package org.example.menu;

public enum ModuleThreeOptions implements MenuOptions {
    EXIT(0),
    EXERCISE_TWO(2),
    EXERCISE_EIGHT(8),
    HOME(7);

    private final int value;
    ModuleThreeOptions(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
