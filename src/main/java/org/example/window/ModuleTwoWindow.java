package org.example.window;
import org.example.exercise.ModuleTwo;
import org.example.menu.ModuleTwoOptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ModuleTwoWindow extends Window {
    public ModuleTwoWindow() {
        super("ModuleTwo");
    }

    @Override
    public void show() {
        this.drawingWindow(ModuleTwoOptions.values(), "MODULE_2");
    }

    @Override
    public WindowAction Exec(int task) {
        WindowAction action = new WindowAction();
        ModuleTwo ModuleTwo = new ModuleTwo();
        if (ModuleTwoOptions.EXERCISE_ONE.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert Two floats Money and Price: ");
            float result = ModuleTwo.FuelCharge(scanner.nextFloat(), scanner.nextFloat());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        } else if (ModuleTwoOptions.EXERCISE_TWO.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert the Mass in the Earth Planet: ");
            float result = ModuleTwo.heavyInMart(scanner.nextFloat());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleTwoOptions.EXERCISE_THREE.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert quantite of P M and G T-shirts: ");
            float result = ModuleTwo.OrderTotal(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleTwoOptions.EXERCISE_FOUR.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert quantite of coins(1, 2, 0.5, 0.20, 0.10, 0.05): ");
            double result = ModuleTwo.moneySaved(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            System.out.printf("Resultado: %f%n", result);

            action.setAction(Actions.ACTION);
            action.setWindow(this);
        }else if (ModuleTwoOptions.EXERCISE_FIVE.getValue() == task) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert quantite of P M and G Cans: ");
            double result = ModuleTwo.litersPurchased(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
            System.out.printf("Resultado: %f%n", result);

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
