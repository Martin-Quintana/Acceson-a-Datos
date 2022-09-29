package MiniShell;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class MiniShell {
    public static Path path;

    public static void main(String[] args) {
        path = Path.of(System.getProperty("user.dir"));
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                  __  __ _      _ ___ _        _ _\s
                 |  \\/  (_)_ _ (_) __| |_  ___| | |
                 | |\\/| | | ' \\| \\__ \\ ' \\/ -_) | |
                 |_|  |_|_|_||_|_|___/_||_\\___|_|_|

                """);

        do {
            printPrompt();
        } while (execCmd(sc.nextLine()));
    }

    private static void printPrompt() {
        System.out.printf("%s> ", path);
    }

    private static boolean execCmd(String line) {
        String[] tokens = line.split("\\s+");

        String op = tokens[0];
        if (op.equals("exit"))
            return false;

        String[] args = tokens.length > 1 ? Arrays.copyOfRange(tokens, 1, tokens.length) : new String[0];

        Command cmd = Command.getCmd(op);
        if (cmd == null) {
            System.out.printf("\n\"%s\" no se reconoce como comando.\n", op);
            return true;
        }

        if (!cmd.prepare(args)) {
            System.out.println(cmd.getUsage());
            return true;
        }

        cmd.exec();
        return true;
    }
}