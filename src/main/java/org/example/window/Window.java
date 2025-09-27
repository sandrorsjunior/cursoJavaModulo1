package org.example.window;
import org.example.menu.MenuHome;
import org.example.menu.MenuOptions;

import java.util.ArrayList;
import java.util.HashMap;


public abstract class Window implements WindowInterface {
    private final String windowTitle;
    static private int width;
    private final ArrayList<WindowInterface> subWindows = new ArrayList<>();
    public Window(String windowTitle){
        width = 72;
        this.windowTitle = windowTitle;
    }

    public void addWindow(WindowInterface window){
        this.subWindows.add(window);
    }

    @Override
    public abstract void show();

    @Override
    public abstract WindowAction Exec(int task);

    public String getWindowTitle() {
        return windowTitle;
    }

    @Override
    public void routPage(String titleNextPage) {
        WindowInterface nextPage = this.findWindowByTitle(titleNextPage);
        nextPage.show();
    }

    public WindowInterface findWindowByTitle(String title){
        return subWindows.stream()
                .filter(window -> window.getWindowTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    protected String insertSpaces(String option){
        String spaces = "";
        int sizeOfLine = width - option.length() - 11;
        while(spaces.length() < sizeOfLine){
            spaces = spaces + " ";
        }
        spaces = spaces + " **";
        return spaces;
    }
    protected String insertSpaces(String text, int lefSpaceSize, int rightSpaceSize){
        String leftSpace = "";
        String rightSpace = "";
        while(true){
            if(leftSpace.length()<lefSpaceSize){leftSpace = leftSpace + " ";}
            if(
                    rightSpace.length()<rightSpaceSize){rightSpace = rightSpace + " ";
                    continue;
            }
            break;
        }
        return String.format("**%s%s%s**", leftSpace, text, rightSpace);
    }
    public static int getSizeOfSpaceCenterTitle(String text){
        return (width - text.length())/2 - 2;
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected void drawingWindow(MenuOptions[] options, String title){
        clearScreen();
        System.out.println("************************************************************************");
        System.out.println(this.insertSpaces(title, getSizeOfSpaceCenterTitle(title),getSizeOfSpaceCenterTitle(title)));
        System.out.println("************************************************************************");
        for(MenuOptions option: options){
            String lineOption = String.format("** [%d] %s %s", option.getValue(), option, this.insertSpaces(option.toString()));
            System.out.println(lineOption);
        }
        System.out.println("************************************************************************");
    }
}
