package eJavaClassesUtilitárias.Aula28Datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2027, Month.DECEMBER, 6);
        LocalDate dateParse = LocalDate.parse("2027-12-06");
        LocalTime time = LocalTime.of(9, 45, 21);
        LocalTime timeParse = LocalTime.parse("09:45:21");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(dateParse);
        System.out.println(time);
        System.out.println(timeParse);

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
