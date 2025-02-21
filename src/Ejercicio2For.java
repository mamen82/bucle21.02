


/* Implementa una apicacion que solicite al usuario un numero comprendido entre 1 y 10, si se equivoca, debe solicitarlo nuevamente (do-while)
Luego de leer correctamente ese numero, mostrar por pantalla, a tabla de multiplicar de dicho numero (for)
1. declarar el scanner
2. declara - inicializa el numero
3. se crea el bucle DO (solicitar y leer el numero) mientras  WHILE (numero<1 || numero>10)
4. bucle FOR del 1 AL 10- dentro se mustra el valor I
 */



import java.util.Scanner;

public class Ejercicio2For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = sc.nextInt();
        do {
            System.out.println("ingrese un numero");
            numero = sc.nextInt();

        }while (numero < 10);


        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+ " x " + i + " = " +numero*i );
        }








    }
}
