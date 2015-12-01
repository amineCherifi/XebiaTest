package xebiaTest.action;

import xebiaTest.enumeration.Direction;
import xebiaTest.enumeration.Orientation;
import xebiaTest.model.Tondeuse;

import java.awt.*;

/**
 * Created by adminuser on 11/29/15.
 */
public class ActionAvancer extends Action {
    @Override
    public Tondeuse operationSpec(Direction pDirection, Tondeuse tondeuse) {
        if(pDirection.equals(Direction.AVANCER)){
            tondeuse.setPossition(avancer(tondeuse));
            return tondeuse;
        }
        return null;
    }

    /**
     * Avancer selon la direction actuelle
      * @param tondeuse
     * @return Point
     */

    public Point avancer(Tondeuse tondeuse){
        if (tondeuse.getOrientation().equals(Orientation.EST)) return new Point(tondeuse.getPossition().x + 1, tondeuse.getPossition().y);
        if (tondeuse.getOrientation().equals(Orientation.OUEST)) return new Point(tondeuse.getPossition().x - 1, tondeuse.getPossition().y);
        if (tondeuse.getOrientation().equals(Orientation.NORD)) return new Point(tondeuse.getPossition().x , tondeuse.getPossition().y + 1);
        if (tondeuse.getOrientation().equals(Orientation.SUD)) return new Point(tondeuse.getPossition().x , tondeuse.getPossition().y - 1);
        return null;
    }
}
