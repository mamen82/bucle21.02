
/* se trata de tener dos bucles que no dependen uno de otro...
for (int i=1; i<=10;i++){ ...i=1
    bloque de instrucciones
    for (int j=1;j<=10;j++){ ...j=1
    bloque de instrucciones
 */






public class BucleAnidadoIndependiente {
    public static void main(String[] args) {
        // tabla de multiplicar

        for (int i = 1; i <= 10; i++) {
            System.out.println(" tabla del " + i + "***");
            for (int j = 1; j <=10; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));

            }
        }
    }










}
