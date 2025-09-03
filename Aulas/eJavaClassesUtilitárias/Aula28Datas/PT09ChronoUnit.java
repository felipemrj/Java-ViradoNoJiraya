package eJavaClassesUtilitárias.Aula28Datas;

public class PT09ChronoUnit {
    /*
    A enumeração ChronoUnit faz parte do pacote java.time e representa as principais unidades de tempo
    (como nanossegundos, segundos, minutos, horas, dias, semanas, meses, anos, etc).

    Principais características:
    - Utilizada para definir a granularidade das operações de tempo, como adicionar, subtrair ou calcular diferenças entre datas e horários.
    - É frequentemente usada em métodos como between(), plus(), minus(), etc.

    Como utilizar:
    - ChronoUnit.between(start, end): Calcula a quantidade da unidade escolhida (dias, meses, anos, etc) entre dois objetos temporais, como LocalDate, LocalDateTime, Instant.
      - Exemplo: ChronoUnit.DAYS.between(aniversario, now) retorna o número de dias entre as duas datas.
    - Também pode ser usada para adicionar ou subtrair unidades de tempo:
      - date.plus(5, ChronoUnit.DAYS) adiciona 5 dias à data.
      - date.minus(2, ChronoUnit.MONTHS) subtrai 2 meses.

    Unidades disponíveis:
    - NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS, DAYS, WEEKS, MONTHS, YEARS, DECADES, CENTURIES, MILLENNIA, ERAS, FOREVER.
    - Permite grande flexibilidade para operações e cálculos de tempo em diferentes escalas.

    Resumo:
    - Use ChronoUnit para especificar a unidade de tempo desejada ao trabalhar com datas e horários.
    - É especialmente útil para calcular diferenças (quantos dias, meses, anos, etc) entre dois momentos, ou para manipulação precisa de valores temporais.
    - Torna o código mais legível e menos sujeito a erros, evitando cálculos manuais de conversão entre unidades.
    */
}
