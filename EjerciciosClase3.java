/*
Alumno: Damian Frutos
Curso: Java Inicial / Argentina Programa
Clase 3 - Guia de Ejercicios 
 */

import java.util.Scanner;

public class EjerciciosClase3 {
    public static void main(String[] args) {

        Scanner miEscaner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = miEscaner.nextInt();

        if(calcularSiEsPrimo(numero)){
            System.out.println(numero + " ES primo.");
        }else{
            System.out.println(numero + " NO ES primo.");
        }
    }

    private static boolean calcularSiEsPrimo(int numero){

        double raizDelNumero = (int) Math.sqrt(numero);
        int primosDivisores = 0;

        //Recorro todos los numeros del 1 al numero menor a su raiz cuadrada
        for(int i = 2; i <= raizDelNumero; i++){
            int cantDivisores = 0;

            // Determino si el numero actual i es primo (cantDivisores = 2)
            for(int j = 1; j<= i; j++){
                if(i % j == 0){
                    cantDivisores = cantDivisores + 1;
                }
            }

            if(cantDivisores == 2) {
                if(numero % i == 0){
                    primosDivisores = primosDivisores + 1;
                    return false;
                }
            }
        }
        return true;
    }


}
