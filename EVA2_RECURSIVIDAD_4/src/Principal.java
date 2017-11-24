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
        String palabra = "yyzzzaa";
        System.out.println(limpia(palabra));
    }
    
    public static String limpia(String palabra){
        if(palabra.length() == 1){
            return palabra;
        }
        else if(palabra.charAt(0) == palabra.charAt(1)){
            return limpia(palabra.substring(1));
        }
        else{
            return palabra.charAt(0) + limpia(palabra.substring(1));
        }
    }
    
}
