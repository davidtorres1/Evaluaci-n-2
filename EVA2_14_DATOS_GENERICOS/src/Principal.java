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
        Nodo <Double> nMiNodo = new Nodo(100.2);
        nMiNodo.setiVal(50.2);
        System.out.println(nMiNodo.getiVal());
    }
    
    
}
class Nodo <Gatos>{
    private Gatos iVal;
    private Nodo nSig;
    private Nodo nPrev;
    public Nodo(Gatos nuevoVal){
        iVal = nuevoVal;
        nSig=null;
        nPrev=null;
    }

    public Gatos getiVal() {
        return iVal;
    }

    public void setiVal(Gatos iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
    
}