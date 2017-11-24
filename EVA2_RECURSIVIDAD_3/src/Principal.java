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
        int base = 3;
        int exponente = 4;
        System.out.println(potencia(base,exponente));
    }
    
    public static int potencia(int base, int exponente){

        if(base >= 1 && exponente >= 1){
            exponente--;
            return base * potencia(base, exponente);           
        }else{
            return 1;
        }
    }
    
}
