package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício03.domain;

public class Carro {
    public String modelo;
    public int ano;

    public boolean atualizarAno(int novoAno) {
        if (novoAno != ano) {
            ano = novoAno;
            return true;
        }
        return false;
    }
}




