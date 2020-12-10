package po.model;

import po.model.Utilitaires.Armes;
import po.model.Utilitaires.Epée;

/**
 * 
 */
public class Héros {

    /**
     * Default constructor
     */
    public Héros() {
        int pv = 120;
    }


    /**
     * 
     */
    public Armes[] inventaire;

    /**
     * @param degat 
     * @param pralisie
     */
    public void ptDegat(int degat, boolean pralisie) {
        // TODO implement here
    }

    /**
     * @param Parameter1
     */


    /**
     * 
     */

    /**
     * 
     */
    public int useSword() {
        int Degat = ptDegat(Epée.attack);

        return Degat;
    }

    private void ptDegat(int attack) {
    }

    /**
     * @param degat 
     * @param Paralisie
     */
    public void ptDegat(int degat, boolean Paralisie) {
        // TODO implement here
    }

    /**
     * 
     */
    public void useWater() {
        // TODO implement here
    }

}