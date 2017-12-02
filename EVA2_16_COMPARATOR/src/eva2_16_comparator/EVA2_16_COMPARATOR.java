/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Garabato
 */
public class EVA2_16_COMPARATOR {

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
     Comparator cm = new Comparator(){
    @Override
    public int compare(Object o1, Object o2) {
     String sCadena, sCadena2;
     sCadena = (String)o1;
     sCadena2 = (String)o2;
     char c1,c2;
     c1 = sCadena.charAt(0);
     c2 = sCadena2.charAt(0);
     //return c1-c2;
     return c2-c1; //HACER INVERSO
    }
     
     };
        System.out.println("");
     Collections.sort(MiLista, cm);
        System.out.println(MiLista);
        
    }
    
    
}
