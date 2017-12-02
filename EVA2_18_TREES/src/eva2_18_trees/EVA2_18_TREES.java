/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_trees;

/**
 *
 * @author Garabato
 */
public class EVA2_18_TREES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     Tree trMiArbol = new Tree(new Nodo(100));
   try{
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(90));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(101));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(92));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(80));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(110));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(105));
     trMiArbol.agregarNodo(trMiArbol.getnRoot(), new Nodo(91));
     trMiArbol.PreOrden();
       System.out.println("");
     trMiArbol.POSOrden();
    }  catch(Exception ex) {
    }
       System.out.println("");
        trMiArbol.INOrden();   
   
    }
}

class Nodo {

    private int iVal;
    private Nodo nDer;
    private Nodo nIzq;

    public Nodo() {
        iVal = 0;
        nDer = null;
        nIzq = null;
    }
    public Nodo(int iVal) {
        this.iVal = iVal; // PONERLE THIS PARA QUE NO SE CONFUNDA CON LA OTRA CLASE
        nDer = null;
        nIzq = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getSig() {
        return nDer;
    }

    public void setSig(Nodo Sig) {
        this.nDer = Sig;
    }

    public Nodo getPrev() {
        return nIzq;
    }

    public void setPrev(Nodo prev) {
        this.nIzq = prev;
    }

}

class Tree {


    private Nodo nRoot;

    public Tree() {
        nRoot = null;
    }

    public Tree(Nodo nNodo) {
        nRoot = nNodo;
    }
        public Nodo getnRoot() {
        return nRoot;
    }

    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception {
        if (nRoot == null) {
            nRoot = nNodo;
        } else{//NO ESTA VACIA LA LISTA
        if (nNodo.getiVal() < nActual.getiVal()) { //SI ES MENOR
            if (nActual.getPrev() == null) { //AQUI VA NUESTRO NODO
                nActual.setPrev(nNodo);
            } else {
                agregarNodo(nActual.getPrev(), nNodo);//LLAMADA RECURSIVA
            }
        } else if (nNodo.getiVal() > nActual.getiVal()) {//SI ES MAYOR
            if (nActual.getSig() == null) { //AQUI VA NUESTRO NODO
                nActual.setSig(nNodo);
            } else {
                agregarNodo(nActual.getSig(), nNodo);//LLAMADA RECURSIVA
            }
        }
        else{//SI ES IGUA
          throw new Exception("NO PUEDE HABER VALORES REPETIDOS");
          }
        }
    }
public void PreOrden(){
     pOT(nRoot);
  }
private void pOT(Nodo nActual){
  if(nActual!=null){
      System.out.print(nActual.getiVal()+" - ");//VISITAR EL NODO
      pOT(nActual.getPrev());
      pOT(nActual.getSig());
   }
 }
public void POSOrden(){
     pOD(nRoot);
  }
private void pOD(Nodo nActual){
  if(nActual!=null){

      pOD(nActual.getPrev());
      pOD(nActual.getSig());
      System.out.print(nActual.getiVal()+" - ");//VISITAR EL NODO      
   }
 }
public void INOrden(){
     IOD(nRoot);     
  }
private void IOD(Nodo nActual){
  if(nActual!=null){

      IOD(nActual.getPrev());
      System.out.print(nActual.getiVal()+" - ");//VISITAR EL NODO         
      IOD(nActual.getSig());
   
   }
 }

}
     

