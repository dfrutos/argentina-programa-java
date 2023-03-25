public class EjerciciosClase1 {
    public static void main(String[] args) {


        // EJERCICIO 1



        /*
        Ejercicio 1.a:
        Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”.
         */
        System.out.println();
        System.out.println(" - EJERCICIO 1.a: - ");

        int numeroA = 6;
        int numeroB = 35;

        System.out.println();
        System.out.println("Número A =  " + numeroA );
        System.out.println("Número B =  " + numeroB );
        System.out.println();


        int aux = numeroA;

        System.out.print("Los números encontrados son: ");

        while(aux <= numeroB){
            System.out.print(aux);
            if(aux < numeroB) System.out.print(", ");
            aux = aux + 1;
        }

        /*
        Ejercicio 1.b:
        A lo anterior, solo muestre los números pares
         */
        System.out.println();
        System.out.println();
        System.out.println("- EJERCICIO 1.b - ");

        aux = numeroA;

        System.out.print("Los números pares encontrados son: ");

        while(aux <= numeroB){

            if((aux % 2) == 0) {
                if((aux-1) > numeroA) System.out.print(", ");
                System.out.print(aux);
            }
            aux = aux + 1;
        }

        /*
        Ejercicio 1.c:
        A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
         */
        System.out.println();
        System.out.println();
        System.out.println("- EJERCICIO 1.c - ");

        String imprimir = "pares";
        aux = numeroA;

        System.out.print("Los números " + imprimir + " encontrados son: ");

        while(aux <= numeroB){

            if(imprimir == "pares") {
                if ((aux % 2) == 0) {
                    if ((aux-1) > numeroA) System.out.print(", ");
                    System.out.print(aux);
                }

            } else {
                if ((aux % 2) != 0) {
                    if ((aux-1) > numeroA) System.out.print(", ");
                    System.out.print(aux);
                }

            }

            aux = aux + 1;

        }

        /*
        Ejercicio 1.d:
        Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
         */
        System.out.println();
        System.out.println();

        System.out.println("- EJERCICIO 1.d - ");


        System.out.print("Los números pares encontrados son: ");

        for(int i = numeroB; i >= numeroA; i--) {

            if((i % 2) == 0) {
                if((i+1) < numeroB) System.out.print(", ");
                System.out.print(i);
            }

        }

        System.out.println();
        System.out.println();
        System.out.println();


        //EJERCICIO 2

        //Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si una
        //persona pertenece al segmento de ingresos altos”. Del i al iii, la idea es hacerlo en
        //papel y lápiz y sólo implementar el cuarto.

        /*
        “Son hogares que declaran reunir alguna de las siguientes condiciones, considerando a
        todas y todos los convivientes:
        ● Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
        (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
        ● Tener 3 o más vehículos con una antigüedad menor a 5 años.
        ● Tener 3 o más inmuebles.
        ● Poseer una embarcación, una aeronave de lujo o ser titular de activos
        societarios que demuestren capacidad económica plena.”
         */

        System.out.println("- EJERCICIO 2 - ");
        double ingresosMensuales = 0;
        int cantVehiculosAntMenor5Anios = 0;
        int cantInmuebles = 0;
        int cantEmbarcaciones = 0;
        int cantAeronaves = 0;
        boolean esTitularActivosSocietarios = true;

        if(
                ingresosMensuales >= 489083
                || cantVehiculosAntMenor5Anios >= 3
                || cantInmuebles >= 3
                || cantEmbarcaciones >= 1
                || cantAeronaves >= 1
                || esTitularActivosSocietarios == true
        ){
            System.out.println("La persona PERTENECE al segmento de ingresos altos. ");
        }else{
            System.out.println("La persona NO PERTENECE al segmento de ingresos altos. ");
        }




    }
}