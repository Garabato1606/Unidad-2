//HACER EXCEPCION
public class Pricipal12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
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

class Queue{
private Nodo Ini;
private Nodo Fin;

public Queue(){
Ini=null;
Fin=null;
  }

public Queue(Nodo nNodo){
    Ini=nNodo;
    Fin=Fin;

    } 
  
  public int LeerPrimerNodo(){
  if(Ini==null){
      return 0;
    }else{
      return Ini.getiVal();
     }
   }
  public int RemoverPrimerNodo){
  if(Ini==null){
      return 0;
    }else{
       iVal=Ini.getiVal();
     }
   if()  
  }
}


