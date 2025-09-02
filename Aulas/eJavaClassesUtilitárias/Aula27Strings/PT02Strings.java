package eJavaClassesUtilitárias.Aula27Strings;

public class PT02Strings {
    /*
    Strings em Java possuem diversos métodos utilitários para manipulação, análise e transformação de texto.
    Abaixo estão explicações sobre os principais métodos usados no exemplo acima, sua sintaxe e usos:

    - charAt(int index): Retorna o caractere presente na posição indicada pelo índice (começando do zero).
      Exemplo: nome.charAt(0); // Retorna o primeiro caractere da String

    - length(): Retorna o número de caracteres da String.
      Exemplo: nome.length(); // Retorna o tamanho da String

    - replace(CharSequence old, CharSequence new): Substitui todas as ocorrências de uma sequência de caracteres por outra.
      Exemplo: nome.replace("f", "l"); // Substitui 'f' por 'l' em toda a String

    - toLowerCase(): Retorna uma nova String com todos os caracteres convertidos para minúsculas.
      Exemplo: nome.toLowerCase();

    - toUpperCase(): Retorna uma nova String com todos os caracteres convertidos para maiúsculas.
      Exemplo: nome.toUpperCase();

    - substring(int beginIndex): Retorna uma nova String começando a partir do índice informado até o final.
      Exemplo: numeros.substring(3); // Retorna os caracteres a partir do índice 3

    - substring(int beginIndex, int endIndex): Retorna uma nova String a partir do índice inicial até o índice final (exclusivo).
      Exemplo: numeros.substring(0, 2); // Retorna os caracteres do índice 0 até 1

    - trim(): Remove espaços em branco do início e do fim da String.
      Exemplo: nome.trim(); // Remove espaços extras no começo e fim

    Outros métodos importantes da classe String:

    - equals(String str): Compara o conteúdo entre duas Strings.
      Exemplo: nome.equals("Luffy");

    - equalsIgnoreCase(String str): Compara duas Strings ignorando maiúsculas/minúsculas.
      Exemplo: nome.equalsIgnoreCase("luffy");

    - contains(CharSequence seq): Verifica se a String contém a sequência informada.
      Exemplo: nome.contains("Lu");

    - startsWith(String prefix): Verifica se a String começa com o prefixo informado.
      Exemplo: nome.startsWith("Lu");

    - endsWith(String suffix): Verifica se a String termina com o sufixo informado.
      Exemplo: nome.endsWith("y");

    - indexOf(String str): Retorna o índice da primeira ocorrência da sequência informada.
      Exemplo: nome.indexOf("f"); // Retorna o índice de 'f'

    - lastIndexOf(String str): Retorna o índice da última ocorrência da sequência informada.
      Exemplo: nome.lastIndexOf("f");

    - isEmpty(): Verifica se a String está vazia (possui zero caracteres).
      Exemplo: nome.isEmpty();

    */
}
