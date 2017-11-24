/**
 *
 * @author temporal2
 */
public class Pincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            System.out.println(cadenaRecursiva(i));
        }
        for (int i = 9; i > 0; i--) {
            System.out.println(cadenaRecursiva(i));
        }
        
        int count = 0;
        while(count <= 20){
            if(count <= 10){
               System.out.println(cadenaRecursiva(count)); 
            }
            else{
                System.out.println(cadenaRecursiva(20 - count));
            }
            count++;
        }
    }
    
    public static String cadenaRecursiva(int iNum){
        if(iNum > 1){
            return "*" + cadenaRecursiva(iNum - 1);
        }
        else if(iNum <= 0){
            return "";
        }else{
            return "*";
        }
    }
}  

