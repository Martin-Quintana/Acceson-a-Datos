package MiniShell;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class CdCmd implements Command {
    private Path path;

    public CdCmd() {
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
            System.out.println("La ruta indicada no existe");
            return;
        }

        MiniShell.path = path;
    }

    @Override
    public String getUsage() {
        return "\nUso: cd ruta\nCambia el directorio de trabajo al indicado.\n";
    }
}
