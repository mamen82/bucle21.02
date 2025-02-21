
/*
Bucle while-> sintaxis
while (condicion){
Bloque de instrucciones -> salida de pantalla, if-else, switch, bucles
}
 */


import java.util.Scanner;

public class ExplicacionWhile {
    public static void main(String[] args) {

        // solicita la edad, hasta que excriba -1
        int edad=0;
        Scanner sc=new Scanner(System.in);
        while(edad>=0){   // se repetira hasta que el usuario escriba -1
            System.out.println("Ingrese su edad");
            edad=sc.nextInt();
            if(edad>=18){
                System.out.println("Eres mayor de edad");
            }else if(edad>=0) {
                System.out.println("eres menor de edad");
            }else {
                System.out.println("edad no valida");
            }
        }

























    sc.close();  //cerrar el scanner
    }
}
