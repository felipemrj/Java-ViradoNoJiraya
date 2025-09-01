package dJavaExceções;

public class PT03ExceçõesException {
    /*
    Para tratar exceções em Java, utilizamos os blocos "try" e "catch".
    No bloco "try", colocamos o código que pode gerar uma exceção durante a execução.
    No bloco "catch", definimos o que o programa deve fazer caso essa exceção aconteça.

    É importante especificar no "catch" qual tipo de exceção estamos tratando.
    Evite usar a exceção genérica "Exception", pois assim não saberemos exatamente qual foi o erro,
    dificultando o diagnóstico e o tratamento adequado.

    Quando ocorre um erro dentro do bloco "try", o programa interrompe a execução naquele ponto
    e salta diretamente para o bloco "catch" correspondente.

    Nunca deixe o bloco "catch" vazio, ignorando a exceção.
    Sempre registre o ocorrido, por exemplo, usando o método "printStackTrace()".
    Esse método imprime na tela toda a pilha de chamadas (stack trace), facilitando a identificação do problema.
    Vale lembrar que o uso do "printStackTrace()" não faz o programa parar de funcionar; ele apenas registra o erro.

    Observação: Não coloque lógica de negócio dentro do bloco "catch".
    O "catch" deve ser utilizado exclusivamente para lidar com exceções, como registrar erros ou informar o usuário.
    */
}
