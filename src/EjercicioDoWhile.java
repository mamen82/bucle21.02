import java.util.Scanner;

/**
 * Desarolla un juego para mejorar el calculo mental de la suma. El jugador debe introducir el resultado de la suma de dos numero que se generan aleatoriamente del 1 - 100. Mientras la solucion respondida por el usuario sea correcta, el juego continuara, y se llevara un contador de las operaciones correctas.
 * En el momento que falle, se saldra del juego e indicara cuando ha respondido correctamente.
 *
 * 1. Declarra el Scanner, variables: num1, num2, respuesta, contador
 * 2. Bucle do-While (respuesta ==num1+num2): se generan los aleatorios, se pregunta la respuesta, se incrementa el contador en caso correcto.
 * 3. Al salir del bucle, mostrar el contador de aciertos.
  */



public class EjercicioDoWhile {
    public static void main(String[] args) {
        // declaracion de variable
        Scanner sc = new Scanner(System.in);
        int respuestas=0,contador=0;
        int numero1Randon;
        int numero2Randon;
        // bucle
        do{
            numero1Randon= (int) (Math.random()*100);//5
            numero2Randon= (int) (Math.random()*100);//10
            System.out.println("¿Cuanto es la suma?" +numero1Randon+" + "+numero2Randon);
            respuestas =sc.nextInt();
            if(respuestas == numero1Randon+numero2Randon){//14 == 15
                System.out.println("El resultado es correcto");
                contador++; //+1 intento
            }else{
                contador++;
                System.out.println("El resultado es incorrecto");
            }

            // mensaje final

        }while (respuestas == numero1Randon+numero2Randon);
        System.out.println("Intentos: "+contador);
        sc.close();

    }
}
