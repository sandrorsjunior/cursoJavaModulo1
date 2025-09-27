package org.example.window;
import org.example.exercise.ModuleOne;
import org.example.menu.ModuleOneOptions;


public class ModuleOneWindow extends Window {
    public ModuleOneWindow() {
        super("ModuleOne");
    }

    @Override
    public void show() {
        this.drawingWindow(ModuleOneOptions.values(), "MODULE_1");
    }

    @Override
    public WindowAction Exec(int task) {
        WindowAction action = new WindowAction();
        ModuleOne moduleOne = new ModuleOne();
        if (ModuleOneOptions.EXERCISE_ONE.getValue() == task) {
            moduleOne.exercise1();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        } else if (ModuleOneOptions.EXERCISE_TWO.getValue() == task) {
            moduleOne.exercise2();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_THREE.getValue() == task) {
            moduleOne.exercise3();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_FOUR.getValue() == task) {
            moduleOne.exercise4();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_FIVE.getValue() == task) {
            moduleOne.exercise5();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_SIX.getValue() == task) {
            moduleOne.exercise6();
            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.HOME.getValue() == task) {
            action.setAction(Actions.ROUTE_PAGE);
            action.setWindow(new Home());
        }
        else {
            throw new RuntimeException("Fudeu");
        }
        return action;
    }

}
