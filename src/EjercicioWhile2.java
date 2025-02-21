
/* crea una aplicacion para calcular los datos estadisticos  de las edadees de los alumnos de un centro educativo.
Se indicaran las edades hasta que se indique un dato negativo.  while <=0->
1. la suma de las edades  - contadoredad
2. la media de las edades  - calculo final
3. el numero de los alumnos ingresados  contadoralunos
4. cuanrtos son mayores de edad -if
 */

import java.util.Scanner;

public class EjercicioWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad=0,contadorEdad=0,contadorAlumnos=0, mayorEdad=0;
        double mediaEdad;
        while(edad>=0){
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt(); // si se escribe un negativo... se indica que no puede calcular.... se sale del bucle
            if(edad>=0){
                contadorEdad+=edad;
                contadorAlumnos++;
                if (edad>=18){
                    mayorEdad++;
                }


            }else{
                System.out.println("El programa ha llegado a su fin");
            }
        }
        mediaEdad=(double) contadorEdad/contadorAlumnos;
        System.out.println("Estadistica del alumno: " +
                "\n Total edades" +contadorEdad+
                "\n Total de alumnos" +contadorAlumnos+
                "\n Media:" +mediaEdad+
                "\n Mayor edad:" +mayorEdad);










    }
}
