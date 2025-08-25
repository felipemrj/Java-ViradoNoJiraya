package cJavaOrientaçãoObjetos.Aula24Polimorfismo.test;


import cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain.repository.Repositorio;
import cJavaOrientaçãoObjetos.Aula24Polimorfismo.service.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
