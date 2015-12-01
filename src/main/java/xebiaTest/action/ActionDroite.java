package xebiaTest.action;

import xebiaTest.enumeration.Direction;
import xebiaTest.model.Tondeuse;

/**
 * Created by adminuser on 11/29/15.
 */
public class ActionDroite extends Action {
    @Override
    public Tondeuse operationSpec(Direction pDirection, Tondeuse tondeuse) {
        if(pDirection.equals(Direction.DROITE)){
            tondeuse.setOrientation(tondeuse.getOrientation().allerAdroite(tondeuse.getOrientation()));
            return tondeuse;
        }
        return null;
    }
}
