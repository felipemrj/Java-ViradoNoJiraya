package aJavaExercícios.cExercíciosLógicaProgramação.Exercício12.domain;

public enum CalcularPagamento {
    A_VISTA_DINHEIRO_PIX {
        @Override
        public double calcularPagamento(double valor) {
            return valor - valor * 0.15;
        }
    },
    A_VISTA_CREDITO {
        @Override
        public double calcularPagamento(double valor) {
            return valor - valor * 0.1;
        }
    },
    PARCELADO_DUAS {
        @Override
        public double calcularPagamento(double valor) {
            return valor;
        }
    },
    PARCELADO_TRES_OU_MAIS {
        @Override
        public double calcularPagamento(double valor) {
            return valor + valor * 0.1;
        }
    };

    public double calcularPagamento(double valor) {
        return 0;
    }
}
