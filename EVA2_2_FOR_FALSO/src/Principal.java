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
        //IMPRIMIR LOS NUMEROS DEL 5 AL 1
        for (int i = 5; i >= 1; i--) {
                System.out.println("i = " + i);
            }
        System.out.println();
        falsoFor(1);
        System.out.println();
        falsoForUp(1,10);
    }
    
    public static void falsoFor(int numero){
        System.out.print(numero + " - "); //ACCIÓN
        if(numero < 10) //CONDICIÓN PARA TERMINAR LA RECURSION
            falsoFor(numero + 1); //LLAMADA RECURSIVA
    }
    
    public static void falsoForUp(int inicio, int fin) {
            System.out.print(inicio + " - ");
            if(inicio < fin)
                falsoForUp(inicio + 1, fin);
    }
}
