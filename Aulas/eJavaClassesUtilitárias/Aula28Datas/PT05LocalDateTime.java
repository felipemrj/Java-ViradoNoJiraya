package eJavaClassesUtilitárias.Aula28Datas;

public class PT05LocalDateTime {
    /*
    A classe LocalDateTime faz parte do pacote java.time e representa uma combinação de data e hora (ano, mês, dia, hora, minuto, segundo e nanossegundo),
    sem informações de fuso horário.

    Principais características:
    - Imutável (immutable) e thread-safe.
    - Ideal para manipular datas e horários juntos, como agendamentos, registros de eventos, marcações, etc.
    - Substitui o uso de Date e Calendar para manipulação de data e hora em Java moderno (Java 8+).

    Exemplo do código:
    - LocalDateTime localDateTime = LocalDateTime.now(); // Data e hora atual do sistema.
    - LocalDate date = LocalDate.of(2027, Month.DECEMBER, 6); // Cria uma data específica.
    - LocalDate dateParse = LocalDate.parse("2027-12-06"); // Cria uma data a partir de uma String no formato ISO.
    - LocalTime time = LocalTime.of(9, 45, 21); // Cria um horário específico.
    - LocalTime timeParse = LocalTime.parse("09:45:21"); // Cria um horário a partir de uma String no formato ISO.

    Combinação de data e hora:
    - date.atTime(time): Cria um LocalDateTime combinando a data e o horário.
    - time.atDate(date): Também cria um LocalDateTime combinando o horário e a data.

    Observações importantes:
    - LocalDateTime não armazena informações de fuso horário. Para trabalhar com fusos, use ZonedDateTime.
    - Métodos de parse permitem criar objetos a partir de Strings padronizadas, facilitando a entrada e saída de dados.
    - LocalDateTime é seguro e recomendado para código novo, sendo mais fácil de usar, legível e preciso que Date/Calendar.

    Resumo:
    - Use LocalDateTime para manipular datas e horários juntos em Java moderno.
    - Prefira LocalDateTime, LocalDate e LocalTime ao invés de Date/Calendar para código novo ou refatoração.
    - A API java.time oferece métodos poderosos, seguros e fáceis de usar para cálculos e manipulação de datas e horários.
    */
}
