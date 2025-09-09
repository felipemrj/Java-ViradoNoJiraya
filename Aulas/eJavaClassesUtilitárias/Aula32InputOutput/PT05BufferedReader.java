package eJavaClassesUtilitárias.Aula32InputOutput;

public class PT05BufferedReader {
    /*
    A classe **BufferedReader** do Java é usada para leitura eficiente de arquivos texto, principalmente linha por linha.

    Principais características:
    - Utiliza um buffer interno para ler grandes blocos de dados de uma vez, tornando o processo mais rápido.
    - O método `readLine()` permite ler uma linha inteira do arquivo por vez, facilitando processamento de arquivos estruturados (como CSV, logs, textos).

    No exemplo acima:
    - `BufferedReader br = new BufferedReader(fr)`: Cria um BufferedReader usando um FileReader como fonte de dados.
    - O loop `while ((linha = br.readLine()) != null)` lê e imprime cada linha do arquivo até o final.
    - O bloco try-with-resources garante o fechamento automático dos recursos.

    Resumo:
    - Use BufferedReader para leitura eficiente de arquivos texto, principalmente quando precisa ler linhas completas.
    - Ideal para processar arquivos grandes, evitar overhead de leitura caractere por caractere.
    - Pode ser combinado com outras classes, como FileReader ou InputStreamReader, para ler arquivos ou fluxos de entrada.
    */

}
