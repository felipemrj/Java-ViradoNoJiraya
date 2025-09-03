package eJavaClassesUtilitárias.Aula28Datas;

public class PT06Instant {
    /*
    A classe Instant faz parte do pacote java.time e representa um ponto exato na linha do tempo em **Zulu Time** (UTC), com precisão de nanossegundos desde o Epoch (1º de janeiro de 1970 00:00:00 Zulu).

    Principais características:
    - Imutável (immutable) e thread-safe, como todas as classes do pacote java.time.
    - Trabalha com precisão de nanossegundos, diferente da antiga classe Date que trabalha com milissegundos.
    - Ideal para marcação de instantes exatos em sistemas distribuídos, logs, medições de tempo, timestamps, armazenamento em bancos de dados, etc.

    Por que usar Instant ao invés de LocalDateTime ou LocalTime?
    - **Instant é absoluto e global:** Sempre representa um instante exato em Zulu Time (UTC), ideal para registros precisos, independente do fuso horário local.
    - **LocalDateTime e LocalTime são relativos:** Não possuem informação de fuso horário, ou seja, representam datas/horários locais que variam conforme a localização (ex: 12h pode ser meio-dia em diferentes fusos).
    - **Aplicações típicas para Instant:**
        - Registrar quando exatamente um evento ocorreu (timestamp global em Zulu Time).
        - Medir tempos de execução ou intervalos.
        - Sincronizar sistemas em diferentes partes do mundo.
        - Armazenar datas de criação/modificação em bancos de dados.

    Exemplo do código:
    - Instant.now(): Obtém o instante atual em Zulu Time (UTC).
    - now.getEpochSecond(): Retorna o número de segundos desde o Epoch Zulu.
    - now.getNano(): Retorna os nanossegundos da fração atual.
    - Instant.ofEpochSecond(3): Cria um Instant 3 segundos após o Epoch Zulu.
    - Pode adicionar ou remover nanossegundos com o segundo parâmetro.

    Resumo:
    - Use Instant para representar pontos exatos no tempo (timestamps Zulu/UTC), especialmente em aplicações que exigem precisão, interoperabilidade ou sincronização global.
    - Use LocalDateTime para datas e horários locais sem fuso (ex: agendamentos).
    - Use LocalTime para horários locais sem referência a data ou fuso.
    - Para manipulação de fusos horários, utilize ZonedDateTime.
    */
}
