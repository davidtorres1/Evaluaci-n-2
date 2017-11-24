/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + factorial(5));
    }
    
    public static int factorial(int numero){
        if(numero > 0){
            return numero * factorial(numero - 1);
        }
        else{
            return 1;
        }
    }
    
}
