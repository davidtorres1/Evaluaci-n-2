
public class principal {

 
    public static void main(String[] args) {
    int [] aDatos = new int [3];
    aDatos[0]=100;
    aDatos[1]=300;
    aDatos[2]=400;   
        int[] aiBackUp = new int[3];
        for (int i = 0; i < aiBackUp.length; i++) {
            System.out.println(aDatos[i]);
        }
        
        for (int i = 0; i < aiBackUp.length; i++) {
            aiBackUp[i] = aDatos[i];
        }
        for (int i = 0; i < aiBackUp.length; i++) {
            System.out.println(aiBackUp[i]);
        }
    }
    
}
