
/*
Solicita al usuario un numero y dibuja un triangulo con base=num y altura=n
Ejemplo num=4

        *
       * *
       ****
     * * * *
 */


import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.println("Indique la base y altura del Triangulo");
        int num=new Scanner(System.in).nextInt();

        for(int fila=1;fila<=num;fila++){
            // tenemos que tomar en cuenta los espacios necesarios
            for(int espacio=1;espacio<=num-fila;espacio++){
                System.out.print(" ");
            }
            for (int signo=1;signo<=fila;signo++){
                System.out.print("👍");
            }
            System.out.println(); // salto de linea
        }
























    }

}
