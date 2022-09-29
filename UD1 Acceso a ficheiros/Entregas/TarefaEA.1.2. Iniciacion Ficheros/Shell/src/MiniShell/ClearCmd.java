package MiniShell;

import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ClearCmd implements Command {
    public ClearCmd() {
    }

    @Override
    public boolean prepare(String[] args) {
        return (args.length == 0);
    }

    @Override
    public void exec() {
        System.out.println("\n".repeat(50));
        System.out.println("""
                  __  __ _      _ ___ _        _ _\s
                 |  \\/  (_)_ _ (_) __| |_  ___| | |
                 | |\\/| | | ' \\| \\__ \\ ' \\/ -_) | |
                 |_|  |_|_|_||_|_|___/_||_\\___|_|_|

                """);
    }

    @Override
    public String getUsage() {
        return "\nUso: cd ruta\nCambia el directorio de trabajo al indicado.\n";
    }
}
