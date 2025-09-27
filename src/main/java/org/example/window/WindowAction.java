package org.example.window;

public class WindowAction {
    private Actions actions;
    private WindowInterface window;

    public Actions getActions() {
        return actions;
    }

    public WindowInterface getWindow() {
        return window;
    }

    public void setAction(Actions actions){
        this.actions = actions;
    }
    public void setWindow(WindowInterface window){
        this.window = window;
    }
}
