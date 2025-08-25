package cJavaOrientaçãoObjetos.Aula24Polimorfismo.service;

import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.repository.Repositorio;

public class RepositoryMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
