package eJavaClassesUtilitárias.Aula28Datas;

public class PT07Duration {
    /*
    A classe Duration faz parte do pacote java.time e representa uma quantidade de tempo (intervalo), como "2 horas e 30 minutos", sem referência a datas ou fusos horários.

    Principais usos e características:
    - É utilizada para calcular, armazenar e manipular o tempo decorrido entre dois pontos, especialmente entre objetos do tipo LocalTime, LocalDateTime e Instant.
    - Imutável e thread-safe.

    Como utilizar:
    - Duration.between(start, end): Calcula o intervalo entre dois objetos do tipo LocalTime, LocalDateTime ou Instant.
    - Duration.ofX(): Cria uma duração específica (ex: Duration.ofMinutes(20), Duration.ofHours(5), Duration.ofDays(1)).
    - Duration.of(long amount, ChronoUnit unit): Cria uma duração customizada usando uma unidade de tempo suportada pelo ChronoUnit.

    Suporte para unidades de tempo (ChronoUnit):
    - Duration trabalha com as unidades menores que dias: nanossegundos, microssegundos, milissegundos, segundos, minutos, horas.
    - Unidades suportadas pelo ChronoUnit: NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS.
    - **Atenção:** Duration **não** suporta unidades de tempo maiores que dias (como DAYS, WEEKS, MONTHS, YEARS). Para essas, utilize a classe Period.
      Exemplo:
        - Duration.of(3, ChronoUnit.HOURS) → 3 horas
        - Duration.of(120, ChronoUnit.MINUTES) → 2 horas

    Apresentação do resultado:
    - O resultado de Duration geralmente é apresentado no formato ISO-8601, por exemplo: PT2H8M (2 horas e 8 minutos), PT-7H (menos 7 horas).

    Principais métodos:
    - toMinutes(), toHours(), toSeconds(): Converte a duração para a unidade desejada.
    - plus()/minus(): Adiciona ou subtrai tempo de uma Duration.
    - getSeconds(), getNano(): Busca segundos e nanossegundos da duração.

    Resumo:
    - Use Duration para manipular intervalos de tempo precisos entre horas, minutos, segundos, nanossegundos.
    - Duration é ideal para cálculos de tempo decorrido, timeouts, cronômetros, medições, etc.
    - Para intervalos maiores (dias, meses, anos), use Period.
     */
}
