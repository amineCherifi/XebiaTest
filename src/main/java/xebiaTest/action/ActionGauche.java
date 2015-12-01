package xebiaTest.action;

import xebiaTest.enumeration.Direction;
import xebiaTest.model.Tondeuse;


/**
 * Created by adminuser on 11/29/15.
 */
public class ActionGauche extends Action {
    @Override
    public Tondeuse operationSpec(Direction pDirection, Tondeuse tondeuse) {
        if(pDirection.equals(Direction.GAUCHE)){
            tondeuse.setOrientation(tondeuse.getOrientation().allerAgauche(tondeuse.getOrientation()));
            return tondeuse;
        }
        return null;
    }
}
