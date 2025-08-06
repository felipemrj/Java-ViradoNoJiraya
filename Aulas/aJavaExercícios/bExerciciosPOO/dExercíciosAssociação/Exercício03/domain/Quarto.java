package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain;

public class Quarto {
    private int numero;
    private String tipo;
    private Hotel hotel;

    public Quarto(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public Quarto(int numero, String tipo, Hotel hotel) {
        this.numero = numero;
        this.tipo = tipo;
        this.hotel = hotel;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
