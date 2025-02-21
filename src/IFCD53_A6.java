import java.util.Scanner;

public class IFCD53_A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random()*100);
        int numero = 0;
        while(random!=numero && numero!=-1) {
            System.out.print("Indique un numero: ");
            numero = sc.nextInt();
            if(numero == -1) {
                System.out.println("salida del programa");
            }else if (numero > random) {
                System.out.println("El numero es menor");
            }else if (numero < random) {
                System.out.println("El numero es mayor");
            }
            if(numero == random) {
                System.out.println("has ganado");
            }

        }







sc.close();

    }
}
