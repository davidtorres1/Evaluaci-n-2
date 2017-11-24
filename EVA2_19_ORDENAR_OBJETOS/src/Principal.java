
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList <Persona> llPersonas = new LinkedList();
        llPersonas.add(new Persona("Alonso", "Hernandez", 35, true, 1));
        llPersonas.add(new Persona("Rubén", "Chávez", 10, true, 100000));
        llPersonas.add(new Persona("Zenobio", "Zambia", 7, true, 1000000));
        llPersonas.add(new Persona("Juana", "Perez", 80, false, 3523));
        llPersonas.add(new Persona("Ramona", "Ordoñez", 13, false, 888));
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getsNom() + "\n" + 
                               "Apellido: " + llPersona.getsApe() + "\n" + 
                               "Edad: " + llPersona.getiEd() + "\n" + 
                               "Sexo: " + llPersona.isbSex() + "\n" + 
                               "Salario: " + llPersona.getdSal() + "\n");
        }
        Comparator cmCriterioOrden = new Comparator(){//CLASE ANÓNIMA
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String sApe1, sApe2;
                sApe1 = p1.getsApe();
                sApe2 = p2.getsApe();
                char c1, c2;
                c1 = sApe1.charAt(0); //ARREGLO
                c2 = sApe2.charAt(0);
                return c1 - c2;
            }
        }; 
                
        System.out.println("");
        System.out.println("LISTA ORDENADA (APELLIDO)");
        Collections.sort(llPersonas, cmCriterioOrden);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getsNom() + "\n" + 
                               "Apellido: " + llPersona.getsApe() + "\n" + 
                               "Edad: " + llPersona.getiEd() + "\n" + 
                               "Sexo: " + llPersona.isbSex() + "\n" + 
                               "Salario: " + llPersona.getdSal() + "\n");
        }
        
        Comparator cmCriterioEdad = new Comparator(){//CLASE ANÓNIMA
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int iEd1, iEd2;
                iEd1 = p1.getiEd();
                iEd2 = p2.getiEd();
                return iEd1 - iEd2;
            }
        };
        
        System.out.println("");
        System.out.println("LISTA ORDENADA (EDAD)");
        Collections.sort(llPersonas, cmCriterioEdad);
        for (Persona llPersona : llPersonas) {
            System.out.println("Nombre: " + llPersona.getsNom() + "\n" + 
                               "Apellido: " + llPersona.getsApe() + "\n" + 
                               "Edad: " + llPersona.getiEd() + "\n" + 
                               "Sexo: " + llPersona.isbSex() + "\n" + 
                               "Salario: " + llPersona.getdSal() + "\n");
    }
    
  }
}

class Persona{
    
    private String sNom;
    private String sApe;
    private int iEd;
    private boolean bSex;
    private double dSal;
    
    
    public Persona(String sNom, String sApe, int iEd, boolean bSex, double dSal) {
        this.sNom = sNom;
        this.sApe = sApe;
        this.iEd = iEd;
        this.bSex = bSex;
        this.dSal = dSal;
    }
    
    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsApe() {
        return sApe;
    }

    public void setsApe(String sApe) {
        this.sApe = sApe;
    }

    public int getiEd() {
        return iEd;
    }

    public void setiEd(int iEd) {
        this.iEd = iEd;
    }

    public boolean isbSex() {
        return bSex;
    }

    public void setbSex(boolean bSex) {
        this.bSex = bSex;
    }

    public double getdSal() {
        return dSal;
    }

    public void setdSal(double dSal) {
        this.dSal = dSal;
    }
    
}