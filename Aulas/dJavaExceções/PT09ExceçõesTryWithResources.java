package dJavaExceções;

public class PT09ExceçõesTryWithResources {
    /*
    O try-with-resources é uma estrutura do Java criada para facilitar o gerenciamento de recursos, como streams,
    arquivos ou qualquer objeto que implemente a interface Closeable ou AutoCloseable.

    Principais vantagens:
    - Garante que os recursos sejam fechados automaticamente ao final do bloco try, mesmo se ocorrer uma exceção.
    - Evita o uso excessivo de blocos finally apenas para fechar recursos.
    - Deixa o código mais limpo, seguro e fácil de manter.

    Sintaxe:
    No cabeçalho do try, você declara os recursos que deseja gerenciar, separados por ponto e vírgula.
    Exemplo:
    try (BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"))) {
        // uso do recurso
    } catch (IOException e) {
        // tratamento da exceção
    }

    Regras importantes:
    - Os recursos declarados dentro do try devem implementar Closeable ou AutoCloseable.
    - Os recursos são fechados automaticamente ao final do bloco try, na ordem inversa em que foram abertos.
    - É possível declarar múltiplos recursos no mesmo try, separados por ";".

    Quando usar:
    - Sempre que precisar trabalhar com arquivos, streams, sockets, conexões de banco de dados ou qualquer recurso externo
    que precise ser fechado após o uso.
    - É especialmente útil para evitar vazamentos de recursos, que podem causar problemas de desempenho e travamentos no sistema.

    Exemplo prático:
    No exemplo abaixo, Leitor1 e Leitor2 implementam Closeable.
    No try-with-resources, ambos serão fechados automaticamente ao final do bloco, sem necessidade de um bloco finally.

    try (Leitor1 leitor1 = new Leitor1();
         Leitor2 leitor2 = new Leitor2()) {
        // código que usa os leitores
    } catch (IOException e) {
        // tratamento da exceção
    }

    Observações importantes:
    - Se o fechamento de algum recurso lançar uma exceção, ela será suprimida e pode ser obtida pelo método getSuppressed() da exceção principal.
    - Recursos declarados fora do try não são fechados automaticamente.
    - O try-with-resources é recomendado desde o Java 7. Antes disso, era necessário fechar recursos manualmente no bloco finally.

    Resumo:
    Use try-with-resources sempre que possível para garantir o fechamento correto de recursos e escrever um código mais seguro e limpo.
*/

}
