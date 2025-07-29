package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício12.domain;

public class Computador {
    public String marca;
    public String modelo;
    public int ano;

    public boolean estaAtualizado (int anoAtual) {
        if (ano >= (anoAtual - 3)) {
            return true;
        }
        return false;
    }
}

// ano = 2010 -- anoatual 2025
