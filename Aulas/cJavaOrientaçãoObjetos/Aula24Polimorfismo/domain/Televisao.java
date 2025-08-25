package cJavaOrientaçãoObjetos.Aula24Polimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public double getValor() {
        return super.getValor();
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return getValor() * IMPOSTO_POR_CENTO;
    }
}
