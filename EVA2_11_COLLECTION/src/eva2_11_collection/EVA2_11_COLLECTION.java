
package eva2_11_collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Garabato
 */
public class EVA2_11_COLLECTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> MiArregloLista = new ArrayList();
        MiArregloLista.add((int)(Math.random() * 100)+1);
        MiArregloLista.add((int)(Math.random() * 100)+1);
        MiArregloLista.add((int)(Math.random() * 100)+1);
        MiArregloLista.add((int)(Math.random() * 100)+1);
        MiArregloLista.add((int)(Math.random() * 100)+1);
        for (Integer integer : MiArregloLista) {
            System.out.print(integer +" - ");
        }
        MiArregloLista.add(2,9999);
        System.out.println("");
        for (Integer integer : MiArregloLista) {
            System.out.print(integer +" - ");
        }
        System.out.println("RECORRIDO CON EL ITERATOR");
        Iterator itRecorreArreglo;
        itRecorreArreglo = MiArregloLista.iterator();
        while(itRecorreArreglo.hasNext()){
            System.out.print(itRecorreArreglo.next() + " - ");   
        }
    }
    
}
