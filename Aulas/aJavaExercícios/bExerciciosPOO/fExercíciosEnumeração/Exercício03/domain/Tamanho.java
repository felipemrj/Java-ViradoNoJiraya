package aJavaExercícios.bExerciciosPOO.fExercíciosEnumeração.Exercício03.domain;

public enum Tamanho {
    PEQUENO {
        @Override
        public String getDescricao() {
            return "Pequeno";
        }
    },
    MEDIO {
        @Override
        public String getDescricao() {
            return "Médio";
        }
    },
    GRANDE {
        @Override
        public String getDescricao() {
            return "Grande";
        }
    };

    public abstract String getDescricao();
}
