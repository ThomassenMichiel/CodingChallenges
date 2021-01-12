package codewars.kyu7.targetdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateDays {
    
    public static String dateNbDays(double a0, double a, double p) {
        LocalDate startingDate = LocalDate.of(2016, 1, 1);
        
        while (a0 < a) {
            a0 += a0 * (p / 36000);
            startingDate = startingDate.plusDays(1);
        }
        return startingDate.format(DateTimeFormatter.ISO_DATE);
    }
}
