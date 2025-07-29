package aJavaExercícios.bExerciciosPOO.bExercíciosEncapsulamentoSobrecargaConstrutores.Exercício02.domain;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo, int ano) {
        this(marca, modelo);
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    public void acelerar(int velocidade) {
        System.out.printf("O carro está acelerando a %d km/h", velocidade);
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }
}
