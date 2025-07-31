package cJavaOrientaçãoObjetos.Aula17Associação.test;


import cJavaOrientaçãoObjetos.Aula17Associação.domain.Jogador;
import cJavaOrientaçãoObjetos.Aula17Associação.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time1 = new Time("Seleção Brasileira");

        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
