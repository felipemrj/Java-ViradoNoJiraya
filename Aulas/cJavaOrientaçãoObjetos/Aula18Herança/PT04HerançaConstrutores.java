package cJavaOrientaçãoObjetos.Aula18Herança;

public class PT04HerançaConstrutores {
    /*
    A palavra-chave super em Java é usada para acessar membros (atributos e métodos) da superclasse a partir da subclasse. Ela serve para:


    Chamar o construtor da superclasse: super(parametros)
    Acessar métodos da superclasse: super.metodo()
    Acessar atributos da superclasse: super.atributo
    Exemplo:

    public class Pessoa {
        protected String nome;
        public void imprime() {
            System.out.println("Nome: " + nome);
        }
    }

    public class Funcionario extends Pessoa {
        private double salario;

        public Funcionario(String nome) {
            super(nome); // chama o construtor da superclasse
        }

        @Override
        public void imprime() {
            super.imprime(); // chama o método imprime da superclasse
            System.out.println("Salário: " + salario);
        }
    }
     */
}
