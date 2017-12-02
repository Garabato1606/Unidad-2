
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    falsoFor(5);
        System.out.println("");
        falsoForAdelante(5, 1);
    }
    public static void falsoFor(int iVal){
     System.out.print(iVal+" - ");    
        if(iVal > 1){  
        falsoFor(iVal - 1);
            }
    }
    public static void falsoForAdelante(int iFin, int iVal){
        System.out.print(iVal+" - ");
        if(iVal < iFin){
            falsoForAdelante(iFin, iVal + 1);
        }
    }
    
}
