package org.example.window;

import java.util.ArrayList;

public class WindowsController {
    private WindowInterface currentWindow;

    public WindowsController(WindowInterface currentWindow){
        this.currentWindow = currentWindow;
    }

    public void show(){
        this.currentWindow.show();
    }

    public void ExecuteOptionFromWindow(int option){
        WindowAction action = this.currentWindow.Exec(option);
        if(action.getActions() == Actions.ROUTE_PAGE){
            this.currentWindow = action.getWindow();
        }
        this.show();
    }

}
