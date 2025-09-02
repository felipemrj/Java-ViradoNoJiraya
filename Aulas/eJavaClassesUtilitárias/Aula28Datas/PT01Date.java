package eJavaClassesUtilitárias.Aula28Datas;

public class PT01Date {
    /*
    A classe Date faz parte do pacote java.util e foi originalmente criada para representar datas e horários em Java.
    Apesar de ser uma das primeiras classes para manipulação de datas, atualmente é considerada **depreciada** para muitos usos,
    principalmente porque possui várias limitações e métodos obsoletos. No entanto, ainda é comum encontrá-la em sistemas legados.

    Principais características:
    - Internamente, a classe Date armazena o valor da data e hora como um número do tipo **long**, que representa a quantidade
    de milissegundos desde 1º de janeiro de 1970, 00:00:00 GMT (também conhecido como "Epoch").
    - Ao criar um novo objeto Date sem parâmetros (`new Date()`), ele representa o momento atual.
    - O método `.getTime()` retorna o valor da data/hora em milissegundos desde a Epoch.

    Exemplo de uso:
        Date date = new Date(); // Representa a data e hora atual
        System.out.println(date); // Exibe a data/hora no formato padrão
        System.out.println(date.getTime()); // Exibe o valor em milissegundos desde a Epoch

    Atenção:
    - Muitos métodos da classe Date, como manipulação direta de ano, mês, dia, etc., foram depreciados e não devem ser usados em novos projetos.
    - Para novos sistemas, recomenda-se o uso das classes do pacote java.time (como LocalDate, LocalDateTime, Instant), que são mais poderosas, seguras e flexíveis.

    Resumo:
    - Utilize Date apenas para manutenção de sistemas antigos ou integração com APIs legadas.
    - Para novos desenvolvimentos, prefira as classes modernas do pacote java.time.
    */
}
