package eJavaClassesUtilitárias.Aula27Strings;

public class PT03StringsDesempenho {
    /*
    Ao trabalhar com grande quantidade de Strings em Java, o desempenho do sistema pode ser impactado negativamente.
    Isso ocorre porque Strings são imutáveis: cada concatenação gera um novo objeto, ocupando mais memória e aumentando o tempo de processamento.

    Para melhorar o desempenho em operações intensivas de concatenação ou manipulação de texto, o Java oferece as classes StringBuilder e StringBuffer.

    Principais diferenças e usos:

    - StringBuilder:
      - Indicado para situações em que não há necessidade de manipulação concorrente (multithread).
      - Mais rápido que StringBuffer porque seus métodos NÃO são sincronizados.
      - Sintaxe:
          StringBuilder sb = new StringBuilder();
          sb.append("texto");
      - Utilizado para manipulações intensivas de texto em aplicações single-thread.

    - StringBuffer:
      - Indicado para situações que exigem segurança em ambientes multithread (concorrência).
      - Mais lento que StringBuilder, pois seus métodos SÃO sincronizados (thread-safe).
      - Sintaxe:
          StringBuffer sbf = new StringBuffer();
          sbf.append("texto");
      - Utilizado quando várias threads podem acessar ou modificar o mesmo objeto de texto simultaneamente.

    Resumo de performance:
    - Usar concatenação direta de Strings (ex: texto += "novo") em loops é altamente ineficiente para grandes volumes, pois cria múltiplos objetos na memória.
    - StringBuilder é a opção recomendada para operações rápidas e seguras em ambientes single-thread.
    - StringBuffer é a escolha para ambientes que exigem manipulação segura em múltiplas threads, embora seja mais lento.
    - Prefira sempre StringBuilder (ou StringBuffer se necessário) para manipulações extensivas de texto, evitando o uso de concatenação direta com Strings.

    Conclusão:
    - Entender a imutabilidade das Strings e escolher a classe apropriada para manipulação pode trazer ganhos significativos de desempenho e economia de memória em aplicações Java.
    */
}
