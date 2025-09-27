package org.example.window;

import java.util.ArrayList;

public class WindowsController {
    private final WindowInterface defaultWindow;
    private ArrayList<WindowInterface> windows;

    public WindowsController(WindowInterface defaultWindow){
        this.defaultWindow = defaultWindow;
    }
    public void addWindow(WindowInterface window){
        this.windows.add(window);
    }

    public void defaultWindow(){
        this.defaultWindow.show();
    }

    public WindowInterface findWindowByTitle(String title){
        return windows.stream()
                .filter(window -> window.getWindowTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public WindowInterface routPage() {
        return null;
    }

}
