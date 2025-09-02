package eJavaClassesUtilitárias.Aula27Strings;

public class PT01Strings {
    /*
    Strings em Java são objetos especiais e possuem uma característica fundamental: **imutabilidade**.

    Imutabilidade significa que, uma vez criada, uma String **não pode ser alterada**. Qualquer operação que pareça modificar uma String, na verdade, cria um novo objeto String.
    Por exemplo: `nome.concat(" Suane");` não altera o valor de `nome`, apenas retorna uma nova String com o conteúdo concatenado.

    Por que as Strings são imutáveis?
    - Segurança: Strings são usadas em muitas partes críticas do Java, como caminhos de arquivos e variáveis de ambiente. Imutabilidade evita alterações acidentais ou maliciosas.
    - Performance: O Java utiliza um mecanismo chamado **String Pool** (ou String constant pool) para otimizar o uso de memória. Strings literais iguais são armazenadas apenas uma vez e compartilhadas entre variáveis.

    Como funciona a comparação de Strings?
    - **Por referência (`==`)**: Compara se as duas variáveis apontam para o MESMO objeto na memória. Strings criadas como literais ("William") vão para o String Pool, então variáveis com o mesmo valor literal geralmente apontam para o mesmo objeto.
      Exemplo:
        String nome = "William";
        String nome2 = "William";
        System.out.println(nome == nome2); // true, pois ambos apontam para o mesmo objeto no pool

    - **Por valor (`.equals()`)**: Compara o conteúdo das Strings, independentemente de serem objetos diferentes ou não.
      Exemplo:
        String nome3 = new String("William");
        System.out.println(nome == nome3); // false, nome3 é um novo objeto fora do pool
        System.out.println(nome.equals(nome3)); // true, pois o conteúdo é igual

    Resumo:
    - Prefira comparar Strings sempre usando `.equals()`, pois garante que a comparação seja feita pelo valor.
    - Operações que parecem alterar uma String, na verdade, criam um novo objeto. A original permanece intacta.
    - O uso do String Pool torna a manipulação de Strings mais eficiente, mas é importante entender a diferença entre comparação por referência e por valor para evitar bugs.
     */
}
