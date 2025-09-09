package eJavaClassesUtilitárias.Aula32InputOutput;

public class PT01File {
    /*
    A classe **java.io.File** representa arquivos e diretórios no sistema de arquivos. Permite diversas operações para manipulação, consulta e gerenciamento de arquivos/diretórios.

    Principais métodos e usos:
    - `createNewFile()`: Cria um novo arquivo vazio. Retorna `true` se o arquivo foi criado, `false` se já existe.
    - `delete()`: Exclui o arquivo ou diretório.
    - `getPath()`: Retorna o caminho relativo informado na criação do objeto File.
    - `getAbsolutePath()`: Retorna o caminho absoluto no sistema de arquivos.
    - `isDirectory()`: Retorna `true` se o File representa um diretório.
    - `isFile()`: Retorna `true` se o File representa um arquivo.
    - `isHidden()`: Retorna `true` se o arquivo/diretório está oculto.
    - `lastModified()`: Retorna o timestamp (em milissegundos) da última modificação.
        - Pode ser convertido para uma data legível usando `new Date(...)` ou API java.time (`Instant.ofEpochMilli(...)`).
    - `exists()`: Verifica se o arquivo/diretório existe.

    Boas práticas:
    - Sempre trate exceções (IOException, etc) ao lidar com arquivos.
    - Use a API moderna `java.nio.file` para operações mais avançadas e eficientes.
    - A classe File não manipula conteúdo; apenas metadados e operações básicas.

    Resumo:
    - `File` é útil para criar, excluir, consultar e gerenciar arquivos/diretórios.
    - Permite verificar propriedades e obter informações detalhadas de arquivos.
    - Ideal para aplicações que precisam interagir com o sistema de arquivos local.
    */
}
