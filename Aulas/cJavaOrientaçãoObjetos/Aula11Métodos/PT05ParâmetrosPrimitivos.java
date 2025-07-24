package cJavaOrientaçãoObjetos.Aula11Métodos;

public class PT05ParâmetrosPrimitivos {
    /* Em Java, quando um tipo primitivo é passado como parâmetro para um método,
    o valor é copiado para o método, e não a referência ao local original na memória.
    Isso significa que alterações feitas nesse parâmetro dentro do método não afetam o valor original fora dele.
    Tipos primitivos como int, double, char, boolean, entre outros, sempre são passados por valor.

    É importante saber que tipos primitivos são passados por valor porque isso evita confusões ao tentar modificar variáveis dentro de métodos,
    esperando que o valor original seja alterado. Esse conhecimento é útil, por exemplo, ao implementar funções que precisam atualizar dados:
    se você quiser que uma alteração feita dentro do método reflita fora dele, deve usar objetos ou retornar o novo valor.
    Também ajuda a evitar bugs relacionados à manipulação de dados e facilita o entendimento do comportamento do código em situações de passagem de parâmetros. */
}
