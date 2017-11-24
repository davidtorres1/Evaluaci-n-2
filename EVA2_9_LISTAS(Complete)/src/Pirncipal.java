
import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author temporal2
 */
public class Pirncipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Lista miLista = new Lista();
        miLista.imprimirNodos();
        System.out.println("");
       // for (int i = 0; i < 10; i++) {
       //     int iVal = (int)(Math.random()*1000)+1;
       //     miLista.agregarNodoMejorado(new Nodo(iVal));
       // }
        miLista.agregarNodoMejorado(new Nodo(1));
        miLista.agregarNodoMejorado(new Nodo(2));
        miLista.agregarNodoMejorado(new Nodo(3));
        miLista.agregarNodoMejorado(new Nodo(4));
        miLista.agregarNodoMejorado(new Nodo(5));
        miLista.agregarNodoMejorado(new Nodo(6));
        miLista.agregarNodoMejorado(new Nodo(7));
        miLista.agregarNodoMejorado(new Nodo(1));
        miLista.insertarEn(0,new Nodo(9999));    
        try{
            System.out.println("El elemento en la posición  es: " + miLista.valorEn(1));
        }catch (Exception ex) {
            Logger.getLogger(Pirncipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("");
        miLista.imprimirNodos();
        System.out.println("");
        System.out.println("Tu lista tiene " + miLista.contarElementos() + " elementos.");
        System.out.println("");
        System.out.println("Lista vacia? " + miLista.listaVacia());
        System.out.println("");
        System.out.println(miLista.encontrar(9999));
        System.out.println("");
        miLista.borrar(2);
        miLista.imprimirNodos();
    }
}
    
    class Nodo{
        public int iValor;
        private Nodo nSig;
        
        public Nodo(){  //CONSTRUCTOR DEFAULT
            iValor = 0;
            nSig = null;
        }
        
        public Nodo(int iVal){
            iValor = iVal;
            nSig = null;
        }
        
        public Nodo(int iVal, Nodo nNod){ //CONSTRUCTOR PARA AMBOS ATRIBUTOS
            iValor = iVal;
            nSig = nNod;
        }

        public int getiValor() {
            return iValor;
        }

        public void setiValor(int iValor) {
            this.iValor = iValor;
        }

        public Nodo getnSig() {
            return nSig;
        }

        public void setnSig(Nodo nSig) {
            this.nSig = nSig;
        }
        
    }
    
    class Lista{
        private Nodo nIni;
        private Nodo nFin;
        
        public Lista(){
            nIni = null;
            nFin = null;
        }
        
        public Lista(Nodo nNodo){
             nIni = nNodo;
             nFin = nNodo;
        }
        
        public void agregarNodo(Nodo nNodo){  //AGREGAR NODO LOS COLOCA AL FINAL DE LA LISTA
            //MOVERNOS AL FINAL DE LA LISTA
            Nodo nTemp = nIni;
            if(nIni == null){
                nIni = nNodo; // CUANDO LA LISTA ESTA VACIA
            }else{
                while(nTemp.getnSig() != null){
                    nTemp = nTemp.getnSig();
                }
                nTemp.setnSig(nNodo);
            }
        }
        
        public void agregarNodoMejorado(Nodo nNodo){
            if(nIni == null){
                nIni = nNodo;
                nFin = nNodo;
            }else{
                nFin.setnSig(nNodo);
                nFin = nNodo;
            }
        }
        //IMPRIMIR NODOS
        public void imprimirNodos(){
            Nodo nTemp = nIni;
            if(nIni == null){
                System.out.println("LISTA VACIA");
            }else{
                while(nTemp != null){
                    System.out.print(nTemp.getiValor() + " - ");
                    nTemp = nTemp.getnSig();
                }
            }
        }
        
        public void vaciarLista(){
            nIni = null;
            nFin = null;
        }
        
        //CONTAR LOS ELEMENTOS DE LA LISTA
        public int contarElementos(){
            Nodo nTemp = nIni;
            if(nIni == null){
                return 0;
            }else{
                int iCon = 0;
                while(nTemp.getnSig() != null){
                    iCon++;
                    nTemp = nTemp.getnSig();
                }
                return iCon;
            }
        }
        
        public int valorEn(int iPos) throws Exception{
            //VERIFICAR QUE LA POSICION SEA MENOR AL TAMAÑO DEL ARREGLO
            int iVal = 0;
            if(iPos < contarElementos() && (iPos >= 0)){
                Nodo nTemp = nIni;
                for (int i = 0; i < iPos; i++) {
                    nTemp = nTemp.getnSig();
                }
                iVal = nTemp.getiValor();
            }else{
                throw new Exception("La posición no es valida");
            }
            return iVal;
        }
        
        
        public void insertarEn(int iPos, Nodo nNodo){
            if (iPos == 0) {
                nNodo.setnSig(nIni);
                nIni = nNodo;
            }else{
                Nodo nTemp = nIni;
                for (int i = 0; i < iPos-1; i++) {
                    nTemp = nTemp.getnSig();
                }
                    nNodo.setnSig(nTemp.getnSig());
                    nTemp.setnSig(nNodo);
            }
        }
        
        public boolean listaVacia(){
            if(nIni == null){
                return true;
            }
            return false;
        }
        
        
        public int encontrar(int valor){
            int count = 0;
            int index = -1;
            Nodo nTemp = nIni;
            while(nTemp != null){
                if(valor == nTemp.getiValor()){
                    index = count;
                    break;
                }
                nTemp = nTemp.getnSig();
                count++;
            }
            return index;
        }
        
        public void borrar(int valor){
            if(valor == 0){
                nIni = nIni.getnSig();
            }else{
                Nodo temp = nIni;
                for (int i = 0; i < valor-1; i++) {
                    temp = temp.getnSig();
                }
                temp.setnSig(temp.getnSig().getnSig());
                if(temp.getnSig() == null){
                    nFin = temp;
                }
            }
        }
    
}        
    

