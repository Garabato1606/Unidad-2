/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_tipos_genericos;

/**
 *
 * @author Garabato
 */
public class EVA2_12_Tipos_Genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Nodo <Integer> nNodo = new Nodo(100);
        System.out.println(nNodo.getValor()); //REGRESA
        nNodo.setValor(200);//INSERTA
    }
    
}
class Nodo <T>{
     private T Valor;
     public Nodo(T nuevoValor){
     Valor= nuevoValor;
     }

    public T getValor() {
        return Valor;
    }

    public void setValor(T Valor) {
        this.Valor = Valor;
    }
}
