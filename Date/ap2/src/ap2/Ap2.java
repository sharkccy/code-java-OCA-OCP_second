package ap2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ap2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 4, 19);
        LocalTime time = LocalTime.of(21, 10);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        Period p = Period.ofMonths(2);
        System.out.println(date.plus(p));
        System.out.println(dateTime.plus(p));

    }
}
