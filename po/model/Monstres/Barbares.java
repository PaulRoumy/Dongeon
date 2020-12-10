package po.model.Monstres;

import po.model.Utilitaires.Epée;
import po.model.Héros;

import java.sql.SQLOutput;

/**
 * 
 */
public class Barbares extends Monstre {

    private final Object Epée;
    private Object Héros;

    /**
     * Default constructor
     */
    public Barbares() {
        int pv = 20 ;
        Epée = new Epée();
    }

    /**
     * @param cible
     */
    public void attaquer(Héros cible) {
        // TODO implement here
    }

    /**
     * 
     */
    public String recupArme() {
        System.out.println("Utiliser la violence!");
        return "Epée";
    }

    /**
     * 
     */
    public void useAttack() {
        // TODO implement here
    }

    /**
     * @param degats 
     * @param Paralisie
     */
    public void ptDegats(int degats, boolean Paralisie) {
        // TODO implement here
    }

}