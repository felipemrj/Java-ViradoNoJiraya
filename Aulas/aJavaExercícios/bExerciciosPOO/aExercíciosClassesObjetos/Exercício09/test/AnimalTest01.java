package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício09.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício09.domain.Animal;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício09.domain.ImprimeAnimal;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animalUm = new Animal();
        Animal animalDois = new Animal();
        ImprimeAnimal impressora = new ImprimeAnimal();

        animalUm.especie = "Leão";
        animalUm.idade = 9;
        animalUm.habitat = "Selva";

        animalDois.especie = "Baleia";
        animalDois.idade = 23;
        animalDois.habitat = "Oceano";

        impressora.exibeAnimal(animalUm);
        System.out.println("-------------");
        impressora.exibeAnimal(animalDois);



    }
}
