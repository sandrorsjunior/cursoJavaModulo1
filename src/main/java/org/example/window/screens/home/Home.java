package org.example.window.screens.home;

import org.example.menu.MenuHome;
import org.example.window.*;
import org.example.window.screens.home.subScreens.ModuleOneWindow;
import org.example.window.screens.home.subScreens.ModuleTwoWindow;


public class Home extends Window {
    public Home() {
        super("HOME");
    }

    @Override
    public void show() {
        this.drawingWindow(MenuHome.values(), "HOME");
    }

    @Override
    public WindowAction Exec(int task) {
        WindowAction action = new WindowAction();
        if (MenuHome.ModuleOne.getValue() == task) {
            action.setAction(Actions.ROUTE_PAGE);
            action.setWindow(new ModuleOneWindow());
        } else if (MenuHome.ModuleTwo.getValue() == task) {
            action.setAction(Actions.ROUTE_PAGE);
            action.setWindow(new ModuleTwoWindow());
        } else{
            throw new RuntimeException("Fudeu");
        }
        return action;
    }

}
