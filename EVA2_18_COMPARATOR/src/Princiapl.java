
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author temporal2
 */
public class Princiapl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList <String> llMiLista = new LinkedList();
        llMiLista.add("Hola");
        llMiLista.add(" ");
        llMiLista.add("Mundo");
        llMiLista.add(" ");
        llMiLista.add("Cruel");
        llMiLista.add(" ");
        llMiLista.add("Collections");
        
        for (String llMiLista1 : llMiLista) {
            System.out.println(llMiLista);
        }
        System.out.println("");
        Collections.sort(llMiLista);
        for (String llMiLista1 : llMiLista) {
            System.out.println(llMiLista);
            }
    }
    
}
