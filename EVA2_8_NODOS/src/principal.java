
public class principal {

  
    public static void main(String[] args) {
        Nodo nObj1=new Nodo();
        nObj1.iVal=100;
        
        Nodo nObj2=new Nodo();
        nObj2.iVal=200;
        
        Nodo nObj3=new Nodo();
        nObj3.iVal=300;
        //VINCULARLOS
        //Obj1-->ojb2-->obj3
        nObj1.nSig=nObj2;
        nObj2.nSig=nObj3;
        
        System.out.println(nObj1.iVal);
        System.out.println(nObj2.iVal);
        System.out.println(nObj3.iVal);
        Nodo nMover=nObj1;
        while(nMover!=null){
            System.out.println(nMover.iVal);
            nMover=nMover.nSig;
        
        
        }
    }
    
  
}
class Nodo{
    public int iVal;
    public Nodo nSig;
    public Nodo(){
    nSig=null;
    }

}