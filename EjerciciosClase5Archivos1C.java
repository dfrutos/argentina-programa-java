import java.util.Scanner;

public class EjerciciosClase5Archivos1C {

    public static void main(String[] args){
        if(args.length == 0) {
            Scanner miEscaner = new Scanner(System.in);

            System.out.print("Ingrese un número : ");
            int a = miEscaner.nextInt();

            System.out.print("Ingrese otro número : ");
            int b = miEscaner.nextInt();

            System.out.print("Ingrese un número más : ");
            int c = miEscaner.nextInt();

            System.out.print("Ingrese A para orden Ascenente o D para orden Descendente : ");
            char orden = miEscaner.next().charAt(0);
            mostrarVector(ordenarNumeros(a, b, c, orden));
        }else{
            //System.out.println("Hola " + args[0] + args[1] + args[2] + args[3] );
            mostrarVector(ordenarNumeros(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3].charAt(0)));
        }
    }

    private static int mostrarVector(int[] vector){

        for(int i = 0; i <= vector.length - 1; i++) {
            System.out.println(vector[i]);
        }

        return 0;
    }
    private static int[] ordenarNumeros(int numero1, int numero2, int numero3, char orden){

        int[] miVector = new int[] {numero1, numero2, numero3};
        int aux;
        if(orden == 'A'){ // Ascendente

            for(int i = 0; i < miVector.length-1; i++){
                for(int j = 0; j < miVector.length-1; j++) {
                    if (miVector[j] > miVector[j + 1]) {
                        aux = miVector[j];
                        miVector[j] = miVector[j + 1];
                        miVector[j + 1] = aux;
                    }
                }
            }

        }else{
            for(int i = 0; i < miVector.length-1; i++){
                for(int j = 0; j < miVector.length-1; j++) {
                    if (miVector[j] < miVector[j + 1]) {
                        aux = miVector[j];
                        miVector[j] = miVector[j + 1];
                        miVector[j + 1] = aux;
                    }
                }
            }
        }
        return miVector;
    }

}
