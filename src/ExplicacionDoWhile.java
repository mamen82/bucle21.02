
/* Bucle Do-While
Sintaxis
do{
    Bloque de instrucciones
}while (condicion);
**** se ejecuta al menos una vez***

 */


import java.util.Scanner;

public class ExplicacionDoWhile {
    public static void main(String[] args) {
    int edad=0;
    Scanner sc = new Scanner(System.in);
        do{ // ejecuta este bloque de instrucciones
            System.out.println("Diga su edad: ");
            edad = sc.nextInt();
        }while(edad<18); // miesntras se cumpla esta condicion
        System.out.println("El edad introducida es: "+edad);













    sc.close();
    }
}
