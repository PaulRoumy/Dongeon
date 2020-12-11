package po.model.Utilitaires;

import java.util.*;
/** Classe permettant de créer des nombres aléatoires
 * @author Jonathan Mortier
 *
 * TODO rien de spécial pour l'instant
 */
public class Alea
{

    static private Random R = new Random();

    /** Fonction générant un entier aléatoire entre
     * min et max
     * @param min La borne inférieure du nombre aléatoire
     * @param max La borne supérieure du nombre aléatoire
     * @return un nombre aléatoire entre min et max
     */
    static public int EntierEntre( int min, int max )
    {
        int val = R.nextInt(max-min+1) + min;

        return val;
    }
}
