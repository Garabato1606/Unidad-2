package eva2_recursividad5;

/**
 *
 * @author Garabato
 */
public class EVA2_RECURSIVIDAD5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(""+Parentesis("((kjhgfdf))"));
        //String c="(())";
        //System.out.println(""+c.substring(1,c.length()-1));
        //Patentesis()
    }

    public static boolean Parentesis(String yolo) {
        if (yolo.equals("")) {
            return true;
        } else if (yolo.charAt(0) == '(' && yolo.charAt(yolo.length()-1) == ')') {
            return Parentesis(yolo.substring(1, yolo.length() - 1));
        } else {
            return false;
        }

    }
}
