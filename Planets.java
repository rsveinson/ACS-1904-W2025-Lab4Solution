
/**
 * Enumeration class Planets - limited information about each of the 
 *                              planets in our solar system
 *
 * @author Sveinson
 * @version Lab 4 Q 4
 */
public enum Planets
{
    MERCURY("Mercury", 0, false),   VENUS("Venus", 0, false),
    EARTH("Earth", 1, false), MARS("Mars", 2, false),
    JUPITER("Jupiter", 67, true), SATURN("Saturn", 62, true),
    URANUS("Uranus", 27, true), NEPTUNE("Neptune", 14, true);

    private String friendlyName;    
    private int moons;
    private boolean jovian;

    private Planets(String fn, int m, boolean j){
        friendlyName = fn;
        moons = m;
        jovian = j;
    }

    public String getFriendlyName(){
        return friendlyName;
    }

    public int getMoons(){
        return moons;
    }

    public boolean isJovian(){
        return jovian;
    }

    // toSting() method

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(friendlyName);
        sb.append(" has ");
        sb.append(moons);

        /* this conditional is optional
         * it is acceptable to simply append
         * " moons "
         */
        sb.append(getMoons() == 1 ? " moon." : " moons.");

        return sb.toString();
    }

}
