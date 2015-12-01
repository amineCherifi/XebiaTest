package xebiaTest.tools;

import org.junit.Assert;


public class EnvironnementGeneratorTest {

    @org.junit.Test
    public void testGenerateFromFile() throws Exception {
        EnvironnementGenerator e = new EnvironnementGenerator();
        e.generateFromFile("fichierTest", " ");
        System.out.println("x: " + e.grilleX);
        Assert.assertEquals(e.grilleX, 5);
        System.out.println("y: " + e.grilleY);
        Assert.assertEquals(e.grilleY, 5);

        Assert.assertEquals(e.list.size(), 2);
        System.out.println(e.list.get(0).getTondeuse().getPossition().getX());
        Assert.assertTrue(e.list.get(0).getTondeuse().getPossition().getX() == 1.0);
        Assert.assertTrue(e.list.get(0).getTondeuse().getPossition().getY() == 2.0);

        Assert.assertEquals(e.list.get(0).getTondeuse().getOrientation().toString(), "NORD");
        Assert.assertEquals(String.valueOf(e.list.get(0).getActions()), "GAGAGAGAA");


        Assert.assertTrue(e.list.get(1).getTondeuse().getPossition().getX() == 3.0);
        Assert.assertTrue(e.list.get(1).getTondeuse().getPossition().getY()== 3.0);
        Assert.assertEquals(e.list.get(1).getTondeuse().getOrientation().toString(), "EST");
        Assert.assertEquals(String.valueOf(e.list.get(1).getActions()), "AADAADADDA");

    }
}