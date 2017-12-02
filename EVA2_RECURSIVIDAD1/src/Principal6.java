
public class Principal6 {

    public static void main(String[] args) {
        System.out.println(SumarDigitos(12,0));
    }
    public static int SumarDigitos(int iValor, int Resul){
    if(iValor<10){
        return Resul+iValor;
       } else{
       int iResul= iValor % 10;
       int iCociente= iValor/10;
       Resul=Resul+iResul;
      return SumarDigitos(iCociente, Resul);
     }
  }
    
}
