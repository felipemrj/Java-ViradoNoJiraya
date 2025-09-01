package dJavaExceções;

public class PT04ExceçõesLançandoUnchecked {
    /*
    Para lançar novas exceções em Java, usamos o comando throw new. Por exemplo:

    throw new IllegalArgumentException("Argumento inválido");
    Para indicar que um método pode lançar uma exceção, colocamos o termo throws na assinatura do método,
    logo após os parênteses. Por exemplo:

    public void meuMetodo() throws MinhaExcecao {
        // implementação
    }
    No caso das exceções unchecked (que são subclasses de RuntimeException), o tratamento é opcional.
    Ou seja, o compilador não obriga que você trate essas exceções com blocos try/catch,
    nem que declare o uso de throws na assinatura do método. O tratamento pode ser feito apenas se for conveniente para a lógica do programa.

    Boa prática
    É recomendado documentar o método usando comentários do tipo /** ... */
    /* , indicando as regras, possíveis exceções lançadas e como elas devem ser tratadas.
    Com essa documentação, ao usar atalhos como CTRL+Q (no IntelliJ) ou passando o mouse sobre o método,
    é possível visualizar rapidamente os detalhes e recomendações de uso.

    Exemplo de documentação:

    /**
     * Realiza o pagamento do carrinho de compras.
     *
     * @throws PagamentoException se ocorrer um erro durante o pagamento.
     * @throws IllegalArgumentException se os dados do pagamento forem inválidos.
     */
    /*
    public void processarPagamento(Pagamento pagamento) {
        // implementação
    }
    Sobre exceções unchecked
    As exceções unchecked são usadas para representar erros de programação, como acesso a índice inválido,
    divisão por zero ou argumentos incorretos. Elas indicam problemas que podem ser evitados com o uso correto
    da API e validação dos dados. Mesmo sendo opcionais de tratar, é importante conhecer as exceções que um
    método pode lançar para evitar falhas inesperadas durante a execução do programa.
     */

}
