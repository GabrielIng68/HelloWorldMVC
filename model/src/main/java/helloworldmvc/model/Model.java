package helloworldmvc.model;

import java.io.InputStream;

public class Model implements IModel {
    @Override
    public String getMessage() {
        InputStream resourceAsStream = Model.class.getResourceAsStream("message.txt");
        assert resourceAsStream != null;
        return resourceAsStream.toString();
    }
}
