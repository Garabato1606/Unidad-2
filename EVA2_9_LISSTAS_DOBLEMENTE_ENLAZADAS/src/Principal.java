
import java.util.logging.Level;
import java.util.logging.Logger;

//TERMINAR
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ListaDE L = new ListaDE();
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
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
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
class Nodo{
private int iVal;
private Nodo Sig;
private Nodo prev;

public Nodo(){
iVal=0;
Sig=null;
prev=null;
  }

    Nodo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getSig() {
        return Sig;
    }

    public void setSig(Nodo Sig) {
        this.Sig = Sig;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

}

class ListaDE{
private Nodo Ini;
private Nodo Fin;

public ListaDE(){
Ini=null;
Fin=null;
  }

public ListaDE(Nodo nNodo){
    Ini=nNodo;
    Fin=Fin;

 } 
public void agregarNodo(Nodo nNodo){ //INSERTAR NODO FINAL - BUENO
 if(Ini == null){ //cuando la lista este vacia
 Ini=nNodo; // NUESTRO NUEVO ES EL PRIMERO
 Fin = nNodo;    //Y EL ULTIMO
 } else {
     Fin.setSig(nNodo);//AGREGAMOS EL NUEVO NODO AL FINAL DE LA LISTA
     Fin=nNodo;
     //nFn= nFn.getnSig(); ESTO TAMBIEN ES VALIDO
 }   


}
 public void imprimirLista(){
       if(Ini==null){
           System.out.println("LISTA VACIA");
      } else { 
        Nodo nTemp = Ini;
        while(nTemp != null){
            System.out.print(nTemp.getiVal() + " - ");    
        nTemp = nTemp.getSig();
        }
      }
  }
  public void vaciarLista(){
     Ini = null;
     Fin = null;
 }
   public int contarNodos(){ //FUERZA BRUTA, SE RECOMIENDO LLEVAR UN CONTEO
     int Cont;             //CADA VEZ QUE SE AGREGUEN O ELIMINEN NODOS
       if(Ini==null){
           Cont=0;
      } else { 
        Cont=0;
        Nodo nTemp = Ini;
        while(nTemp != null){
       Cont++;  
        nTemp = nTemp.getSig();
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
       Nodo nTemp = Ini;  
         while (conta<iPos){    //MOVERNOS POR LA LISTA     
    nTemp = nTemp.getSig();
    conta++;
   } 
   iVal=nTemp.getiVal(); //nTemp ES EL NODO EN LA POSICION SOLICITADA
 return iVal;
 }
 public void insertarEn(int iPos, Nodo nNodo){
     //FALTAR VALIDACIONES
    if(iPos == 0){//AL INICIO DE LA LISTA
    nNodo.setSig(Ini);//CONECTAMOS AL PRIMER NODO DE LA LISTA
    Ini=nNodo;
} else if (iPos == (contarNodos())){ //AL FINAL DE LA LISTA
     agregarNodo(nNodo);
    } else {
     int conta = 0;
       Nodo nTemp = Ini;  
         while (conta<(iPos-1)){    //MOVERNOS POR LA LISTA     
    nTemp = nTemp.getSig();
    conta++;
          }
         nNodo.setSig(nTemp.getSig());
         nTemp.setSig(nNodo);
      }

  }
} 