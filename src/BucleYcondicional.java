

/**
 * solicita 6 notas al usuario del los alumnos del instituto y segun la sigiente valoracion muestra al final de la ejecucion
 * los aprobados (es <=5)
 * los condicionados (los que tienen nota de 4) (es==4)
 * los suspensos (es nota<4 && nota<=0)
 *
 * Tenemos Tres contadores
 * for..  for (int i=1;....
 * while (contador<=6){
 *     contador++
 * }
 *
 */


import java.util.Scanner;
public class BucleYcondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // declaro el escaner
        int nota=0;                             // declaro la constante nota
        int  contadoraprobados=0;               // declaro las constantes
        int contadorcondicionados=0;            // declaro las constantes
        int contadorsuspensos=0;                // declaro las constantes
        double media=0;                         // declaro la media y como puede salir decimales pongo un double
        for(int i= 1; i<=6; i++) {              // pido la nota de 6 alumnos
            System.out.println("Dime la nota del  alumnos "+ i);    // lo imprimo en pantalla
            nota = sc.nextInt();                // leo el dato
            media+=nota;                         // con esto sumo los datos y hago la media de las notas
            if (nota >= 5) {                    //pido los aprobados
                contadoraprobados++;            // leo los aprobados
            } else if (nota == 4) {             // pido los condicionados
                contadorcondicionados++;        // leo los condicionados
            } else {                            //se pasa a los suspensos
                contadorsuspensos++;            // leo los suspensos

            }
        }
                System.out.println("Alumnos aprobados: " + contadoraprobados);          // imprimo en pantalla los aprobados
                System.out.println("Alumnos condicionados: " + contadorcondicionados); // imprimo en pantalla los condicionados
                System.out.println("Alumnos suspensos: " + contadorsuspensos);          // imprimpo en pantalla los suspensos
                System.out.println("Nota media:" + (media/6));    // imprimo en pantalla la nota media de las 6 notas







        sc.close();

    }
}
