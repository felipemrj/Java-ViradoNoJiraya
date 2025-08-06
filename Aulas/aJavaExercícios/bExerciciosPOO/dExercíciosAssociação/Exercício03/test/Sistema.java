package aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain.Hospede;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain.Hotel;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain.Quarto;
import aJavaExercícios.bExerciciosPOO.dExercíciosAssociação.Exercício03.domain.Reserva;

public class Sistema {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Copacabana Palace", "RJ");

        Quarto quarto1 = new Quarto(175, "Suíte", hotel);
        Quarto quarto2 = new Quarto(176, "Suíte", hotel);
        Quarto quarto3 = new Quarto(177, "Suíte", hotel);

        hotel.setQuartos(new Quarto[]{quarto1, quarto2, quarto3});

        Hospede hospede1 = new Hospede("Felipe", "11976898989");
        Hospede hospede2 = new Hospede("Thamyres", "11976898989");
        Hospede hospede3 = new Hospede("João", "11976898989");

        Reserva reserva1 = new Reserva("06/08/2025", "09/08/2025", quarto1, hospede1);
        Reserva reserva2 = new Reserva("06/08/2025", "09/08/2025", quarto2, hospede2);
        Reserva reserva3 = new Reserva("06/08/2025", "09/08/2025", quarto3, hospede3);

        hotel.imprime();
        System.out.println("---");

        reserva1.imprime();
        System.out.println("---");
        reserva2.imprime();
        System.out.println("---");
        reserva3.imprime();

    }
}
