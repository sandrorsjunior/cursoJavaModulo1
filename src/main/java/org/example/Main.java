package org.example;

import org.example.menu.MenuHome;
import org.example.window.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int option;
        WindowsController controller = new WindowsController(new Home());
        controller.show();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Chose a option: ");
            option = scanner.nextInt();
            if (option == 0){
                System.out.println("Thank you for your time!");
                break;
            }
            controller.ExecuteOptionFromWindow(option);
        }
    }
}