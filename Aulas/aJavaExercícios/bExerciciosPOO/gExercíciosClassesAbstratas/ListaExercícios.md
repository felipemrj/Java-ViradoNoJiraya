# Exercícios de Classes e Métodos Abstratos

A seguir, você encontrará 5 exercícios para praticar o conceito de classes e métodos abstratos em programação orientada a objetos. Os exemplos usam sintaxe genérica que pode ser adaptada para Java, C#, Python ou outra linguagem que suporte abstração.

---

## 1. Definindo uma Classe Animal

Crie uma classe abstrata chamada `Animal` com um método abstrato `emitirSom()`. Em seguida, crie duas subclasses concretas: `Cachorro` e `Gato`, que implementam o método `emitirSom()` de acordo com o animal.

---

## 2. Formas Geométricas

Implemente uma classe abstrata `Forma` com um método abstrato `calcularArea()`. Crie as classes `Circulo` e `Retangulo` que estendem `Forma` e implementam o cálculo da área de acordo com a forma.

---

## 3. Funcionários de uma Empresa

Crie uma classe abstrata `Funcionario` com os atributos `nome` e `salarioBase`, e um método abstrato `calcularSalario()`. Implemente as classes `FuncionarioCLT` e `FuncionarioPJ`, cada uma com sua lógica para calcular o salário.

---

## 4. Sistema de Pagamento

Implemente uma classe abstrata `Pagamento` com um método abstrato `realizarPagamento(valor)`. Crie as subclasses `PagamentoCartao` e `PagamentoBoleto`, cada uma implementando o pagamento de acordo com o tipo.

---

## 5. Veículo e Abastecimento

Crie uma classe abstrata `Veiculo` com um método abstrato `abastecer(litros)`. Implemente as classes `Carro` e `Moto`, cada uma com regras diferentes para o abastecimento (ex: tanque máximo diferente).

---

**Dica:** Quando for implementar, lembre-se que uma classe abstrata não pode ser instanciada diretamente e seus métodos abstratos devem ser implementados nas subclasses.