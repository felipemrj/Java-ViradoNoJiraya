package dJavaExceções.Aula25Exceções;

public class PT06ExceçõesBlocoFinally {
    /*
    Em algumas situações, após o tratamento de exceções com try/catch, precisamos garantir que determinado código seja sempre executado.
    Para isso, utilizamos o bloco finally.

    O bloco finally é útil, por exemplo, para fechar recursos como arquivos, conexões de banco de dados, ou liberar memória,
    independente de ter ocorrido uma exceção ou não durante a execução do bloco try.

    Regras importantes:
    - O bloco finally sempre será executado após o try/catch, mesmo que uma exceção seja lançada e capturada,
      ou mesmo se não houver exceção.
    - O finally também é executado se houver um return, break ou continue dentro do try/catch.
    - Se o programa for encerrado abruptamente (por exemplo, com System.exit()), o finally pode não ser executado.

    Exemplo:
    try {
        // código que pode lançar exceção
    } catch (Exception e) {
        // tratamento da exceção
    } finally {
        // este bloco sempre será executado
        // ideal para fechar arquivos, conexões, liberar recursos etc.
    }

     */
}
