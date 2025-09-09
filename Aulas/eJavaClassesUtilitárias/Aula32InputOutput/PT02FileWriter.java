package eJavaClassesUtilitárias.Aula32InputOutput;

public class PT02FileWriter {
    /*
    A classe **FileWriter** da API de I/O do Java é utilizada para gravar dados em arquivos de texto de forma simples e eficiente.

    Principais características:
    - Permite escrever dados diretamente em arquivos.
    - Pode sobrescrever o arquivo ou adicionar conteúdo ao final (append).

    No exemplo acima:
    - `FileWriter fw = new FileWriter(file, true)`:
        - O segundo parâmetro (`true`) indica que o texto será **adicionado** ao final do arquivo, sem apagar o conteúdo anterior.
        - Se fosse `false` (ou omitido), o arquivo seria sobrescrito.
    - `fw.write("O DevDojo é o melhor curso do Brasil!")`: Escreve a String no arquivo.
    - `fw.flush()`: Garante que todos os dados sejam efetivamente gravados no arquivo.
    - O bloco `try-with-resources` garante que o FileWriter seja fechado automaticamente, mesmo em caso de exceção.

    Resumo:
    - Use FileWriter para gravar dados em arquivos texto.
    - O modo append (`true`) é útil para logs, registros ou quando não se quer perder dados antigos.
    - Para manipulação de arquivos grandes ou binários, prefira outras classes como BufferedWriter ou FileOutputStream.
    */
}
