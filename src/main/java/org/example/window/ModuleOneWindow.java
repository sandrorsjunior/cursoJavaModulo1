package org.example.window;
import org.example.exercise.ModuleOne;
import org.example.menu.ModuleOneOptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


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
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert Two intern angles of triangle: ");
            float result = moduleOne.exercise1(scanner.nextFloat(), scanner.nextFloat());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        } else if (ModuleOneOptions.EXERCISE_TWO.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert the quantite of minutes: ");
            long result = moduleOne.exercise2(scanner.nextLong());
            System.out.printf("Resultado: %d%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_THREE.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert current salary: ");
            BigDecimal result = moduleOne.exercise3(scanner.nextFloat());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_FOUR.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert grades of students: ");
            ArrayList<Float> arrayOfGrades = moduleOne.insertStudentGrade(3);
            Float result = moduleOne.exercise4(arrayOfGrades);
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_FIVE.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert grades of students: ");
            ArrayList<Float> arrayOfGrades = moduleOne.insertStudentGrade(2);
            Float result = moduleOne.exercise5(arrayOfGrades);
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleOneOptions.EXERCISE_SIX.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert time value: ");
            HashMap<String, Integer> result =  moduleOne.exercise6(scanner.nextInt());
            System.out.println(result);

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
