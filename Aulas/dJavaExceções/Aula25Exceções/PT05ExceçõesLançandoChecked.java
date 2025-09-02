package dJavaExceções.Aula25Exceções;

public class PT05ExceçõesLançandoChecked {
    /*
    Ao contrário das exceções unchecked, as exceções checked exigem que o tratamento seja obrigatório.
    Para isso, devemos incluir o termo throws na assinatura do método que pode lançar esse tipo de exceção.

    O tratamento da exceção não precisa ser feito necessariamente no próprio método onde ela ocorre.
    Podemos delegar essa responsabilidade para quem estiver chamando o método, utilizando o throws na assinatura.

    É importante decidir se o tratamento será feito dentro do método ou no momento em que o método é chamado:

    Se o método for privado, normalmente usamos o bloco try/catch dentro do próprio método,
    pois ele só será acessado dentro da mesma classe. Nesse caso, não faz sentido delegar o tratamento para outras partes do código.

    Se o método for público, é interessante permitir que o tratamento seja feito onde o método for utilizado,
    já que o contexto de uso pode exigir formas diferentes de lidar com a exceção.

    Também existe a possibilidade de combinar as duas abordagens: capturar a exceção e relançá-la (rethrow). Por exemplo:

    Imagine que temos um carrinho de compras e tentamos efetuar um pagamento, mas ele falhou. Nesse caso, queremos:

    Exibir uma mensagem no console, como "Pagamento falhou".
    Capturar a exceção no método.
    Relançar a exceção para que o código que chamou o método também possa tratá-la, usando o throw.
    Assim, garantimos que a exceção seja registrada e que o chamador também seja avisado para tomar as devidas providências.
     */
}
