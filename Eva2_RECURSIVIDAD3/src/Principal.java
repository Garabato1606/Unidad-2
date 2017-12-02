/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garabato
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        System.out.println("el resultado de elevar 3 a la 1 es: " + elevar(3,1));
        System.out.println("el resultado de elevar 3 a la 2 es: " + elevar(3,2));
        System.out.println("el resultado de elevar 3 a la 3 es: " + elevar(3,3));
        }catch(Exception ex){
            System.out.println("Solo numeros mayores a 0, porfavor!");
        }
    }
    public static int elevar(int iVal,int iExp) throws Exception{
        if(iVal>0 && iExp>0){
        if(iExp==1){
            return iVal;
        }else{
            return iVal*elevar(iVal, iExp-1);
        }

    }else{
    throw new Exception("Valores no validos");
}
}
}