/**
 * La salida anticipada se puede ejecutar en cualquier bucle.
 * Interrupcir un bucle y salir si cumple alguna condicion... if - switch-case->break;
 * Saltar una iteracion, y que el bucle continue con su ejecuacion... se hara por medio de una condicion, y se utiliza la sentencia-> continua;
 */







public class SalidasAnticipas {
    public static void main(String[] args) {
        byte a=10;
        for(int i=0;i<=10;i++){
            if(i%2==0){ //mostrar los pares
                System.out.println("el valor de i es "+i);
            }else{
                System.out.println("encontre un impar y me salgo del programa");
                break; // interrumpe el bucle
            }
        }

        for(int i=0;i<=10;i++){
            if(i%2==0){ //mostrar los pares
                if (i==6) { //cuando i valga 6, lo salte
                    continue;
                }
                    System.out.println("el valor de i es "+i); // no llega qui si es i=6

            }
        }






















    }
}
