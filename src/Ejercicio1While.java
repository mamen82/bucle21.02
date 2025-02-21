import java.util.Scanner;
/* solicita al usuario un numero, e indica si es par, si es positivo
 * para salir del programa el usuario debe pulsar 0
 * pista-> numero%2==0 para saber si es par /  sino es impar
 *          numero>0     es positivo /  sino es negativo
 */





public class Ejercicio1While {
    public static void main(String[] args) {
        int numero = 1;
        Scanner sc = new Scanner(System.in);
        while (numero!=0) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero%2==0) {
                System.out.println("El numero es par");
            }else {
                System.out.println("El numero es impar");
            }if (numero>=0) {
                System.out.println("el numero es positivo");
            }else{
                System.out.println("el numero es negativo");
            }
        }




















        sc.close();
    }
}
