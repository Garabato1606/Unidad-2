/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Garabato
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 5 = " + Factorial(5));
    }
    
    public static int Factorial(int iNum){
    if(iNum == 0){
        return 1;
      }  else {    return iNum * Factorial(iNum - 1);  }

    }
    
}
