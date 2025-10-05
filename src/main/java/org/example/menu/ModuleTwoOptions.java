package org.example.menu;

public enum ModuleTwoOptions implements MenuOptions {
    EXIT(0),
    EXERCISE_ONE(1),
    EXERCISE_TWO(2),
    EXERCISE_THREE(3),
    EXERCISE_FOUR(4),
    EXERCISE_FIVE(5),
    HOME(7);

    private final int value;
    ModuleTwoOptions(int value){
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
