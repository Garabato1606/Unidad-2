
package eva2_15_sort;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Garabato
 */
public class EVA2_15_SORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LinkedList <String> MiLista = new LinkedList();   
     MiLista.add("HOLA");
    MiLista.add(" ");
    MiLista.add("MUNDO");
    MiLista.add(" ");
    MiLista.add("CRUEL");
    MiLista.add(" ");
    MiLista.add("COLLECTIONS!!!");
        for (String string : MiLista) {
            System.out.print(string);
        }  
        System.out.println("");
      Collections.sort(MiLista);
        for (String string : MiLista) {
            System.out.print(string);
        }
    }
    
}
