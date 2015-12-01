package xebiaTest.enumeration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by adminuser on 11/29/15.
 * Enumération des differentes Orientation possible de la tondeuse.
 */
public enum Orientation {
    NORD, EST, SUD, OUEST ;

    /**
     * Excécuter l'action d'aller vers la gauche
     * @param o
     * @return
     */
    public Orientation allerAgauche(Orientation o){
        List<Orientation> list = Arrays.asList(Orientation.values());
        int indexOrientation = list.indexOf(o);
        if ( indexOrientation== 0)
            return list.get(list.size()-1);
        else return list.get(indexOrientation - 1);
    }

    /**
     * Excécuter l'action d'aller vers la droite
     * @param o
     * @return
     */
    public Orientation allerAdroite(Orientation o){
        List<Orientation> list = Arrays.asList(Orientation.values());
        int indexOrientation = list.indexOf(o);
        if ( indexOrientation== list.size()-1)
            return list.get(0);
        else return list.get(indexOrientation + 1);
    }
}
