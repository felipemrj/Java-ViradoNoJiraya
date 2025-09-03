package eJavaClassesUtilitárias.Aula28Datas;

public class PT10TemporalAdjusters {
    /*
    A classe TemporalAdjusters faz parte do pacote java.time.temporal e fornece uma coleção de métodos utilitários para ajustar datas de forma flexível e legível.

    Principais características:
    - Permite calcular datas recorrentes ou específicas, como o próximo domingo, o último dia do mês, o primeiro dia do próximo ano, etc.
    - Facilita operações comuns em calendários sem necessidade de cálculos manuais.

    Como utilizar:
    - LocalDate.with(TemporalAdjusters.X): Retorna uma nova data ajustada conforme o método escolhido.
        - TemporalAdjusters.next(DayOfWeek): Próxima ocorrência do dia da semana especificado.
        - TemporalAdjusters.nextOrSame(DayOfWeek): Próxima ocorrência ou a mesma, se já for o dia especificado.
        - TemporalAdjusters.previous(DayOfWeek): Ocorrência anterior do dia da semana especificado.
        - TemporalAdjusters.firstDayOfMonth(): Primeiro dia do mês atual.
        - TemporalAdjusters.lastDayOfMonth(): Último dia do mês atual.
        - TemporalAdjusters.firstDayOfNextYear(): Primeiro dia do próximo ano.
        - TemporalAdjusters.firstDayOfNextMonth(): Primeiro dia do próximo mês.

    Também é possível ajustar datas por campos específicos:
    - LocalDate.with(ChronoField.DAY_OF_MONTH, valor): Ajusta o dia do mês diretamente.

    Exemplos práticos:
    - Encontrar a próxima quarta-feira, o último dia do mês, ou o primeiro dia do próximo ano de forma simples e direta.
    - Utilizado em aplicações que precisam de cálculos de vencimentos, datas de reuniões, pagamentos, etc.

    Resumo:
    - Use TemporalAdjusters para manipulação avançada e legível de datas no Java.
    - Evita cálculos manuais e torna o código mais limpo e fácil de entender.
    - Ideal para lógica de negócios baseada em datas recorrentes ou específicas.
    */
}
