package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício01.domain;

public class ImpressoraAnimal {
    public static void imprimirSom(Animal animal) {
        animal.emitirSom();
        if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            gato.arranhar();
        }
    }
}
