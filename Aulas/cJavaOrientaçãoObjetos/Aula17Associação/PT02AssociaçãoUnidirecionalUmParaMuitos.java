package cJavaOrientaçãoObjetos.Aula17Associação;

public class PT02AssociaçãoUnidirecionalUmParaMuitos {
    /*
    Time      1 -- N Jogador

    A associação unidirecional um-para-muitos ocorre quando uma classe (o lado "um") mantém referência para múltiplos objetos de outra classe (o lado "muitos"),
    mas não o contrário. Ou seja, apenas uma direção do relacionamento é conhecida e navegável.

    Por exemplo, em um sistema de futebol, a classe Time pode ter vários objetos Jogador, mas cada Jogador não precisa saber a qual Time pertence.
    O Time gerencia uma coleção (geralmente um array ou List) de Jogador, permitindo adicionar, remover e acessar seus jogadores.

    Esse tipo de associação é útil para modelar situações onde apenas um dos lados precisa conhecer o outro, simplificando o design e evitando dependências
    desnecessárias. É comum em cenários como: uma escola com várias turmas, uma biblioteca com vários livros, ou um departamento com vários funcionários.

    Associação unidirecional um-para-muitos:
    Uma classe (ex: Time) conhece e gerencia múltiplos objetos de outra classe (ex: Jogador).
    O lado "muitos" não mantém referência de volta para o lado "um".
    Utiliza coleções para armazenar os objetos associados.
    Facilita operações em grupo e modela relações do mundo real de forma clara e modular.

    Para aplicarmos esse conceito em nossas classes:
    Classe Jogador recebe como atributo "Time", se quisermos definir que o jogador tem que ter obrigatoriamente um time, adicionamos isso ao construtor
     */
}
