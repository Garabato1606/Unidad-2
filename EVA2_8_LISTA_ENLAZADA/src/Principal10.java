
import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Lista L = new Lista();
    L.imprimirLista();
    L.agregarNodo(new Nodo(100));
        System.out.println("");
    L.imprimirLista();     
    L.agregarNodo(new Nodo(200));
        System.out.println("");
    L.imprimirLista();     
    L.agregarNodo(new Nodo(300));
        System.out.println("");
    L.imprimirLista();
    System.out.println("");    
    L.vaciarLista();    
    L.imprimirLista();
        for (int i = 0; i < 10; i++) {
    L.agregarNodo(new Nodo((int)(Math.random()*1000) + 1));           
        }
        System.out.println("La lista tiene: "+L.contarNodos());
        L.imprimirLista();
        System.out.println("");    
        try {    
            System.out.println("El valor es la posicion 5 es " + L.valorEn(5));//Q PASA :o
        } catch (Exception ex) {
            Logger.getLogger(Principal10.class.getName()).log(Level.SEVERE, null, ex);
        }
        L.insertarEn(0, new Nodo(333));
        System.out.println("");    
        L.imprimirLista();
        System.out.println("");        
        L.insertarEn(L.contarNodos(), new Nodo(777));    
        L.imprimirLista();
        System.out.println("");        
        L.insertarEn(7, new Nodo(40000));    
        L.imprimirLista();
    }
    
}
//CLASE NODO
class Nodo{
private int iVal;
private Nodo nSig;
public Nodo(){
iVal=0;
nSig=null;        
}
public Nodo(int iNum){
iVal=iNum;
nSig=null;
}
public Nodo(int iNum, Nodo nNodo){
iVal=iNum;
nSig=nNodo;
}

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

}

//CLASE LISTA
class Lista{
private Nodo nIni;
 private Nodo nFn;       
public Lista(){
nIni = null;
nFn = null;
     }
public Lista(Nodo nNodo){
nIni=nNodo;
nFn = nNodo;
   }
//public void agregarNodo(Nodo nNodo){//AGREGA AL FINAL -EVITARLO COMO LA PESTE
//      if(nIni==null){
//      nIni=nNodo;//LISTA VACIA
//      } else { 
//        Nodo nTemp = nIni;
//        while(nTemp.getnSig()!=null){
//        nTemp = nTemp.getnSig();
//        }
//        nTemp.setnSig(nNodo);
//      }
//    }
public void agregarNodo(Nodo nNodo){ //INSERTAR NODO FINAL - BUENO
 if(nIni == null){ //cuando la lista este vacia
 nIni=nNodo; // NUESTRO NUEVO ES EL PRIMERO
 nFn = nNodo;    //Y EL ULTIMO
 } else {
     nFn.setnSig(nNodo);//AGREGAMOS EL NUEVO NODO AL FINAL DE LA LISTA
     nFn=nNodo;
     //nFn= nFn.getnSig(); ESTO TAMBIEN ES VALIDO
 }   


}
 public void imprimirLista(){
       if(nIni==null){
           System.out.println("LISTA VACIA");
      } else { 
        Nodo nTemp = nIni;
        while(nTemp != null){
            System.out.print(nTemp.getiVal() + " - ");    
        nTemp = nTemp.getnSig();
        }
      }
  }
 public void vaciarLista(){
     nIni = null;
 }
 public int contarNodos(){ //FUERZA BRUTA, SE RECOMIENDO LLEVAR UN CONTEO
     int Cont;             //CADA VEZ QUE SE AGREGUEN O ELIMINEN NODOS
       if(nIni==null){
           Cont=0;
      } else { 
        Cont=0;
        Nodo nTemp = nIni;
        while(nTemp != null){
       Cont++;  
        nTemp = nTemp.getnSig();
        }
      }
       return Cont;
 }
 public int valorEn(int iPos) throws Exception{//DE LA POSICION 0 (PRIMER NUMERO) HASTA n-1
                              //N----->TAMAÑO DEL ARREGLO  
    if ((iPos<0)&&(iPos>=contarNodos())){
       throw new Exception("VALORES ERRONEOS, LA POSICION TIENE QUE SER MAYOR A CERO "+
       "Y MENOR AL TAMAÑO DE LA LISTA");
    }    
 int conta = 0;
 int iVal = 0;
       Nodo nTemp = nIni;  
         while (conta<iPos){    //MOVERNOS POR LA LISTA     
    nTemp = nTemp.getnSig();
    conta++;
   } 
   iVal=nTemp.getiVal(); //nTemp ES EL NODO EN LA POSICION SOLICITADA
 return iVal;
 }
 public void insertarEn(int iPos, Nodo nNodo){
     //FALTAR VALIDACIONES
    if(iPos == 0){//AL INICIO DE LA LISTA
    nNodo.setnSig(nIni);//CONECTAMOS AL PRIMER NODO DE LA LISTA
    nIni=nNodo;
} else if (iPos == (contarNodos())){ //AL FINAL DE LA LISTA
     agregarNodo(nNodo);
    } else {
     int conta = 0;
       Nodo nTemp = nIni;  
         while (conta<(iPos-1)){    //MOVERNOS POR LA LISTA     
    nTemp = nTemp.getnSig();
    conta++;
          }
         nNodo.setnSig(nTemp.getnSig());
         nTemp.setnSig(nNodo);
      }
 }
}