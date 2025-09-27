package org.example.window;

import org.example.menu.MenuHome;
import org.example.menu.ModuleOneOptions;

import java.awt.*;

public class Home extends Window implements WindowInterface {
    public Home() {
        super("HOME");
    }

    @Override
    public void show() {
        this.drawingWindow(MenuHome.values(), "HOME");
    }

    @Override
    public void routPage(String titleNextPage) {
        WindowInterface nextPage = this.findWindowByTitle(titleNextPage);
        nextPage.show();
    }

    @Override
    public void Exec(int task) {
        if (MenuHome.ModuleOne.getValue() == task) {
            this.routPage(MenuHome.ModuleOne.name());
        } else if (MenuHome.ModuleTwo.getValue() == task) {
            this.routPage(MenuHome.ModuleTwo.name());
        }else {
            throw new RuntimeException("Fudeu");
        }
    }

}
