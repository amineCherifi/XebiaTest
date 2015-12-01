package xebiaTest;

import xebiaTest.action.Action;
import xebiaTest.action.ActionAvancer;
import xebiaTest.action.ActionDroite;
import xebiaTest.action.ActionGauche;
import xebiaTest.enumeration.Direction;
import xebiaTest.model.Grille;
import xebiaTest.model.Tondeuse;
import xebiaTest.model.TondeusesActions;
import xebiaTest.tools.EnvironnementGenerator;

import java.io.IOException;
import java.util.LinkedList;

import static java.lang.System.exit;

/**
 * Created by adminuser on 11/29/15.
 */
public class Environnement {
    private static String fichier;
    private static String separateur;

    /**
     * Le main permetant d'exécuter le programme.
     * @param Args
     * @throws IOException
     */
    public static void main(String[] Args) throws IOException {
        if (Args.length == 2) {
            fichier = Args[0];
            separateur = Args[1];
        }else {
            System.out.println("Veuillez introduire le fichier ainsi que le séparateur utilisé ...");
            exit(0);
        }

        EnvironnementGenerator e = new EnvironnementGenerator();
        e.generateFromFile(fichier, separateur);

        Grille grille = new Grille(e.getGrilleX(), e.getGrilleY());
        LinkedList<TondeusesActions> tondeusesActions = e.getList();

        Action gauche = new ActionGauche();
        Action droite = new ActionDroite();
        Action avancer = new ActionAvancer();

        gauche.setSuivant(droite);
        droite.setSuivant(avancer);

        for (TondeusesActions ta : tondeusesActions){
            Tondeuse t = ta.getTondeuse();
            char[] actions = ta.getActions();

            for(char a : actions){
                Tondeuse tmp = gauche.operation(e.getDirection(a), t);
                if (!grille.isOutOfGrille(tmp.getPossition()))
                    t = tmp;
            }
            System.out.println(t.getOrientation().toString() + " "+ t.getPossition());
        }
    }



}

