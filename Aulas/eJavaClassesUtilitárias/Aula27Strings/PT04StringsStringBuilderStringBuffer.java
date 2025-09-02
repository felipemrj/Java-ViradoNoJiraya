package eJavaClassesUtilitárias.Aula27Strings;

public class PT04StringsStringBuilderStringBuffer {
    /*
    StringBuilder e StringBuffer são classes utilizadas para manipulação eficiente de sequências de caracteres em Java.

    Principais características:
    - Diferente da classe String, StringBuilder e StringBuffer **não são imutáveis**. Ou seja, seus valores podem ser alterados sem criar novos objetos.
    - Ao criar um StringBuilder, existem três opções de parâmetros:
      1. Uma String inicial (ex: new StringBuilder("texto"))
      2. Uma sequência de caracteres (ex: new StringBuilder(CharSequence))
      3. Uma capacidade inicial (ex: new StringBuilder(int capacidade))

    Se nenhum parâmetro for informado, o StringBuilder é criado com capacidade inicial para 16 caracteres. Quando esse limite é ultrapassado,
    a capacidade é automaticamente aumentada (normalmente dobrando o tamanho anterior).

    Para adicionar ou modificar o conteúdo do StringBuilder, utiliza-se principalmente o método `.append()`:
      Exemplo: sb.append("texto");

    Outros métodos úteis do StringBuilder/StringBuffer:
    - .reverse(): Inverte a sequência de caracteres.
    - .delete(int start, int end): Remove caracteres em um intervalo de índices.
    - .insert(int offset, String str): Insere uma String em uma posição específica.
    - .replace(int start, int end, String str): Substitui parte da sequência por outra String.
    - .substring(int start, int end): Retorna parte do conteúdo como String (não modifica o StringBuilder).

    Diferenças entre StringBuilder e StringBuffer:
    - StringBuilder: Não é sincronizado (não é thread-safe), sendo mais rápido e indicado para uso em aplicações single-thread.
    - StringBuffer: É sincronizado (thread-safe), indicado para ambientes com múltiplas threads, porém mais lento devido ao controle de concorrência.

    Sobre o trecho:
        String nome = "William Suane";
        nome.concat(" DevDojo");
        nome.substring(0, 3);
        System.out.println(nome);

    Neste caso, apesar de usar os métodos `.concat` e `.substring`, o valor original da variável `nome` **não é alterado**. Isso ocorre porque a classe String é imutável:
    - O método `.concat(" DevDojo")` retorna uma NOVA String com o valor concatenado, mas essa nova String **não foi atribuída à variável nome**.
    - O método `.substring(0, 3)` também retorna uma NOVA String contendo os três primeiros caracteres, mas **não altera o valor original**.
    - Portanto, ao imprimir `nome`, o valor exibido será "William Suane", pois nenhuma das operações modificou a variável.

    Resumo:
    - Strings são imutáveis: métodos como `.concat` ou `.substring` nunca alteram o valor original, apenas retornam novas Strings.
    - StringBuilder/StringBuffer permitem modificações diretas e são ideais para operações intensivas de manipulação de texto.
    - Escolha StringBuilder para melhor desempenho em ambientes single-thread e StringBuffer para segurança em ambientes multithread.
    */
}
