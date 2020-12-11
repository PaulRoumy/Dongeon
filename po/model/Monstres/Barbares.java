package po.model.Monstres;

import po.model.Utilitaires.Sword;
import po.model.Heros;

/**
 * 
 */
public class Barbares extends Monstre {

    private boolean Alive;


    /**
     * Default constructor
     */
    public Barbares() {
        int pv = 40 ;
        Sword sword = new Sword();
    }

    /**
     * @param cible
     */
    public void attaquer(Heros cible) {
        // TODO implement here
    }

    /**
     * 
     */
    public String recupArme() {
        System.out.println("Utiliser la violence!");
        return "Sword";
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
    public boolean get_Alive()
    {
        return this.Alive;
    }

}