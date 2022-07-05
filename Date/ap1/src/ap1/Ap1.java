package ap1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Ap1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        
        LocalDate date = LocalDate.of(2019, Month.APRIL, 19);
        date = date.plusDays(2);
        System.out.println(date);
        
        date = date.plusWeeks(1);
        System.out.println(date);
        
        date = date.plusYears(2);
        System.out.println(date);
    }
}
