package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício01.domain;

public enum DiaSemana {
    SEGUNDA_FEIRA(1, "Segunda-Feira"),
    TERCA_FEIRA(2, "Terça-Feira"),
    QUARTA_FEIRA(3, "Quarta-Feira"),
    QUINTA_FEIRA(4, "Quinta-Feira"),
    SEXTA_FEIRA(5, "Sexta-Feira"),
    SABADO(6, "Sábado"),
    DOMINGO(7, "Domingo");

    private final int VALOR;
    private final String NOME_DIA;

    DiaSemana(int VALOR, String NOME_DIA) {
        this.VALOR = VALOR;
        this.NOME_DIA = NOME_DIA;
    }

    public static void imprimeVALOR() {
        for (DiaSemana diaSemana : values()) {
            System.out.println(diaSemana.VALOR + " " + diaSemana.NOME_DIA);
        }
    }

    public static DiaSemana buscaPorValor(int valorDia) {
        for (DiaSemana diaSemana : values()) {
            if (diaSemana.getVALOR() == valorDia) {
                return diaSemana;
            }
        }
        return null;
    }

    public static DiaSemana buscaPorNome(String nomeDia) {
        for (DiaSemana diaSemana : values()) {
            if (diaSemana.getNOME_DIA().equals(nomeDia)) {
                return diaSemana;
            }
        }
        return null;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNOME_DIA() {
        return NOME_DIA;
    }
}
