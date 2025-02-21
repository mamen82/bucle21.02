import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* menu utilizando bucles y shitch dice irina ok*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opcion;
        do {
            System.out.println("Indica tu poblacion: " +
                    "\n1->Tomelloso " +
                    "\n2->Alcazar " +
                    "\n3->La solana " +
                    "\n4->Manzanares " +
                    "\n5-> Miguel esteban " +
                    "\n6-> Mota del cuervo " +
                    "\n Indica tu opcion");
            opcion = sc.nextByte();
            switch (opcion) {
                case 1 -> System.out.println("la ciudad del vino");
                case 2 -> System.out.println("tenemos ave");
                case 3 -> System.out.println("el pueblo mas bonito");
                case 4 -> System.out.println("no tiene nada, solo hospital");
                case 5 -> System.out.println("no tiene nada, solo hospital");
                case 6 -> System.out.println("el balcon de la mancha ");
                case 7 -> System.out.println("salida del sistema");
            }
        } while (opcion != 7);

        sc.close();


    }
}