import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjerciciosClase5Archivos3 {

    public static void main(String[] args) throws IOException{

        //args[1] : C / D
        //args[2] : Desplazamiento
        //args[3] : Archivo Entrada
        //args[4] : Archivo Salida

        System.out.println(args[0] + args[1] + args[2] + args[3]);


        String tipo = args[0];
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoE = args[2];
        String archivoS = args[3];



        String abecedario = "abcdefghijklmnñopqrstuvwxyz";



        if(tipo.equals("C") ){
            String cadenaOriginal = leerArchivoEntrada(archivoE);
            String cadenaCodificada = codificar(cadenaOriginal,abecedario, desplazamiento);
            crearArchivoSalida(archivoS, cadenaCodificada);
        }

        if(tipo.equals("D") ){
            String cadenaOriginal = leerArchivoEntrada(archivoE);
            String cadenaDecofificada = decodificar(cadenaOriginal,abecedario, desplazamiento);
            crearArchivoSalida(archivoS, cadenaDecofificada);
        }

    }

    private static String leerArchivoEntrada(String archivoE) throws IOException  {
        String cadena = "";
        Path f  = Paths.get(archivoE);
        System.out.println(f.toAbsolutePath());

        if(Files.exists(f) && Files.isReadable(f)) {
            for(String line : Files.readAllLines(f)){
                cadena = cadena + line;
            }
        }
        return cadena;
    }

    private static void crearArchivoSalida(String archivoS, String contenido) throws IOException{
        Path f = Paths.get(archivoS);
        StringBuffer buffer  = new StringBuffer();
        buffer.append(contenido).append("\n");
        Files.writeString(f,buffer.toString());
    }
    private static String codificar(String cadena,String abecedario, int desplazamiento){

        char[] cadenaOriginal = cadena.toCharArray();
        char[] vAbecedario = abecedario.toCharArray();
        String cadenaCodificada = "";
        int pos = 0;



        for(int i = 0; i <= cadenaOriginal.length - 1; i++){

            pos  = abecedario.indexOf(cadenaOriginal[i]);
            cadenaCodificada = cadenaCodificada + vAbecedario[pos + desplazamiento];
        }


        return cadenaCodificada;
    }

    private static String decodificar(String cadena,String abecedario, int desplazamiento){

        char[] cadenaOriginal = cadena.toCharArray();
        char[] vAbecedario = abecedario.toCharArray();
        String cadenaCodificada = "";
        int pos = 0;



        for(int i = 0; i <= cadenaOriginal.length - 1; i++){

            pos  = abecedario.indexOf(cadenaOriginal[i]);
            cadenaCodificada = cadenaCodificada + vAbecedario[pos - desplazamiento];
        }


        return cadenaCodificada;
    }
}
