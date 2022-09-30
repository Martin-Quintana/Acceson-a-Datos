package MiniShell;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.util.List;
import java.util.Stack;

public class LsCmd implements Command {
    private boolean recursive;
    private Path path;

    public LsCmd() {
        this.recursive = false;
        this.path = null;
    }

    @Override
    public boolean prepare(String[] args) {
        if (args.length > 3)
            return false;

        switch (args.length) {
            case 0 -> {
                path = MiniShell.path;
                return true;
            }
            case 1 -> {
                if (args[0].equals("-R")) {
                    recursive = true;
                    path = MiniShell.path;
                    return true;
                }

                try {
                    path = Path.of(args[0]);
                } catch (InvalidPathException e) {
                    return false;
                }

                return true;
            }
            case 2 -> {
                if (!args[0].equals("-R")) {
                    recursive = true;
                    return true;
                }

                try {
                    path = Path.of(args[1]);
                } catch (InvalidPathException e) {
                    return false;
                }

                recursive = true;
                return true;
            }
        }

        return true;
    }

    @Override
    public void exec() {
        if (!Files.exists(path)) {
            System.out.println("La ruta indicada no existe");
            return;
        }

        printDir(path);
    }

    @Override
    public String getUsage() {
        return "\nUso: ls [-R] [ruta]\nMuestra el contenido del directorio pedido o del actual, si no se indica.\n";
    }

    private void printDir(Path target) {
        try {
            List<Path> files = Files.list(target).toList();
            for (int i = 0; i < files.size(); i++) {
                Path it = files.get(i);
                Path parent = it;

                StringBuilder str = new StringBuilder();
                Stack<String> parents = new Stack<>();

                while (!Files.isSameFile(parent = parent.getParent(), path)) {
                    Path lastOfParent = Files.list(parent.getParent()).reduce((first, second) -> second).get();
                    parents.push((!Files.isSameFile(lastOfParent, parent) ? "│\t" : " \t") + "\t");
                }

                while (!parents.empty())
                    str.append(parents.pop());

                if (recursive)
                    str.append(i == files.size() - 1 ? "└ " : "├ ");

                str.append(Files.isDirectory(it) ? "d" : "-");
                str.append(Files.isReadable(it) ? "r" : "-");
                str.append(Files.isWritable(it) ? "w" : "-");
                str.append(Files.isExecutable(it) ? "x" : "-");

                str.append(" ").append(it.getFileName());
                if (Files.isDirectory(it))
                    str.append("\\");

                System.out.println(str);
                if (recursive && Files.isDirectory(it))
                    printDir(it);
            };
        } catch (NotDirectoryException e) {
            System.out.println("La ruta indicada no existe.");
        } catch (SecurityException e) {
            System.out.println("No se tiene permiso para leer en la ruta indicada.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
