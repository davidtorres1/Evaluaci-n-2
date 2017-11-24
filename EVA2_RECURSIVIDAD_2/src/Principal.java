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
        String palabra = "xaxbxcx";
        System.out.println(borrador(palabra));
    }
    
    public static String borrador(String palabra){
        if(palabra.length() == 1){
            if (palabra.charAt(0) == 'x'){
                return "";
            }
            else return palabra;
        }
        else if(palabra.charAt(0) == 'x'){
            return borrador(palabra.substring(1));
        }
        else{
            return palabra.charAt(0) + borrador(palabra.substring(1));
        }
    }
    
}
