package po.model;

import po.model.Salle;
/**
 * 
 */
public class Dongeon {


    int nbSalle = 5;
    Salle[] Salle = {};

    public Dongeon() {
        for (int i = 0; i < nbSalle; i++) {

            Salle[i] = new Salle();

        }
    }
}




