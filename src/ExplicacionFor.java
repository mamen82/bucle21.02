/*
Bucle: for
Sintaxis: for (inicializacion ; incremento/decremento){
                Bloque de instrucciones
           }
 */


import java.util.Scanner;

public class ExplicacionFor {
    public static void main(String[] args) {
        // mostrar por pantalla 10 veces "ECO" ** incrementa la variable**
        for (int i = 1; i <= 10; i++) {  // variable local
            System.out.println("ECO" +i);
        }
        // bucle for ** decremento
        // muestra los años entre 2025 y 2020 de forma decreciente
        for (int i = 2025; i >= 2020; i--) {
            System.out.println("Año" +i);
        }
        // solicita 10 notas y muestra la media

        Scanner sc = new Scanner(System.in);
        double nota=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nota" +i);
            nota += sc.nextDouble();
        }
        System.out.println("la media de las 10 notas es" +(nota/10));
        // solicitar al usuario cuantas notas va ha introducir, lo llemos en una variable que formara parte de instrucciion for
        System.out.println("indique el numero de alumnos");
        byte alumnos = sc.nextByte();
        for (int i = 1; i <= alumnos; i++) {
            System.out.println("Nota del alumno" +i);
            nota += sc.nextDouble();
        }
        System.out.println("la media de la nota es" +(nota/alumnos));
















    }
}
