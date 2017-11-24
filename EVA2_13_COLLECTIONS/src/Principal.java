import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList <Integer> a1 = new ArrayList();
        a1.add(100);//0
        a1.add(200);//1
        a1.add(300);//2
        a1.add(400);//3
        a1.add(500);//4
        for (Integer aiml1 : a1) {
            System.out.print(aiml1+"-");
        }
        a1.add(2, 299);
        System.out.println("");
        for (Integer aiml1 : a1) {
            System.out.print(aiml1+"-");
        }
        System.out.println("");
        //recorrer un collection con iteradores
        Iterator iRecorrrArray = a1.iterator();
        while(iRecorrrArray.hasNext()){
            System.out.print(iRecorrrArray.next()+"-");
        }
        System.out.println("");
    }
    
}
