package eva2_7_recursividad2;

import java.util.Scanner;

/**
 *
 * @author Garabato
 */
public class EVA2_7_RECURSIVIDAD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println((str.charAt(str.length() - 1)));*/
        System.out.println(QuitarX("xaxbcx"));
           
    }
    
    
    public static String QuitarX (String sLetras){
    String letra="x";
     
    
    //abcx
    for (int i = 0; i < sLetras.length(); i++) {
        if (sLetras.charAt(0)!=letra.charAt(0)){
        } else if (sLetras.charAt(i)== letra.charAt(0)){
    return QuitarX(sLetras.substring(1, sLetras.length()));
    } else {
        return sLetras.substring(0,sLetras.length()-1);
        }
    }
        for (int i = 0; i < sLetras.length(); i++) {
     if (sLetras.charAt(0)!=letra.charAt(0)&& sLetras.charAt(i)==letra.charAt(0)){
    return sLetras.substring(0, i)+sLetras.substring(i, sLetras.length()-1);
    }            
        }
   
    
    if (sLetras.charAt(sLetras.length()-1)== letra.charAt(0)){
    return sLetras.substring(0, sLetras.length()-1);
    } else { return sLetras;}
    }
 } 

