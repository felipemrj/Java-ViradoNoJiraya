package eJavaClassesUtilitárias.Aula29Formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        String pattern2 = "'São Paulo' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf2.parse("São Paulo 02 de setembro de 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
