package Java01Introdução.Aula04EstruturasCondicionais;

public class Aula04PT2EstruturasCondicionaisELSEIF {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int age = 17;
        String categoria = "";

        // Se a idade for menor que 15, entra no primeiro bloco
        if (age < 15) {
            categoria = "Categoria Infantil";
        }
        // Se não, mas for entre 15 e 17, entra no segundo bloco
        else if (age >= 15 && age < 18) {
            categoria = "Categoria Juvenil";
        }
        // Se nenhuma das anteriores for verdadeira, entra no else
        else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

        // Variáveis locais precisam ser inicializadas dentro do escopo { } antes de serem utilizadas


    }
}
