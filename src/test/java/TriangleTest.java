import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);


    private static Triangle triangle = new Triangle();
    int a = 4;
    int b = 4;
    int c = 5;
    double s;
    double p;



    @Test
    void TestSquareValid() {
        int resulte = 8;
        Assert.assertEquals();
    }


    @Test
    void TestSquareNotValid() {
        int resulte = -2;
        Assert.assertEquals();


    }

}