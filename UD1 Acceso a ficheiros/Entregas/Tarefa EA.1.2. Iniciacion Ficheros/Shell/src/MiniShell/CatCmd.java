package MiniShell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class CatCmd implements Command {
    private Path path;

    public CatCmd() {
        this.path = null;
    }
    @Override
    public boolean prepare(String[] args) {
        if (args.length != 1)
            return false;

        try {
            path = Path.of(args[0]);
        } catch (InvalidPathException e) {
            return false;
        }

        return true;
    }

    @Override
    public void exec() {
        path = MiniShell.path.resolve(path).normalize();

        if (!Files.exists(path)) {
            System.out.println("El fichero indicado no existe.");
            return;
        }

        if (!Files.isRegularFile(path)) {
            System.out.println("La ruta indicada no es un fichero.");
            return;
        }

        if (!Files.isReadable(path)) {
            System.out.println("No tienes permisos de lectura sobre ese fichero.");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(path.toFile()));

            br.lines().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getUsage() {
        return "\nUso: cat archivo\nImprime el contenido del archivo en la ruta indicada.\n";
    }
}
