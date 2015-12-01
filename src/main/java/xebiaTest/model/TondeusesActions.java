package xebiaTest.model;

/**
 * Created by adminuser on 11/29/15.
 */
public class TondeusesActions {
    Tondeuse tondeuse;
    char[] actions;

    public TondeusesActions(Tondeuse tondeuse, char[] actions) {
        this.tondeuse = tondeuse;
        this.actions = actions;
    }

    public Tondeuse getTondeuse() {
        return tondeuse;
    }

    public char[] getActions() {
        return actions;
    }
}
