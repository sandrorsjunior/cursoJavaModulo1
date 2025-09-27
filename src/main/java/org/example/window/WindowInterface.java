package org.example.window;

public interface WindowInterface {
    void show();
    //WindowInterface findWindowByTitle();
    String getWindowTitle();
    void routPage(String titleNextPage);
    WindowAction Exec(int task);
}
