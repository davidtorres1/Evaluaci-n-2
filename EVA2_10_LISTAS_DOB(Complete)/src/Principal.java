
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ListaDE lista = new ListaDE();
        lista.agregaNodo(new Nodo(1));
        lista.agregaNodo(new Nodo(2));
        lista.agregaNodo(new Nodo(3));
        lista.agregaNodo(new Nodo(4));
        lista.agregaNodo(new Nodo(5));
        lista.insertarEn(3, new Nodo(12));
        lista.imprimirElementos();
        System.out.println("");
        lista.imprimirElementosInv();
        System.out.println("");
        System.out.println(lista.listaVacia());
        System.out.println(lista.contarElementos());
        System.out.println(lista.valorEn(3));
        System.out.println(lista.encontrar(12));
        
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
    
    class ListaDE{
        Nodo nIni;
        Nodo nFin;
        private int longitud;
        
        public ListaDE(){
            nIni = null;
            nFin = null;
            longitud = 0;
        }
        
        public ListaDE(Nodo nNodo){
            nIni = nNodo;
            nFin = nNodo;
            longitud = 1;
        }
        
        public void agregaNodo(Nodo nNodo){ //AGREGAR UN NODO AL FINAL DE LA LISTA
            if(nIni == null){
                nIni = nNodo;
                nFin = nNodo;
            }else{
                nFin.setnSig(nNodo);
                nNodo.setnPrev(nFin);
                nFin = nNodo;
            }
            longitud++;
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
        
        public void imprimirElementosInv(){
            if(nIni == null){
                System.out.println("LA LISTA ESTA VACIA");
            }else{
                Nodo nTemp = nFin;
                while(nTemp != null){
                    System.out.print(nTemp.getiVal() + " - ");
                    nTemp = nTemp.getnPrev();
                }
            }
        }
        
        public void insertarEn(int iPos,Nodo nNodo){
            if(iPos > longitud || iPos < 0){
                System.out.println("La posicion no es valid");
            }
            else if(iPos == longitud){
                agregaNodo(nNodo);
            }else{
                longitud++;
            Nodo nTemp = nIni;
            if(iPos == 0){
                nNodo.setnSig(nIni);
                nIni.setnPrev(nNodo);
                nIni = nNodo;
            }else{
                for (int i = 0; i < iPos-1; i++) {
                    nTemp = nTemp.getnSig();
                }
                nTemp.getnSig().setnPrev(nNodo);
                nNodo.setnSig(nTemp.getnSig());
                nNodo.setnPrev(nTemp);
                nTemp.setnSig(nNodo);
            }
          }
        }
        
        public boolean listaVacia(){
            if(nIni == null){
                return true;
            }return false;
        }
        
        public void vaciarLista(){
            nIni = null;
        }
        
        public int contarElementos(){
            return longitud;
        }
        
        public int valorEn(int iPos) throws Exception{
            int iVal = 0;
            if(iPos < longitud && iPos >= 0){
                Nodo nTemp = nIni;
                for (int i = 0; i < iPos; i++) {
                    nTemp = nTemp.getnSig();
                }
                iVal = nTemp.getiVal();
            }else{ 
                throw new Exception("La posicion no es valida");
            }
            return iVal;
        }
        
        public int encontrar(int iValor){
            int count = 0;
            int index = -1;
            Nodo nTemp = nIni;
            while(nTemp != null){
                if(iValor == nTemp.getiVal()){
                    index = count;
                    break;
                }
                nTemp = nTemp.getnSig();
                count++;
            }
            return count;
        }
        
        public void borrar(int iValor){
            Nodo nTemp = nIni;
            longitud--;
            if(iValor == 0){
                nIni.getnSig().setnPrev(null);
                nIni = nIni.getnSig();
            }else{
                for (int i = 0; i < iValor; i++) {
                    nTemp = nTemp.getnSig();
                }
                nTemp.getnSig().setnPrev(nTemp.getnPrev());
                nTemp.getnPrev().setnSig(nTemp.getnSig());
            }
        }
        
}

