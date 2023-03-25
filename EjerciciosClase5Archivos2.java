import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EjerciciosClase5Archivos2 {

    public static void main(String[] args) throws IOException {
        if (args.length == 1) {

            Path f  = Paths.get(args[0]);
            System.out.println(f.toAbsolutePath());


            if(Files.exists(f) && Files.isReadable(f)){
                int suma = 0;
                for(String line : Files.readAllLines(f)){
                    suma += Integer.parseInt(line);

                }

                System.out.println("La suma es: " + suma);

            }




        }
    }

}
