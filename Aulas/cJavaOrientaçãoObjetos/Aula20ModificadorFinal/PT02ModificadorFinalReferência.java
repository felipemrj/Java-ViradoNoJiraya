package cJavaOrientaçãoObjetos.Aula20ModificadorFinal;

public class PT02ModificadorFinalReferência {
    /*
    "PADRÃO DE PROJETO SINGLETON <<"

    Com tipos de referência, o modificador final impede que a variável aponte para outro objeto, mas não impede a alteração
    dos dados internos do objeto referenciado (caso ele seja mutável).

    Exemplo:
        public class ExemploFinalReferencia {
        public static final Pessoa PESSOA = new Pessoa("Ana");

            public static void main(String[] args) {
                // PESSOA = new Pessoa("João"); // Erro: não pode mudar a referência
                PESSOA.setNome("Maria"); // Permitido: pode alterar o estado do objeto
                System.out.println(PESSOA.getNome());
            }
        }

        public class Pessoa {
            private String nome;
            public Pessoa(String nome) { this.nome = nome; }
            public String getNome() { return nome; }
            public void setNome(String nome) { this.nome = nome; }
        }
     */
}
