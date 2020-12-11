package po.model.Monstres;


/**
 * 
 */
public class Monstre {

    private int Attaque;
    private boolean Alive;
    private int Defense;

    /**
     * Default constructor
     */
    public Monstre() {

        float mob = (float) Math.random();
        if (mob > 0.5){
            Barbares barbares = new Barbares();

        }
        else {
            Magiciens magiciens = new Magiciens();
        }
    }


    public final int get_Attaque()
    {
        return Attaque;
    }

    public final int get_Defense()
    {
        return Defense;
    }

    public boolean get_Alive()
    {
        return this.Alive;
    }


    /**
     * 
     */
    public static void genMob() {
        // TODO implement here
    }

}