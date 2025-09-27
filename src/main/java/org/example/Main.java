package org.example;

import org.example.menu.MenuHome;
import org.example.window.Home;
import org.example.window.ModuleOne;
import org.example.window.Window;
import org.example.window.WindowsController;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WindowsController controller = new WindowsController(new Home());
        controller.addWindow(new Home());
        controller.addWindow(new ModuleOne());

        int option;
        Scanner scanner = new Scanner(System.in);
        controller.defaultWindow();

        while(true){
            System.out.println("Chose a option: ");
            option = scanner.nextInt();
            if (option == 0){
                System.out.println("Thank you for your time!");
                break;
            }
            controller.(option);
        }
    }
}