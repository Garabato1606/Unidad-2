
public class Principal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num = 180;
        int Num1 = 48;
        System.out.println("El resultado de " +Num+ " y "+ Num1+" es:");
        System.out.println(CalculaMCD(Num, Num1));
    }
    public static int CalculaMCD(int iDeno, int iDiv){
    if (iDiv==0){
      return iDeno;
        } else {
         int iResul = iDeno % iDiv;
         return CalculaMCD(iDiv, iResul);
         }
    }
    
}
