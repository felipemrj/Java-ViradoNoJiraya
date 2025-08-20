package cJavaOrientaçãoObjetos.Aula21Enumeração;

public class PT04EnumeraçãoBuscaPorAtributos {
    /*
    A busca por atributos em enums Java permite localizar uma constante do enum com base em um valor específico de um atributo,
    como uma descrição ou código. Isso é útil quando o enum possui campos adicionais além do nome da constante.

    Como funciona:
    O enum define atributos e um construtor para inicializá-los.
    Um método estático percorre as constantes do enum usando um loop (for ou Stream) e retorna aquela cujo atributo corresponde ao valor buscado.

    Exemplo:

        public enum TipoPagamento {
            DEBITO("Pagamento via débito"),
            CREDITO("Pagamento via crédito");

            private final String descricao;

            TipoPagamento(String descricao) {
                this.descricao = descricao;
            }

            public String getDescricao() {
                return descricao;
            }

            public static TipoPagamento buscarPorDescricao(String descricao) {
                for (TipoPagamento tipo : TipoPagamento.values()) {
                    if (tipo.getDescricao().equalsIgnoreCase(descricao)) {
                        return tipo;
                    }
                }
                return null; // ou lançar exceção
            }
        }

    Uso:

        TipoPagamento tipo = TipoPagamento.buscarPorDescricao("Pagamento via crédito");
     */
}
