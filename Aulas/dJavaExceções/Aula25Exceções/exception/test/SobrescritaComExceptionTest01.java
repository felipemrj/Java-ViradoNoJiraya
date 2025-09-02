package dJavaExceções.Aula25Exceções.exception.test;

import dJavaExceções.Aula25Exceções.exception.domain.Funcionario;
import dJavaExceções.Aula25Exceções.exception.domain.LoginInvalidoException;
import dJavaExceções.Aula25Exceções.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
