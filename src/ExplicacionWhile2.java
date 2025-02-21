
/*
En ocasiones es necesario controlar la condicion con lo llamado contador con lo llamado contador, que indica las veces que se repetira el bucle
Ejemplo
Solicita 10 notas de alumnos y muestra la media
Asegurarse que pueda entrar al bucle o pueda salir
 */


import java.util.Scanner;

public class ExplicacionWhile2 {
    public static void main(String[] args) {
        byte contador=0;
        double medianotas=0;
        byte notas=0;
        Scanner sc = new Scanner(System.in);
        while(contador<=10) {
            System.out.println("Digame su nota: ");
            notas+=sc.nextByte(); // sumo en nota cada una de ellas
            contador++;
        }
        // el calculo lo hacemos fuera del bucle
        medianotas=(double) notas/10;
        System.out.println("media de la nota medianotas");




    }
}
