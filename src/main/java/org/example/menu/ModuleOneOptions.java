package org.example.menu;

public enum ModuleOneOptions implements MenuOptions {
    EXERCISE_ONE(1),
    EXERCISE_TWO(2),
    EXERCISE_THREE(3),
    EXERCISE_FOUR(4),
    EXERCISE_FIVE(5),
    EXERCISE_SIX(6),
    HOME(7);

    private final int value;
    ModuleOneOptions(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
