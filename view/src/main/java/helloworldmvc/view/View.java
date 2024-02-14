package helloworldmvc.view;

import java.io.Console;

public class View implements IView {
    @Override
    public void display(String message) {
        System.out.print(message);
    }
}
