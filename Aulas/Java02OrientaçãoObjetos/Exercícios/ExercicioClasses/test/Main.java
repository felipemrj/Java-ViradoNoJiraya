package Java02OrientaçãoObjetos.Exercícios.ExercicioClasses.test;

import Java02OrientaçãoObjetos.Exercícios.ExercicioClasses.domain.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro();
        Carro carroDois = new Carro();

        carroUm.nomeCarro = "Carro 1";
        carroUm.modeloCarro = "Audi";
        carroUm.anoCarro = 1994;

        carroDois.nomeCarro = "Carro 2";
        carroDois.modeloCarro = "BMW";
        carroDois.anoCarro = 1990;

        String infoCarroUm = "Nome: " + carroUm.nomeCarro + " | Modelo: " + carroUm.modeloCarro + " | Ano: " + carroUm.anoCarro;
        String infoCarroDois = "Nome: " + carroDois.nomeCarro + " | Modelo: " + carroDois.modeloCarro + " | Ano: " + carroDois.anoCarro;

        System.out.println(infoCarroUm);
        System.out.println(infoCarroDois);
    }
}
