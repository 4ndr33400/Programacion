package Ejercicio1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class ProgramaFlattener {
    public static void main(String[] args) {

        List<String> routes = new ArrayList<>();
        routes.add("/tmp/niats/aaa/a.txt");
        routes.add("/tmp/niats/aaa/bbb/b.txt");
        routes.add("/tmp/niats/aaa/ccc/c.txt");
        routes.add("/tmp/niats/aaa/ccc/ddd/d.txt");
        routes.add("/tmp/niats/aaa/eee/e.txt");
        routes.add("/tmp/niats/fff/f.txt");
        routes.add("/tmp/niats/n.txt");


            Path origin = Path.of(routes.get());
            Path destiny = Path.of("/tmp/niats" + origin.getFileName());
            try {
                Files.move(origin, destiny, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
