
package eva2_13_collection_linked_list;

import java.util.LinkedList;


public class EVA2_13_COLLECTION_LINKED_LIST {


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
    MiLista.remove(4);
        System.out.println("");
        for (String string : MiLista) {
            System.out.print(string);
        }
     MiLista.add(4, "BONDADOSO");
        System.out.println("");
      for (String string : MiLista) {
            System.out.print(string);
        }
        System.out.println("");
        System.out.println("LA LISTA TIENE " + MiLista.size());
    }
    
}
