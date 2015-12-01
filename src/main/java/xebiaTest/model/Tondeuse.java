package xebiaTest.model;

import xebiaTest.enumeration.Orientation;

import java.awt.*;

/**
 * Created by adminuser on 11/29/15.
 */
public class Tondeuse {
    Point possition;
    Orientation orientation;

    public Tondeuse(Point possition, Orientation orientation) {
        this.possition = possition;
        this.orientation = orientation;
    }

    public Point getPossition() {
        return possition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setPossition(Point possition) {
        this.possition = possition;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
