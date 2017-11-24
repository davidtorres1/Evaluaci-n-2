
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
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i) + " - ");
             
        }

    }
    
    public static int fibo(int numero){
        /*if(numero == 0){
            return 0;
        }
        else if(numero == 1){
            return 1;
        }
        else{
            return fibo(numero - 1) + fibo(numero - 2);
        }*/
        
        switch(numero){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibo(numero - 1) + fibo(numero - 2);
        }
    }
    
}
