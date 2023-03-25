import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosClase4Ej1 {

    public static void main(String[] args){

        Scanner miescaner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String palabra  = miescaner.nextLine();

        System.out.println();

        System.out.print("Ingrese una letra: ");
        char letra = miescaner.next().charAt(0);


        //Ejercicio 1.a
        int cantidadDeAparacionesEncontradas = contarAparicionesLetra(palabra, letra);
        System.out.println("(Ejercicio 1.a) Cantidad de veces encontrada la letra " + letra + " en la palabra " + palabra +": " + cantidadDeAparacionesEncontradas);

        //Ejercicio 1.b
        int[] vectorOrdenado = ordenarNumeros(1,2,3,'D');
        System.out.print("(Ejercicio 1.b) Vector Ordenado: ");
        System.out.print(Arrays.toString(vectorOrdenado));

        //Ejercicio 1.c
        int[] miVector = new int[] {1,2,3,4,5,6,7,8,9};
        int x  = 5;
        int resultado = sumarNumeros(miVector, x);
        System.out.println();
        System.out.print("(Ejercicio 1.c) Resultado: ");
        System.out.print(resultado);

    }

    //Ejercicio 1.a
    private static int contarAparicionesLetra(String palabra, char letra){
        char[] miArrayLetras = palabra.toCharArray();
        int apariciones = 0;
        for(int i = 0; i < miArrayLetras.length; i++){
            //System.out.println(miArrayLetras[i]);
            if(miArrayLetras[i] == letra){
                apariciones++;
            }
        }
        return apariciones;
    }

    //Ejercicio 1.b
    //Se realiza ordenamiento con método burbuja (directo), complejidad O(n2)
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

    //Ejercicio 1.c
    private static int sumarNumeros(int[] miVector, int x){
        int suma = 0;

        for(int i = 0; i < miVector.length; i++){
            if(miVector[i] > x ){
                suma = suma + miVector[i];
            }
        }

        return suma;
    }

}
