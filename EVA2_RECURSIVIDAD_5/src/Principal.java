/**
 *
 * @author savb2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(parentesis("(((x))"));
    }
    
    public static boolean parentesis(String cadena){
        
        if(cadena.equals("")){
            return true;
        }
        
        else if(cadena.charAt(0) == '(' && cadena.charAt(cadena.length()-1) == ')'){
            return parentesis(cadena.substring(1, cadena.length()-1));
        }
        
        else return false;
    }
    
}
