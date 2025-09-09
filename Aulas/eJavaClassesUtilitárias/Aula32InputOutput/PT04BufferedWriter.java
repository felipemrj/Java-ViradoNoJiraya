package eJavaClassesUtilitárias.Aula32InputOutput;

public class PT04BufferedWriter {
    /*
    A classe **BufferedWriter** do Java é usada para escrita eficiente de dados em arquivos texto, trabalhando junto com FileWriter.

    Principais características:
    - Utiliza um buffer interno para reduzir o número de acessos ao disco, tornando a escrita mais rápida.
    - Permite escrever linhas completas e inserir quebras de linha facilmente.

    No exemplo acima:
    - `BufferedWriter br = new BufferedWriter(fw)`: Cria um BufferedWriter a partir de um FileWriter, permitindo escrita com buffer.
    - `bw.write(...)`: Escreve uma String no arquivo.
    - `bw.newLine()`: Adiciona uma quebra de linha (compatível com o sistema operacional).
    - `bw.flush()`: Garante que todos os dados do buffer sejam gravados no arquivo imediatamente.
    - O bloco try-with-resources garante fechamento automático do BufferedWriter e do FileWriter.

    Resumo:
    - Use BufferedWriter para escrita eficiente e estruturada em arquivos texto.
    - Ideal para grandes volumes de dados ou quando é necessário escrever várias linhas.
    - Permite maior controle sobre o fluxo de gravação e compatibilidade de linhas.
    */
}
