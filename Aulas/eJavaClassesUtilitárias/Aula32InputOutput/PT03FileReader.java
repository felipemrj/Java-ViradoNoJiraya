package eJavaClassesUtilitárias.Aula32InputOutput;

public class PT03FileReader {
    /*
    A classe **FileReader** da API de I/O do Java é utilizada para ler dados de arquivos texto de forma simples e direta.

    Principais características:
    - Permite leitura de arquivos texto, caractere por caractere ou por blocos de caracteres.
    - Pode ser usada em conjunto com outras classes (BufferedReader, Scanner) para leitura eficiente e flexível.

    No exemplo acima:
    - `FileReader fr = new FileReader(file)`: Abre o arquivo "file.txt" para leitura.
    - O loop `while ((i = fr.read()) != -1)` lê cada caractere do arquivo até o final (`read()` retorna -1 quando acaba).
    - `(char)i` converte o inteiro lido para caractere e imprime no console.

    Alternativa (comentada no código):
    - Usar um array de caracteres (`char[] in = new char[30]`) para ler vários caracteres de uma vez e imprimir.

    Boas práticas:
    - Sempre utilize try-with-resources para garantir o fechamento do arquivo automaticamente.
    - FileReader é ideal para arquivos pequenos e leitura simples. Para arquivos grandes ou leitura linha a linha, prefira BufferedReader.

    Resumo:
    - FileReader facilita a leitura de arquivos texto, permitindo acessar o conteúdo caractere por caractere.
    - Essencial para aplicações que precisam ler dados armazenados em arquivos, como configurações, logs, dados de entrada, etc.
    */
}
