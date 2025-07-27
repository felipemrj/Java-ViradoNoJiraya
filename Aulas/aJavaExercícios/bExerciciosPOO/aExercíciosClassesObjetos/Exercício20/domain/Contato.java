package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.domain;

public class Contato {
    public String nome;
    public String telefone;
    public String email;

    public String compararNome(Contato contato) {
        if (contato.nome.equals(nome)) {
            return "Nomes iguais";
        }
        return "Nomes diferentes";
    }
}
