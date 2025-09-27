package org.example.window;

import org.example.menu.MenuHome;
import org.example.menu.ModuleOneOptions;

public class ModuleOne extends Window implements WindowInterface{
    public ModuleOne(){
        super("MODULE_1");
    }

    @Override
    public void show() {
        this.drawingWindow(MenuHome.values(), "HOME");
    }
}