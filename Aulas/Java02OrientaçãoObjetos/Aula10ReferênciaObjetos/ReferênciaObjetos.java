package Java02OrientaçãoObjetos.Aula10ReferênciaObjetos;

public class ReferênciaObjetos {
    /*
    Em Java, referências de objetos são variáveis que armazenam o endereço de memória onde um objeto é armazenado.
    Elas não contêm o objeto em si, mas sim um ponteiro para a localização do objeto na memória.
    Isso permite que vários "nomes" (variáveis) façam referência ao mesmo objeto, e que um objeto exista sem
    que nenhuma variável o esteja referenciando.

    Elaboração:
    Objetos e Referências: Em Java, quando um objeto é criado usando a palavra-chave new, um espaço na memória é
    alocado para armazenar os dados do objeto. Uma variável que armazena a localização desse
    espaço na memória é chamada de referência.

    Comparação com ==:
    O operador == compara as referências dos objetos, ou seja, verifica se duas variáveis apontam
    para o mesmo objeto na memória, não se os valores dentro dos objetos são iguais.

    Exemplo:
    Pessoa pessoa1 = new Pessoa("João");
    Pessoa pessoa2 = pessoa1; // pessoa2 referencia o mesmo objeto que pessoa1

    System.out.println(pessoa1 == pessoa2); // Saída: true (ambas as referências apontam para o mesmo objeto)

    Pessoa pessoa3 = new Pessoa("João"); // Cria um novo objeto
    System.out.println(pessoa1 == pessoa3); // Saída: false (referências diferentes)
     */

}
