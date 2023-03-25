public class EjerciciosClase4Ej2 {

    public static void main(String[] args){

        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        String cadenaOriginal = "damianfrutos";
        int desplazamiento = 3;

        String cadenaCodificada = codificar(cadenaOriginal,abecedario, desplazamiento);
        System.out.println("Ejercicio 2 - Codificación");
        System.out.print("Cadena Original: " + cadenaOriginal + " - Cadena Codificada: " +  cadenaCodificada);

        String cadenaDecofificada = decodificar(cadenaCodificada,abecedario, desplazamiento);
        System.out.println();
        System.out.println();
        System.out.println("Ejercicio 2 - Decodificación");
        System.out.print("Cadena Codificada: " + cadenaCodificada + " - Cadena Decodificada: " +  cadenaDecofificada);


    }

    private static String codificar(String cadena,String abecedario, int desplazamiento){

        char[] cadenaOriginal = cadena.toCharArray();
        char[] vAbecedario = abecedario.toCharArray();
        String cadenaCodificada = "";
        int pos = 0;



        for(int i = 0; i <= cadenaOriginal.length - 1; i++){
            //System.out.print(cadenaOriginal[i]);
            pos  = abecedario.indexOf(cadenaOriginal[i]);
            //System.out.print("[pos "+pos+"]");
            cadenaCodificada = cadenaCodificada + vAbecedario[pos + desplazamiento];
        }


        return cadenaCodificada;
    }

    private static String decodificar(String cadena,String abecedario, int desplazamiento){

        char[] cadenaOriginal = cadena.toCharArray();
        char[] vAbecedario = abecedario.toCharArray();
        String cadenaDecodificada = "";
        int pos = 0;



        for(int i = 0; i <= cadenaOriginal.length - 1; i++){
            //System.out.print(cadenaOriginal[i]);
            pos  = abecedario.indexOf(cadenaOriginal[i]);
            //System.out.print("[pos "+pos+"]");
            cadenaDecodificada = cadenaDecodificada + vAbecedario[pos - desplazamiento];
        }


        return cadenaDecodificada;
    }

}
