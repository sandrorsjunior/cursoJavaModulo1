package org.example.window.screens.home.subScreens;
import org.example.exercise.ModuleThree;
import org.example.exercise.ModuleTwo;
import org.example.menu.ModuleThreeOptions;
import org.example.menu.ModuleTwoOptions;
import org.example.window.Actions;
import org.example.window.Window;
import org.example.window.WindowAction;
import org.example.window.screens.home.Home;

import java.util.ArrayList;
import java.util.Scanner;


public class ModuleThreeWindow extends Window {
    public ModuleThreeWindow() {
        super("ModuleThree");
    }

    @Override
    public void show() {
        this.drawingWindow(ModuleThreeOptions.values(), "MODULE_3");
    }

    @Override
    public WindowAction Exec(int task) {
        WindowAction action = new WindowAction();
        ModuleThree moduleThree = new ModuleThree();
        if (ModuleThreeOptions.EXERCISE_TWO.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("These are the par values in this interval: ");
            ArrayList<Integer> result = moduleThree.getParNumbers(scanner.nextInt(), scanner.nextInt());
            System.out.println(result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        } else if (ModuleThreeOptions.EXERCISE_EIGHT.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            int randomInt = (int)(Math.random() * 10);
            ArrayList<Integer> array = ModuleThree.criarSequenciaStream(randomInt, randomInt+10);
            System.out.println("This is the random array generated:");
            System.out.println(array);
            var result = moduleThree.getNumbersInRange(array, 10, 20);
            System.out.println(result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleTwoOptions.HOME.getValue() == task) {
            action.setAction(Actions.ROUTE_PAGE);
            action.setWindow(new Home());
        }
        else {
            throw new RuntimeException("Fudeu");
        }
        return action;
    }

}
