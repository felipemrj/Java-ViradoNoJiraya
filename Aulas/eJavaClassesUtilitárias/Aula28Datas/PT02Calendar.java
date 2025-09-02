package eJavaClassesUtilitárias.Aula28Datas;

public class PT02Calendar {
    /*
    A classe Calendar foi criada para superar diversas limitações da classe Date, principalmente no que diz respeito à manipulação de datas,
    internacionalização e operações de cálculos com datas e horários.

    Principais características:
    - Calendar é uma classe abstrata do pacote java.util, utilizada para representar e manipular datas e horários de forma mais flexível que Date.
    - Permite acessar e alterar facilmente diferentes campos da data (dia, mês, ano, hora, minuto, segundo, etc.).
    - Suporta internacionalização, permitindo trabalhar com calendários de diferentes locais e regras culturais.

    Como utilizar:
    - Para obter uma instância de Calendar, utiliza-se o método estático `Calendar.getInstance()`, que retorna um objeto configurado para o
    fuso horário e localização padrão do sistema.

        Exemplo: Calendar c = Calendar.getInstance();

    Principais métodos e campos utilizados:
    - get(int field): Obtém o valor de um campo específico da data/hora (ex: dia do mês, dia da semana, etc.).
        Exemplos:
          c.get(Calendar.DAY_OF_WEEK);         // Dia da semana (1 = Domingo)
          c.get(Calendar.DAY_OF_MONTH);        // Dia do mês
          c.get(Calendar.DAY_OF_YEAR);         // Dia do ano
          c.get(Calendar.DAY_OF_WEEK_IN_MONTH); // Semana do mês

    - getFirstDayOfWeek(): Retorna o primeiro dia da semana para o local definido (ex: em muitos países, domingo ou segunda-feira).
        Exemplo: c.getFirstDayOfWeek() == Calendar.SUNDAY

    - add(int field, int amount): Permite somar ou subtrair valores de campos da data/hora, alterando o objeto Calendar.
        Exemplos:
          c.add(Calendar.DAY_OF_MONTH, 2);  // Adiciona 2 dias ao dia atual
          c.add(Calendar.HOUR, 12);         // Adiciona 12 horas à hora atual

    - getTime(): Retorna um objeto Date representando a data/hora atual do Calendar.
        Exemplo: Date date = c.getTime();

    Observações importantes:
    - Calendar não é thread-safe, ou seja, não deve ser compartilhado entre múltiplas threads sem sincronização.
    - Apesar de ser mais poderosa que Date, Calendar também possui limitações e pode ser confusa para manipulações complexas.
    - Por isso, para novos projetos, recomenda-se o uso das classes do pacote java.time (como LocalDate, LocalDateTime, ZonedDateTime),
    que são mais modernas, seguras e fáceis de usar.

    Resumo:
    - Calendar foi uma importante evolução para manipulação de datas e horários em Java, permitindo cálculos, internacionalização e acesso a diferentes campos.
    - Seus métodos facilitam operações como somar/subtrair dias, horas, meses, além de acessar partes específicas da data.
    - Para novos projetos, prefira as classes do pacote java.time, mas compreenda Calendar para manutenção de sistemas legados ou integração com APIs antigas.
    */
}
