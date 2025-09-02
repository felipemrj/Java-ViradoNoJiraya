package eJavaClassesUtilitárias.Aula28Datas;

public class PT03LocalDate {
    /*
    A classe LocalDate faz parte do pacote java.time e representa uma data no formato ISO (ano, mês, dia), sem informações de horário ou fuso.

    Principais características e vantagens:
    - Imutável (immutable) e thread-safe.
    - Substitui as classes Date e Calendar para manipulação de datas em Java moderno (Java 8+).
    - Não armazena informações de hora ou fuso horário, ideal para trabalhar apenas com datas.

    Exemplo do código:
    - LocalDate date = LocalDate.of(2025, Month.SEPTEMBER, 2); // Cria uma data específica.
    - LocalDate agora = LocalDate.now(); // Obtém a data atual do sistema.

    Principais métodos:
    - getYear(): Retorna o ano da data.
    - getMonth(): Retorna o mês como enum Month.
    - getMonthValue(): Retorna o mês como inteiro (1-12).
    - getDayOfWeek(): Retorna o dia da semana como enum DayOfWeek.
    - getDayOfMonth(): Retorna o dia do mês.
    - getDayOfYear(): Retorna o dia do ano.
    - lengthOfMonth(): Retorna quantos dias tem o mês da data.
    - isLeapYear(): Verifica se o ano é bissexto.
    - get(ChronoField): Permite acessar valores de campos específicos usando ChronoField (ex: YEAR_OF_ERA, DAY_OF_MONTH).
    - LocalDate.MAX / LocalDate.MIN: Constantes que representam os maiores e menores valores possíveis para LocalDate.

    Comparação com Date e Calendar:
    - Date e Calendar são mutáveis e possuem métodos obsoletos; LocalDate é imutável e seguro.
    - Calendar inclui hora e fuso; LocalDate trabalha só com datas, facilitando o uso.
    - LocalDate usa enum Month e DayOfWeek, tornando o código mais legível e evitando erros com números mágicos.

    Resumo:
    - Use LocalDate para manipular datas sem horário em aplicações modernas Java.
    - Prefira LocalDate ao invés de Date e Calendar para código novo ou refatoração.
    - A API java.time oferece métodos poderosos, seguros e fáceis de usar para cálculos e manipulação de datas.
    */
}
