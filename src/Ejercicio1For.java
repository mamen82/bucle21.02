
/* solicita un numero al usuario  y muestra en panatallla  desdel 1 hasta el numero ingresado.
Requisito: el numero es un entero positivo
1. declaracion del escanner
2. soicitar y leer el numero
3. crear el bucle for con numero indicado en la condicion
4. dentro del bucle for ir mostrando el valor de i*****
 */

import java.util.Scanner;

public class Ejercicio1For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");//solicita
        int numero = sc.nextInt();//leer
        for (int i = 1; i <= numero; i++) {
            System.out.println(" El numero es " +i);
        }


sc.close();
    }
}
