package eJavaClassesUtilitárias.Aula28Datas;

public class PT04LocalTime {
    /*
    A classe LocalTime faz parte do pacote java.time e representa um horário (hora, minuto, segundo, nanossegundo) sem qualquer informação de data ou fuso horário.

    Principais características:
    - Imutável (immutable) e thread-safe.
    - Ideal para trabalhar apenas com horários, como horários de funcionamento, alarmes, cronômetros, etc.
    - Substitui o uso de métodos obsoletos das classes Date e Calendar para manipulação de horários em Java moderno (Java 8+).

    Exemplo do código:
    - LocalTime time = LocalTime.of(23, 32, 12); // Cria um horário específico: 23h32min12s
    - LocalTime timeNow = LocalTime.now(); // Obtém o horário atual do sistema.

    Principais métodos:
    - getHour(): Retorna a hora (0-23).
    - getMinute(): Retorna os minutos (0-59).
    - getSecond(): Retorna os segundos (0-59).
    - get(ChronoField): Permite acessar campos específicos do horário, como AMPM_OF_DAY (0 para AM, 1 para PM) ou HOUR_OF_DAY.
    - LocalTime.MIN / LocalTime.MAX: Constantes para menor (00:00) e maior (23:59:59.999999999) valor possível de horário.

    Comparação com Date/Calendar:
    - LocalTime é mais simples, seguro e fácil de usar para horários puros, sem data ou fuso.
    - Métodos da API java.time usam enums ChronoField, tornando o código mais legível e reduzindo erros.

    Resumo:
    - Use LocalTime para manipular horários em aplicações modernas Java.
    - Evite Date e Calendar para código novo; prefira LocalTime e outras classes do pacote java.time.
    - A API java.time oferece recursos poderosos, seguros e de fácil uso para cálculos e manipulação de horários.
    */
}
