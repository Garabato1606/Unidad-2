
package eva2_17_ordenar_objetos;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Garabato
 */
public class EVA2_17_ORDENAR_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LinkedList <persona> Lista = new LinkedList();
      Lista.add(new persona("Aaron","Rodriguez",19,0,true));
      Lista.add(new persona("Saul","Robles",16,0,true));
      Lista.add(new persona("Nelly","Ruiz",32,2500,false));
      Lista.add(new persona("Oscar","Rodante",48,1500,true));
        for (persona object : Lista) {
            System.out.println("Nombre : "+object.getNombre()+ "/n" +
            "Apellido : "+object.getApellidos()+ "/n" +
            "Edad : "+object.getEdad()+ "/n" +
            "Salario : "+object.getSalario()+ "/n");
        }
        //ORDENAR POR EDADES
        Comparator MiOrdenPersona = new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
          persona p1, p2;
          p1 = (persona)o1;
          p2 = (persona)o2;
          //ORDENAR EDADES
          int iE, iE2;
          iE = p1.getEdad();
          iE2 = p2.getEdad();
          return iE - iE2; 
          }
      };
        Collections.sort(Lista, MiOrdenPersona);
        System.out.println("");
       for (persona object : Lista) {
            System.out.println("Nombre : "+object.getNombre()+ "/n" +
            "Apellido : "+object.getApellidos()+ "/n" +
            "Edad : "+object.getEdad()+ "/n" +
            "Salario : "+object.getSalario()+ "/n");
        }
       
       //ORDENAR SALARIO
       Comparator MiOrdenSal = new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
             persona p1, p2;
             p1 = (persona)o1;
             p2 = (persona)o2;
          double Sal, Sal2;
          Sal = p1.getSalario();
          Sal2 = p2.getSalario();
          return (int) (Sal2 - Sal);
          }
      };
        Collections.sort(Lista, MiOrdenSal);
        System.out.println("");
       for (persona object : Lista) {
            System.out.println("Nombre : "+object.getNombre()+ "/n" +
            "Apellido : "+object.getApellidos()+ "/n" +
            "Edad : "+object.getEdad()+ "/n" +
            "Salario : "+object.getSalario()+ "/n");
        } 
       //ORDENAR POR APELLIDO Y EDAD
   Comparator MiOrdenAE;
        MiOrdenAE = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                persona p1, p2;
                p1 = (persona)o1;
                p2 = (persona)o2;
                //DESPUES DEL RETURN NO LLEVA NADA DESPUES

                int E, E1;
                E = p1.getEdad();
                E1 = p2.getEdad();
                
               char c1,c2;
               c1 = p1.getApellidos().charAt(0);
               c2 = p2.getApellidos().charAt(0);

              if (c1==c2){
              return E-E1; 
              } else {
                return c1-c2;
              }
            }   
        };   
        
    

       
    }
}    
class persona{
     private String Nombre;
     private String Apellidos;
     private int Edad;
     private double Salario;
     private boolean Sexo;
   
   public persona(){
     Nombre="";
    Apellidos="";
     Edad=0;
     Salario=0.0;
     Sexo= false;
   }
   public persona(String Nomb, String Ape, int E, double Sal,Boolean Sex){
     Nombre=Nomb;
    Apellidos=Ape;
     Edad=E;
     Salario=Sal;
     Sexo= Sex;
     }    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }
  } 


