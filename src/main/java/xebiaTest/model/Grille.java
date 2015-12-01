package xebiaTest.model;

import java.awt.*;

/**
 * Created by adminuser on 11/29/15.
 */
public class Grille {
    int maxX;
    int maxY;

    public Grille(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    /**
     * Vérifier si le Poin p est en dehors de la grille
     * @param p
     * @return
     */
    public Boolean isOutOfGrille(Point p){
        if (p.getX() >= maxX || p.getX() < 0)
            return true;
        if (p.getY() >= maxY || p.getY() < 0)
            return true;
        return false;
    }
}
