package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício10.domain;

public class Filme {
    public String titulo;
    public String diretor;
    public int ano;

    public void compararAno(Filme filme) {
        if (ano > filme.ano) {
            System.out.println(filme.titulo + " foi lançado primeiro!");
        } else if (ano < filme.ano) {
            System.out.println(filme.titulo + " foi lançado depois");
        } else {
            System.out.println("Foram lançados no mesmo ano");
        }
    }
}
