import java.sql.SQLOutput;
import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique um numero: ");
        int num1 = input.nextInt();
        System.out.println("Indique otro numero");
        int num2 = input.nextInt();
        System.out.println("Marh.max->" +Math.max(num1,num2));
        System.out.println("Marh.min->" +Math.min(num1,num2));
        System.out.println("Raiz cuadrada numer1" +Math.sqrt(num1));
        System.out.println("Raiz cuadrada numer2" +Math.sqrt(num2));
        System.out. println("valor absoluto numeo1" +Math.abs(num1));
        System.out. println("valor absoluto numeo2" +Math.abs(num2));
        // muy usado
        System.out. println("Exponencial1 Math.pow(numero1, numero2" +Math.pow(num1, num2));
        // Random
        // Ejemplo1: Mostrar un numero aleatorio del 1 al 10
        int random = (int) (Math.random()*10);

        System.out.println("El numero random es:" +random);
    }
}
