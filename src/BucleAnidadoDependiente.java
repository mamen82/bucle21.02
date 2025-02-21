/**
 * Se puede dar el caso que en la ejecucion de un programa, el bucle interno dependa su recorrido de un valor del bucle externo
 * Ejemplo.
 *  for (int j=1;j<=10;j++){   i=1
 *      bloque de instrucciones
 *     for (int j=i: j<=10;j++) {i=1 j=1 -10 / en la segunda i=2  j=2=10 / tercera i=3
 */



public class BucleAnidadoDependiente {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("******* valor de i es " + i + " **");
            for (int j = i; j <= 10; j++) {
                System.out.println("** valor de j es " + j + " **");
            }
        }










    }
}
