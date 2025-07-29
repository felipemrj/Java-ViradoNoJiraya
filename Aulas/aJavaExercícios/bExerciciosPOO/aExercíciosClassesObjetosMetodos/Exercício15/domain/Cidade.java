package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício15.domain;

public class Cidade {
    public String nome;
    public String estado;
    public int populacao;

    public String comparaPopulacao(Cidade cidadeComparada) {
        if (cidadeComparada.populacao > populacao) {
            return cidadeComparada.nome;
        } else if (cidadeComparada.populacao < populacao) {
            return nome;
        }
        return "Mesma população";
    }
}
