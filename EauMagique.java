
import java.util.*;

/**
 * 
 */
public class EauMagique {

    /**
     * Default constructor
     */
    public EauMagique() {
    }



    /**
     * @return
     */
    public int ptattack() {

        return 8;
    }

    /**
     * 
     */
    public boolean gestionPara() {
       float para = (float) Math.random();
       if ( para <=0.1){
           return true;
       }
       return false;
    }

    /**
     * 
     */
    public int nbAttackHeros(int nb) {
        return nb + 1 ;

    }

    /**
     * 
     */
    public int degatsup(int nb,int ptattack) {

        int degatfinal ;
        degatfinal =(nb*2)+ptattack;
        return degatfinal;

    }

}