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

class Nodo{
        private int iVal;
        private Nodo nPrev;
        private Nodo nSig;
        
        public Nodo(){
            iVal = 0;
            nPrev = null;
            nSig = null;
        }
        
        public Nodo(int iNum){
            iVal = iNum;
            nPrev = null;
            nSig = null;
        }

        public int getiVal() {
            return iVal;
        }

        public void setiVal(int iVal) {
            this.iVal = iVal;
        }

        public Nodo getnPrev() {
            return nPrev;
        }

        public void setnPrev(Nodo nPrev) {
            this.nPrev = nPrev;
        }

        public Nodo getnSig() {
            return nSig;
        }

        public void setnSig(Nodo nSig) {
            this.nSig = nSig;
        }
               
    }
    
    class Stack{
        Nodo nIni;
        Nodo nFin;
        int longitud;
        
        public Stack(){
            nIni = null;
            nFin = null;
            longitud = 0;
        }
        
        public Stack(Nodo nNodo){
            nIni = nNodo;
            nFin = nNodo;
            longitud = 1;
        }
        
        public void push(Nodo nNodo){ //AGREGAR UN NODO AL FINAL DE LA LISTA
            if(nIni == null){
                nIni = nNodo;
                nFin = nNodo;
            }else{
                nIni.setnPrev(nNodo);
                nNodo.setnSig(nIni);
                nIni  = nNodo;
            }
            longitud++;
        }
        
        public int peek(){
            int iVal = 0;
            if(nIni == null){
                //LANZAR UNA EXCEPCION
                iVal = 0;
            }else{
                iVal = nIni.getiVal();
            }
            return iVal;
        }
        
        public void pop(){
            nIni = nIni.getnPrev();
            longitud--;
        }
        
        public int removerPrimerNodo(){
            int iVal = 0;
            if(nIni == null){
                //LANZAR UNA EXCEPCION
                iVal = 0; //OJO: CERO ES UN ENTERO VALIDO, SIEMPRE ES MEJOR
                          //LANZAR UNA EXCEPCIÓN
            }else{
                iVal = nIni.getiVal();
                //ELIMINAR EL PRIMER NODO DE LA LISTA
                //VERIFICAR CANTIDAD DE NODOS
                //SI SOLO HAY UN NODO nIni = null, nFin = null
                
                if(nIni.getnSig() == null){
                    nIni = null;
                    nFin = null;
                }else{
                    //SI HAY MAS NODOS, RECONECTAR
                    nIni = nIni.getnSig(); //NOS CONECTAMOS AL SEGUNDO NODO DE LA LISTA
                    nIni.setnPrev(null);
                }
            }
            return iVal;
        }
        
        public boolean listaVacia(){
            if(nIni == null){
                return true;
            }
            return false;
        }
    
        public void vaciarLista(){
            nIni = null;
        }

        public int contarElementos(){
            return longitud;
        }
        
        public void imprimirElementos(){
            if(nIni == null){
                System.out.println("LA LISTA ESTA VACIA");
            }else{
                Nodo nTemp = nIni;
                while(nTemp != null){
                    System.out.print(nTemp.getiVal() + " - ");
                    nTemp = nTemp.getnSig();
                }
            }
        }
    }