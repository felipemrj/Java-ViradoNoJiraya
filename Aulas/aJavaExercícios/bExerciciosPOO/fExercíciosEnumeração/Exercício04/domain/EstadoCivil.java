package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício04.domain;

public enum EstadoCivil {
    SOLTEIRO(1, "Solteiro"),
    CASADO(2, "Casado"),
    DIVORCIADO(3, "Divorciado");

    private int valor;
    private String nomeRelatorio;

    EstadoCivil(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
