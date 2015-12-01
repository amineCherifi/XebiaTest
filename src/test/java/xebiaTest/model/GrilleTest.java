package xebiaTest.model;


import org.junit.Test;
import org.junit.Assert;

import java.awt.*;


public class GrilleTest {

    @Test
    public void testIsOutOfGrille() throws Exception {
        Grille g = new Grille(5,5);

        Assert.assertEquals(g.isOutOfGrille(new Point(5, 4)) , true);
        Assert.assertEquals(g.isOutOfGrille(new Point(4, 5)) , true);
        Assert.assertEquals(g.isOutOfGrille(new Point(4, 4)) , false);
    }
}
