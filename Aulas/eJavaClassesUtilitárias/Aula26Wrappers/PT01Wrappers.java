package eJavaClassesUtilitárias.Aula26Wrappers;

public class PT01Wrappers {
    /*
    Wrappers são classes especiais que encapsulam tipos primitivos, transformando-os em objetos.

    Para criar um wrapper, utilize o nome do tipo primitivo começando com letra maiúscula.
    Exceções: int vira Integer, char vira Character.

    Principais wrappers:
    - byte    → Byte
    - short   → Short
    - int     → Integer
    - long    → Long
    - float   → Float
    - double  → Double
    - char    → Character
    - boolean → Boolean

    Por que usar wrappers?
    - Permitem utilizar tipos primitivos em estruturas que exigem objetos (ex: coleções como ArrayList<Integer>).
    - Possuem métodos utilitários para conversão, comparação e manipulação de valores.
    - Facilitam operações como conversão de String para número (ex: Integer.parseInt("10")).

    Exemplo de uso:
    int n = 10; // tipo primitivo
    Integer nW = 10; // wrapper (objeto)
    Long longW = 10L; // é necessário o 'L' para indicar tipo long

    Atenção:
    - Tipos primitivos permitem conversão automática se o tipo de destino suportar (ex: int para long).
    - Wrappers NÃO permitem atribuição direta entre tipos diferentes (ex: não é possível atribuir um Integer para um Long).
    - Para tipos como Long, é bom explicitar o sufixo ('L') no valor.

    Boas práticas: Prefira tipos primitivos sempre que possível. Use wrappers apenas quando necessário, como em APIs que exigem objetos.

    Dica: Use CTRL+E para pesquisar apenas na área selecionada e CTRL+R para substituir texto na seleção.
    */
}
