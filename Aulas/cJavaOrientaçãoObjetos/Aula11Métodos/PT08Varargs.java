package cJavaOrientaçãoObjetos.Aula11Métodos;

public class PT08Varargs {
/* VarArgs (Argumentos Variáveis)
 O recurso VarArgs permite que um método receba uma quantidade variável de argumentos do mesmo tipo,
 facilitando situações onde não sabemos quantos valores serão passados.

 Sintaxe:
 Usa-se o tipo seguido de três pontos e o nome do parâmetro: tipo... nome
 Exemplo: public void exemplo(int... numeros)

 Utilidade:
 Evita a necessidade de sobrecarga de métodos para diferentes quantidades de parâmetros.
 Os argumentos recebidos são tratados como um array dentro do método.

 Regras:
 Só pode haver um parâmetro VarArgs por método.
 Se houver outros parâmetros, o VarArgs deve ser o último.

 Exemplo de uso:
 public void imprimirNomes(String... nomes) {
     for (String nome : nomes) {
         System.out.println(nome);
     }
 }

 Chamada:
 imprimirNomes("Ana", "João", "Carlos");

 Isso imprime cada nome passado, independente da quantidade. */
}
