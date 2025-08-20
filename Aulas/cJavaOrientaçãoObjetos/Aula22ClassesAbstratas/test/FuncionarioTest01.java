package cJavaOrientaçãoObjetos.Aula22ClassesAbstratas.test;

import cJavaOrientaçãoObjetos.Aula22ClassesAbstratas.domain.Desenvolvedor;
import cJavaOrientaçãoObjetos.Aula22ClassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Luffy", 12000);
        System.out.println(desenvolvedor);
    }
}
