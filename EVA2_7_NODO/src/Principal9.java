
public class Principal9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Nodo obj = new Nodo(100);
    Nodo obj2 = new Nodo(200);
    Nodo obj3 = new Nodo(300);
    //OBJ-->OBJ2--->OBJ3
    obj.nSig= obj2;
    obj2.nSig= obj3;
    //IMPRIMIR LOS VALORES
    Nodo nTemp= obj;
    while(nTemp != null){
        System.out.print(nTemp.iVal + " - ");    
    nTemp= nTemp.nSig;
    }
    }
}   class Nodo{
    int iVal=0;
    Nodo nSig;
     public Nodo(){
iVal = 0;
nSig = null;
   }
     public Nodo(int iNum){
     iVal=iNum;
     nSig=null;
     
     }
}