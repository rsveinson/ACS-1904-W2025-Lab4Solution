
/**
 * Enumeration class Pizza 
 *
 * @author Sveinson
 */


public enum Pizza
{
    CHEESE("Cheese", 12.95), CALABRIA("Calabria", 15.99), ROMA("Roma", 16.99), 
    TUSCAN("Tuscan", 18.00), MILANESE("Milanese",21.50);
    
    /* fields
     * should be named similarily
     * order doesn't matter
     * must be these data types
     */
    private String friendlyName;
    private double price;

    
    /* constructor
     * must be scoped private
     * order of parameters must be the same as the order
     * of the arguments in brackets above
     */
    private Pizza(String fn, double p){
        friendlyName = fn;
        price = p;
    }// end constructor
    
    /* getters
     * no setters
     * must be a getter for each field
     */
    public double getPrice(double p){
        return p;
    }
    
    public String getFriendlyName(){
        return friendlyName;
    }
    
    @Override
    public String toString(){
      StringBuilder st = new StringBuilder(friendlyName + ": $" + price);
        
      return st.toString();
    }
}
