package Ejercicio1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProgramaFlattener {
    public static void main(String[] args) {
        try{
            List<Path> routes = new java.util.ArrayList<>(Files.walk(Path.of("/tmp/niats/")).toList());
            for (Path route : routes){
                if (Files.isRegularFile(route)){
                    Path destiny = Path.of("/tmp/niats/" + route.getFileName());
                    try{
                        Files.move(route,destiny,StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e){
                        throw new RuntimeException(e);
                    }
                }
            }
            Collections.reverse(routes);
            for (Path directory : routes){
                if (!directory.equals("/tmp/niats/")&& Files.isDirectory(directory)){
                    System.out.println(directory.getFileName());
                   Files.delete(directory);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
