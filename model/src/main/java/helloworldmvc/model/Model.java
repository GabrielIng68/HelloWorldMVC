package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class Model implements IModel {
    @Override
    public String getMessage() {
        String s = "";
        try {
            InputStream inputStream= Model.class.getResourceAsStream("message.txt");
            if( inputStream != null ) {
                s = new BufferedReader(new InputStreamReader(inputStream))
                        .lines().collect(Collectors.joining("\n"));
            }
        } catch (Exception e) {
            System.out.println("\u001B[31m" + e + "\u001B[0m");
        }
        return s;
    }
}
