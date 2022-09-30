import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Programa que reciba el nombre de un directorio y muestre su contenido y si se trata de un fichero o un directorio.
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		Path carpetaALeer;

		/*
			El directorio a listar se intenta obtener por parámetros, pero si hay más de
			uno o no hay ninguno, se pide por consola.
		 */
		if (args.length == 1) {
			carpetaALeer = Path.of(args[0]);
		} else {
			var teclado = new Scanner(System.in);
			System.out.println("¿Qué directorio desea listar? ");
			carpetaALeer = Path.of(teclado.nextLine());
		}

		if (!Files.exists(carpetaALeer) || !Files.isDirectory(carpetaALeer)) {
			System.err.println("La ruta especificada no es un directorio o no existe");
			System.exit(1);
		}

		try (var ds = Files.newDirectoryStream(carpetaALeer)) {
			ds.forEach((elemento) -> {
				String sb = (Files.isDirectory(elemento) ? "d" : "-") +
						(Files.isReadable(elemento) ? "r" : "-") +
						(Files.isWritable(elemento) ? "w" : "-") +
						(Files.isExecutable(elemento) ? "x" : "-") +
						"\t" +
						elemento.getFileName();
				System.out.println(sb);
			});
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}