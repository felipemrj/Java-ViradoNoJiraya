package bJavaIntrodução.Aula02TiposPrimitivos;
/* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>. */

public class PT02Exercicio {
    public static void main(String[] args) {
        String name = "Felipe";
        String adress = "Rua João, nº123, Vila do Chaves";
        String date = "10/09/2022";
        double wage = 2000;

        System.out.printf("Eu %s, morando no endereço %s,\n" +
                "confirmo que recebi o salário de %.2f, na data %s.\n", name, adress, wage, date);

        // ou

        String phrase = "Eu " + name + ", morando no endereço " + adress + ",\n" +
                "confirmo que recebi o salário de " + wage + ", na data " + date + ".";

        System.out.println(phrase);

    }
}
