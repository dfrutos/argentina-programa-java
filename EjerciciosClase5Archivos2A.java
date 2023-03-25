import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class EjerciciosClase5Archivos2A {

    public static void main(String[] args) throws IOException {
        System.out.println(args.length);
        if (args.length == 2) {

            Path f  = Paths.get(args[0]);
            System.out.println(f.toAbsolutePath());


            if(Files.exists(f) && Files.isReadable(f)){

                int suma = 0;
                if(args[1].equals("M") ) suma = 1;

                for(String line : Files.readAllLines(f)){
                    if(args[1].equals("S") ) {
                        suma += Integer.parseInt(line);
                    }else{
                        int numero = Integer.parseInt(line);
                        suma = suma * numero;
                    }
                }
                    System.out.println("El total es: " + suma);


            }




        }
    }

}
