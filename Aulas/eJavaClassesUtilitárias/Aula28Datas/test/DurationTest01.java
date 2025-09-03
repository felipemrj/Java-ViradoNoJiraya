package eJavaClassesUtilitárias.Aula28Datas.test;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinusSevenHours = LocalTime.now().minusHours(7);

        System.out.println(Duration.between(now, nowAfterTwoYears));
        System.out.println(Duration.between(timeNow, timeMinusSevenHours));
        System.out.println(Duration.between(Instant.now(), Instant.now().plusSeconds(1_000)));
        System.out.println(Duration.ofMinutes(20));
        System.out.println(Duration.ofHours(20));
        System.out.println(Duration.ofDays(20));
        System.out.println(Duration.of(3, ChronoUnit.HOURS));

    }
}
