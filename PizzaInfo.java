import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class PizzaInfo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pizza[] pizzas = Pizza.values();
        
        for(Pizza p : Pizza.values()){
            System.out.println(p);
        }
        
        

        System.out.println("end of program");
    }
}
