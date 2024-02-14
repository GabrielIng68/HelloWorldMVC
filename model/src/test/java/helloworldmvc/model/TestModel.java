package helloworldmvc.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestModel {
    @Test
    public void testGetMessage()
    {
        Model model=new Model();
        String m=model.getMessage();
        Assertions.assertNotNull(m);
        Assertions.assertEquals(m, "Hello World !");
    }

}
