package org.example.window;

import org.example.menu.MenuHome;


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
        }else{
            throw new RuntimeException("Fudeu");
        }
        return action;
    }

}
