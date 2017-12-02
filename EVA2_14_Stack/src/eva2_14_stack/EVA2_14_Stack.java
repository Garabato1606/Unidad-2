
package eva2_14_stack;

import java.util.Stack;

/**
 *
 * @author Garabato
 */
public class EVA2_14_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Double> Mipila = new Stack();
        Mipila.push(20.0);
        Mipila.push(18.0);
        Mipila.push(17.0);
        Mipila.push(50.0);
        Mipila.push(66.0);
        System.out.println(Mipila.pop()); //te manda el valor y lo elimina
        System.out.println(Mipila.pop());
        System.out.println(Mipila.peek()); //Leer el valor pero no lo elimina
        System.out.println(Mipila.peek()); //Leer el valor pero no lo elimina
    }
    
}
