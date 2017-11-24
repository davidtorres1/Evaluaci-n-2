
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.search;


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
        
        
    }
    
}

class Nodo {
    private int iVal;
    private Nodo nSig;
    private Nodo nDer;
    private Nodo nIzq;
    
    public Nodo(){
        iVal =0;
        nSig = null;
        nDer = null;
        nIzq = null;
    }
    public Nodo (int iNum){
        
        iVal=iNum;
        nSig = null;
    }
    public Nodo(int iNum,Nodo nNodo){
        iVal =iNum;
        nSig=nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
    
    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }
}

class Arbol {
    private Nodo nRoot;
    
    public Arbol(){
        nRoot = null;
    }
    public Arbol(Nodo nNodo){
        nRoot = nNodo;
    }
    
    public void agregarNuevoNodo(Nodo nNodo) throws Exception{
        agregarNodo(nRoot, nNodo);
    }
    
    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception{
        if(nRoot == null) {
            nRoot = nNodo;
        }else{
            if(nNodo.getiVal() < nActual.getiVal()){ //MENOR
                if(nActual.getnIzq() == null) { //POSICION VACIA (NULL) AQUI VA
                    nActual.setnIzq(nNodo);
                }else{ //AQUI HAY UN NODO
                    agregarNodo(nActual.getnIzq(), nNodo);
                }
            }else if (nNodo.getiVal() > nActual.getiVal()){ //MAYOR
                if(nActual.getnDer() == null) { //POSICION VACIA (NULL) AQUI VA
                    nActual.setnDer(nNodo);
                }else{ //AQUI HAY UN NODO
                    agregarNodo(nActual.getnDer(), nNodo);
                }                
            }else{ //NO SE ACEPTAN VALORES IGUALES
                throw new Exception("NO SE ACEPTAN VALORES IGUALES");
                }
        }
    }
    
    public void imprimirPreOrder(){
        impPO(nRoot);
    }
    
    public void impPO(Nodo nActual) {
        if(nActual != null){
            System.out.println(nActual.getiVal() + " - "); //VISITAR EL NODO
            impPO(nActual.getnIzq()); //RECORRE EL LADO IZQUIERDO
            impPO(nActual.getnDer()); //RECORRE EL LADO DERECHO
        }
    }
    
    public void imprimirPostOrder(){
        impPostO(nRoot);
    }
    
    public void impPostO(Nodo nActual){
        if(nActual != null){
            impPostO(nActual.getnIzq());
            impPostO(nActual.getnDer());
            System.out.println(nActual.getiVal() + " - ");
        }
    }
    
    public void imprimirInOrder(){
        impIO(nRoot);
    }
    
    public void impIO(Nodo nActual){
        if(nActual != null){
            impIO(nActual.getnIzq());
            System.out.println(nActual.getiVal() + " - ");
            impIO(nActual.getnDer());
        }
    }
    
    public boolean buscar(Nodo nActual, int valorB){
        if(nActual != null){
            if(nActual.getiVal() == valorB){
                return true;
            }
            else{
                return buscar(nActual.getnIzq(),valorB) || buscar(nActual.getnDer(),valorB);
            }
        }
        return false;
    }
}