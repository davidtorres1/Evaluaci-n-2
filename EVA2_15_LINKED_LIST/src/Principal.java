import java.util.LinkedList;
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
        LinkedList <String> Llista = new LinkedList<>();
        Llista.add("hola");
        Llista.add(" ");
        Llista.add("mundo");
        Llista.add(" ");
        Llista.add("cruel");
        Llista.add(" ");
        Llista.add("collections");
        for (String lista1 : Llista) {
            System.out.print(lista1);
        }
        Llista.remove(4);
        System.out.println("");
        for (String lista1 : Llista) {
            System.out.print(lista1);
        }
        System.out.println("");
        System.out.println(Llista);
        Llista.add(4,"bondadoso");
        System.out.println(Llista);
        
    }
    
    
}
