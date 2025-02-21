/*
Pedir por consola un numero y dibujar un triangulo rectagulo de N elemento de lado, utilizando para ello 😊
Ejemplo para n=4 lados
😊😊😊😊
😊😊😊
😊😊
😊

 */


import java.util.Scanner;

public class TrianguloRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero para mostrar el triangulo rectangulo");
        int num = sc.nextInt(); // leemos el numero
        for (int filas = 1; filas <= num; filas++) {
            for (int colunas = filas; colunas <= num; colunas++) {
                System.out.print("\uD83D\uDE0A"); // sin salto de linea
            }
            System.out.println();// salto de linea cuando cambie de fila
        }











    }
}
