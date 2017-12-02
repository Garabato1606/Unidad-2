
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 1; i <= 10; i++) {
        System.out.println(CrearCadena(i));            
        }
        for (int i = 9; i >= 1; i--) {
        System.out.println(CrearCadena(i));            
        }
        
       System.out.println("");*/
       int aum=1;
       int dec=9;       
       do{
           if(aum<=10){
           System.out.println(CrearCadena(aum));}

           if(aum>10){
               System.out.println(CrearCadena(dec));
               dec--;}
               
            aum++;   
       }while(aum<=20 && dec>=1);
        

    }
    public static String CrearCadena(int iNum){
    if (iNum>1){
        return "*" + CrearCadena(iNum-1);
       } else{ 
        return "*";    }
    }
}
