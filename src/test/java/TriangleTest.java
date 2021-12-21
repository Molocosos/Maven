import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);


    private static Triangle triangle = new Triangle();
    int a = 3;
    int b = 4;
    int c = 5;
    double s;

    {
        try {
            s = triangle.getSquare(a, b , c);
        } catch (NonIntResultException e) {
            e.printStackTrace();
        }
    }

    double p;


    @Test
    void TestSquareValid() {
        double resulte = 6.0;
        assertEquals(resulte, s, 0);
    }


    @Test
    void TestSquareNotValid() {
        int resulte = -2;
        assertNotEquals(resulte, s ,0);


    }

}