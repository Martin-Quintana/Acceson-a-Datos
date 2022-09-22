
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.of(2022,Month.OCTOBER , 12, 12,56,54,9);
        LocalDateTime fechaInicio = LocalDateTime.of(2022,Month.SEPTEMBER , 12, 12,56,54,9);
        LocalDateTime fechaFin = LocalDateTime.of(2022,Month.JUNE , 1, 12,56,54,9);

        if (fecha.isBefore(fechaFin) && fecha.isAfter(fechaInicio)) {
            System.out.println("Estamos en clase");
        } else {
            System.out.println("Estamos de vacaciones");
        }
    }
}
