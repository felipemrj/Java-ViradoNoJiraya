package cJavaOrientaçãoObjetos.Aula24Polimorfismo.service;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.repository.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
