package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private Quarto quarto;
    private Hospede hospede;

    public Reserva(String dataEntrada, String dataSaida, Quarto quarto, Hospede hospede) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.hospede = hospede;
    }

    public void imprime(){
        System.out.println("RESERVA");
        System.out.println("Check-In: " + dataEntrada);
        System.out.println("Check-Out: " + dataSaida);
        System.out.println("Quarto: " + quarto.getTipo() + " " + quarto.getNumero());
        System.out.println("Hóspede: " + hospede.getNome());
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
}
