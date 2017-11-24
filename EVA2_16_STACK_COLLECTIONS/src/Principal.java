import java.util.Stack;

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
        Stack <Double> pila1 = new Stack();
        pila1.push(10.0);
        pila1.push(20.0);
        pila1.push(30.0);
        pila1.push(40.0);
        pila1.push(50.0);
        System.out.println(pila1.pop());
        System.out.println(pila1.pop());
        System.out.println(pila1.peek());
        System.out.println(pila1.pop());
        System.out.println(pila1.peek());
    }
    
}
