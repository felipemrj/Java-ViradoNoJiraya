package eJavaClassesUtilitárias.Aula28Datas;

public class PT08Period {
    /*
    A classe Period faz parte do pacote java.time e representa uma quantidade de tempo baseada em datas (anos, meses e dias), sem considerar horas, minutos ou segundos.

    Principais características:
    - Imutável (immutable) e thread-safe.
    - Utilizada para calcular, armazenar e manipular intervalos entre datas (LocalDate).
    - Ideal para representar períodos como "3 anos", "2 meses e 7 dias", "58 semanas", etc.

    Como utilizar:
    - Period.between(start, end): Calcula o intervalo entre duas datas.
    - Period.ofX(): Cria períodos específicos (ex: Period.ofDays(10), Period.ofMonths(3), Period.ofYears(3), Period.ofWeeks(58)).
    - Também é possível somar diferentes unidades, por exemplo: Period.ofYears(3).plusMonths(3) resulta em "3 anos e 3 meses".

    Importante sobre a representação de Period:
    - **Period NÃO faz conversão automática entre unidades de tempo.**
        - Por exemplo, se você criar Period.ofMonths(15), ele será exibido como "P15M" (15 meses).
        - Não será convertido ou dividido automaticamente para "1 ano e 3 meses".
        - Da mesma forma, Period.ofDays(365) será "P365D", sem ser convertido para "1 ano".
    - Se você criar um novo Period utilizando apenas parte dos campos de outro Period (por exemplo, Period.ofYears(p5.getYears())), os demais valores são descartados. Assim, se p5 representa "3 anos e 3 meses", p6 criado dessa forma terá apenas "3 anos" e perderá os meses.
    - Para obter essa divisão ou manter todos os campos ao criar um novo Period, você precisa implementar manualmente a lógica para converter meses em anos, dias em meses/anos, etc.

    Formato de apresentação:
    - O resultado do Period é apresentado no padrão ISO-8601, por exemplo: P2Y7D (2 anos e 7 dias), P10D (10 dias), P58W (58 semanas).

    Resumo:
    - Use Period para intervalos de tempo baseados em datas (anos, meses, dias).
    - Period não faz conversão automática entre unidades; a responsabilidade de converter (ex: meses em anos) ou copiar todos os campos de um Period é do programador.
    - Para intervalos menores que dias (horas, minutos, segundos), utilize a classe Duration.
    */
}
