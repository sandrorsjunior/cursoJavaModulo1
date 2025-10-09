package org.example.menu;

public enum ModuleFourOptions implements MenuOptions {
    EXIT(0),
    EXERCISE_ONE(1),
    EXERCISE_TWO(2),
    HOME(7);

    private final int value;
    ModuleFourOptions(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
