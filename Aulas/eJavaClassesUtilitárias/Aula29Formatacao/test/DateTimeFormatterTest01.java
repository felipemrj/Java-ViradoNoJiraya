package eJavaClassesUtilitárias.Aula29Formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20250903", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-09-03", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-09-03", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-09-03T14:30:59.8321847", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // dd//MM/yyyy br
        // MM/dd/yyyy usa
        // yyyy/MM/dd jp

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterUsa = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterJp = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        String s5 = now.format(formatterBr);
        String s6 = now.format(formatterUsa);
        String s7 = now.format(formatterJp);

        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);

        LocalDate parseBr = LocalDate.parse("03/09/2025", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String s8 = now.format(formatterGr);
        System.out.println(s8);

        LocalDate parse5 = LocalDate.parse("03.September.2025", formatterGr);
        System.out.println(parse5);
    }
}
