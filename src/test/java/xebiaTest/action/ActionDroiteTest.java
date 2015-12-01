package xebiaTest.action;

import org.junit.Assert;
import org.junit.Test;
import xebiaTest.Environnement;
import xebiaTest.enumeration.Orientation;
import xebiaTest.model.Tondeuse;
import xebiaTest.tools.EnvironnementGenerator;

import java.awt.*;

public class ActionDroiteTest {

    @Test
    public void testOperationSpec() throws Exception {
        Tondeuse t2 = new Tondeuse(new Point(0,0), Orientation.EST);
        Environnement e = new Environnement();
        Action gauche = new ActionGauche();
        Action droite = new ActionDroite();
        Action avancer = new ActionAvancer();
        gauche.setSuivant(droite);
        droite.setSuivant(avancer);

        Tondeuse t3 = gauche.operation(EnvironnementGenerator.getDirection('D'), t2);
        Assert.assertTrue(t3.getOrientation().toString().equals("SUD"));
        Assert.assertTrue(t3.getPossition().getX() == 0);
        Assert.assertTrue(t3.getPossition().getY() == 0);
        System.out.println(t3.getOrientation().toString() + " " + t3.getPossition().toString());
    }
}