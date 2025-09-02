package eJavaClassesUtilitárias.Aula26Wrappers;

public class PT02Wrappers {
    /*
    Em relação aos Wrappers, existem também os conceitos de autoboxing e unboxing:

    - Autoboxing: É quando o Java converte automaticamente um tipo primitivo em um objeto Wrapper.
      Exemplo: Byte byteW = 127; // O valor 127 (byte) é convertido para Byte (Wrapper)

    - Unboxing: É o processo inverso, onde o Java converte um objeto Wrapper para o tipo primitivo correspondente.
      Exemplo: int i = intW; // O objeto Integer (intW) é convertido para int (primitivo)

    Wrappers possibilitam o uso de métodos utilitários que tipos primitivos não possuem.
    Por exemplo, a família dos métodos "parse" permite converter Strings em valores numéricos:
    - Integer.parseInt("1") converte uma String para int.
    - Boolean.parseBoolean("tRuE") converte uma String para boolean (aceita maiúsculas/minúsculas).

    Observação: Com exceção do Character, todos os Wrappers possuem métodos "parse".

    Wrappers também incluem métodos úteis para análise e manipulação de caracteres (especialmente na classe Character):

    Exemplos de métodos da classe Character:
    - Character.isDigit(char): Verifica se o caractere é um dígito numérico.
    - Character.isLetterOrDigit(char): Verifica se o caractere é uma letra ou dígito.
    - Character.isUpperCase(char): Verifica se o caractere está em maiúsculo.
    - Character.isLowerCase(char): Verifica se o caractere está em minúsculo.
    - Character.toLowerCase(char): Converte o caractere para minúsculo.
    - Character.toUpperCase(char): Converte o caractere para maiúsculo.

    Exemplo de uso dos métodos acima:
    Character.isDigit('9');            // true
    Character.isLetterOrDigit('!');    // false, pois '!' não é letra nem dígito
    Character.isUpperCase('B');        // true
    Character.isLowerCase('c');        // true
    Character.toLowerCase('B');        // 'b'
    Character.toUpperCase('c');        // 'C'

    Outras funcionalidades importantes dos Wrappers:
    - Permitem usar valores em coleções que só aceitam objetos (ex: ArrayList<Integer>).
    - Incluem métodos para comparação, conversão e manipulação de valores.
    - Facilitam operações de validação e checagem de tipos em tempo de execução.

         */
}
