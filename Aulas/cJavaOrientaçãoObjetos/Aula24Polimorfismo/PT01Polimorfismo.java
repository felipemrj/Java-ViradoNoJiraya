package cJavaOrientaçãoObjetos.Aula24Polimorfismo;

public class PT01Polimorfismo {
/*
Polimorfismo é a capacidade de um objeto assumir diferentes formas, permitindo que uma variável
de referência de um tipo mais genérico possa apontar para objetos de tipos mais específicos.
Isso facilita o uso de métodos comuns, mesmo que cada objeto tenha implementações diferentes.

Exemplo conceitual:

Variável de referência:
Controle TV Samsung 2019 (acessa funções Netflix e Prime Video)

Objetos:
- TV Samsung 2019: funções Netflix e Prime Video
- TV Samsung 2020: funções Netflix, Prime Video e Youtube

O controle da TV Samsung 2019 pode ser usado para acessar Netflix e Prime Video em ambas as TVs,
pois ambas possuem essas funções. No entanto, ele não consegue acessar o Youtube na TV de 2020,
pois essa função não está disponível no controle de 2019.

Criamos objetos do tipo Computador e Tomate, mas utilizamos uma variável de referência do tipo mais genérico Produto.
Dessa forma, conseguimos acessar apenas os métodos definidos em Produto, como getNome, getValor e calcularImposto.
Métodos específicos de cada classe, como getDataValidade do Tomate, não ficam disponíveis através da referência Produto.
Para acessar métodos exclusivos de Tomate, seria necessário declarar a variável de referência como Tomate.
 */
}
