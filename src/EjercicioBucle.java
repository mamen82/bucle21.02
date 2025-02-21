import java.util.Scanner;

/**
 * Solicita al usuario su nombre y repetidamente, preguntale cuanto dinero tiene. En momento que tecle -1, el programa saldra y le mostrara por pantalla el total que ha indicado.
 * Pista: usa un do-while
  */


public class EjercicioBucle {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Hola, ¿Como te llamas? ");
        String nombre = sc.nextLine();
        double dinero = 0;
        int contador = 0;
        do {
            System.out.println("¿ingresa el dinero, para salir ingresa -1:");
            dinero = sc.nextInt();
            if (dinero != -1) {
                contador += dinero;
            }
        } while (dinero != -1);
        System.out.println(nombre + "Tienes" + contador + "€ de dinero");



sc.close();
    }
}
