import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class calculaedad {
    public static void main(String[] args) {
        LocalDate minacimiento = LocalDate.of(2020, Month.AUGUST, 17);
        LocalDate now = LocalDate.now();
        Period edad =  Period.between(minacimiento, now);
        System.out.println("Tengo " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " dias.");
    }
}
