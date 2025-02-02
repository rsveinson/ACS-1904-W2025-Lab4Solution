import java.util.Scanner;
/** 
 * ACS-1904 Lab 4 Question 4
 * @author: Sveinson
 * 
 * An Enum representing some information about 
 * the planets in our solar system.
 */

public class PlanetInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String planet;

        Planets pl;
        Planets[] planets = Planets.values();

        // print terrestrial planets
        System.out.println("Terrestrial Planets:");

        for(Planets p : planets)
            if(!p.isJovian())
                System.out.println(p.name());

        // print jovian planets
        System.out.println("\nJovian Planets:");

        for(Planets p : planets)
            if(p.isJovian())
                System.out.println(p.getFriendlyName());

        // get planet info        
        System.out.println("\nEnter a planet name:");
        planet = scanner.next().toUpperCase();
        pl = Planets.valueOf(planet);

        System.out.print(pl);

        /* extra challenge code
         * detects incorrect input
         * of planet name
        
        boolean found = false;

        do{
            System.out.println("\nEnter a planet name:");
            planet = scanner.next().toUpperCase();

            for(Planets p : Planets.values()){
                if(p.getFriendlyName().equalsIgnoreCase(planet)){
                    found = true;
                }// test for correct input
                    
            }// end trap user input

        }
        while(!found);
        
        pl = Planets.valueOf(planet);
        System.out.print(pl);
        */
       
        System.out.println();
        System.out.println("end of program");
    }
}
