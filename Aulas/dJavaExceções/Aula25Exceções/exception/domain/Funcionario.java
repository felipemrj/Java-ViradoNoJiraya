package dJavaExceções.Aula25Exceções.exception.domain;

public class Funcionario extends Pessoa {

    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando funcionário");
    }
}
