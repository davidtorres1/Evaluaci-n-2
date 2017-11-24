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
        int dividendo = 180;
        int divisor = 48;
        System.out.println("El mcd de " + dividendo + ", " + divisor + " es: " + mcd(dividendo, divisor));
    }
    
    
    public static int mcd (int dividendo, int divisor){
        if(divisor == 0){
            return dividendo;
        }else{
            int residuo = dividendo % divisor;
            return mcd(divisor, residuo);
        }
        
    }
    
}
