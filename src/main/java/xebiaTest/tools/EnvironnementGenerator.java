package xebiaTest.tools;

import xebiaTest.enumeration.Direction;
import xebiaTest.enumeration.Orientation;
import xebiaTest.model.Tondeuse;
import xebiaTest.model.TondeusesActions;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by adminuser on 11/29/15.
 */
public class EnvironnementGenerator {
    int grilleX;
    int grilleY;
    LinkedList<TondeusesActions> list;

    public int getGrilleX() {
        return grilleX;
    }
    public int getGrilleY() {
        return grilleY;
    }
    public LinkedList<TondeusesActions> getList() {
        return list;
    }

    public EnvironnementGenerator() {
        list=  new LinkedList<TondeusesActions>();
    }

    /**
     * Générer l'envirennoment à partir d'un fichier texte.
     * @param fichier
     * @param separateur
     * @throws IOException
     */
    public void generateFromFile(String fichier, String separateur) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fichier));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine(); //read the first line
            if (line != null) {
                if (line.split(separateur).length == 2) {
                    grilleX = Integer.parseInt(line.split(separateur)[0]);
                    grilleY = Integer.parseInt(line.split(separateur)[1]);
                }
                else throw new IllegalArgumentException("the first line of the file should be like : X Y");
            }
            String postionLine = br.readLine();
            while (postionLine != null) {
                String DirectionLine = br.readLine();
                if (DirectionLine != null){
                    Tondeuse tondeuse = new Tondeuse(new Point(Integer.parseInt(postionLine.split(separateur)[0]), Integer.parseInt(postionLine.split(separateur)[1])), getOrientation(postionLine.split(separateur)[2].charAt(0)));
                    char[] actions = DirectionLine.toCharArray();
                    TondeusesActions t = new TondeusesActions(tondeuse, actions);
                    list.add(t);

                    postionLine = br.readLine();
                }
                else throw new IllegalArgumentException("the file should be like, Exemple: 1 2 N\nGAGAGAGAA");
            }
        } finally {
            br.close();
        }
    }

    /**
     * Récupérer l'orientation souhaitée à partir d'une instruction reçue
     * @param s
     * @return
     */
    public Orientation getOrientation(Character s){
        switch (s){
            case 'N': return Orientation.NORD;
            case 'E': return Orientation.EST;
            case 'W': return Orientation.OUEST;
            case 'S': return Orientation.SUD;
            default:
                throw new IllegalArgumentException("Invalid orientation: " + s);
        }
    }

    /**
     * Récupérer la direction souhaitée à partir d'une instruction reçue
     * @param s
     * @return
     */
    public static Direction getDirection(Character s){
        switch (s){
            case 'G': return Direction.GAUCHE;
            case 'D': return Direction.DROITE;
            case 'A': return Direction.AVANCER;
            default:
                throw new IllegalArgumentException("Invalid direction: " + s);
        }
    }
}
