package cJavaOrientaçãoObjetos.Aula21Enumeração;

public class PT03EnumeraçãoSobrescrita {
    /*
    Enums em Java podem ter métodos, inclusive sobrescritos por constantes específicas.
    Isso permite que cada constante tenha um comportamento próprio, além de atributos e construtores.
    No exemplo abaixo, o método calcularDesconto é sobrescrito por cada constante do enum, tornando o código flexível e organizado.

           public enum TipoPagamento {
        DEBITO("Pagamento via débito") {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO("Pagamento via crédito") {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        private final String descricao;

        TipoPagamento(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public double calcularDesconto(double valor) {
            return 0;
        }
    }
     */
}
