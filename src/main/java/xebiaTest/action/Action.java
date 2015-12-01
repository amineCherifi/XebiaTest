package xebiaTest.action;

import xebiaTest.enumeration.Direction;
import xebiaTest.model.Tondeuse;

/**
 * Created by adminuser on 11/29/15.
 */
public abstract class Action {
    private Action suivant;

    /**
     * Fixe l'action suivante dans la chaine
     * @param aSuivant
     */
    public void setSuivant(Action aSuivant) {
        suivant = aSuivant;
    }

    /**
     * Appelle le traitement sur l'action courante
     * Puis demande a l'action suivante d'en faire autant,
     * si l'action courante n'a pas géré l'opération.
     * @param pDirection
     * @return Si l'opération a été gérée.
     */
    public Tondeuse operation(Direction pDirection, Tondeuse tondeuse) {
        Tondeuse o = operationSpec(pDirection, tondeuse);
        if( o != null) {
            return o;
        };

        if(suivant != null) {
            return suivant.operation(pDirection, tondeuse);
        }
        return null;
    }

    public abstract Tondeuse operationSpec(Direction pDirection, Tondeuse tondeuse);
}
