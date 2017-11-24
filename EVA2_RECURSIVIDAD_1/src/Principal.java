/**
 *
 * @author David
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 5;
        System.out.println(suma(numero));
    }
    
    public static int suma(int numero){
        int ultimo = numero % 10;
        int primeros = numero / 10;
        
        if(numero < 10){
            return numero;
        }else{
            return ultimo + suma(primeros);          
        }
    }
    
}
