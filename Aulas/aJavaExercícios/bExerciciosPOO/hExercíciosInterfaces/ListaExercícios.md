# Exercícios de Interfaces em Java

A seguir, você encontrará 5 exercícios para praticar o conceito de interfaces em programação orientada a objetos. Os exemplos usam sintaxe e contexto específicos para Java, mas podem ser adaptados para outras linguagens que suportem interfaces.

---

## 1. Definindo a Interface Veiculo

Crie uma interface chamada `Veiculo` com os métodos:
- `ligar()`
- `desligar()`

Em seguida, crie duas classes concretas: `Carro` e `Motocicleta`, que implementam a interface `Veiculo` e fornecem suas próprias versões dos métodos.

---

## 2. Interfaces Múltiplas: Identificavel e Registravel

Crie duas interfaces:
- `Identificavel`, com o método `getId()`
- `Registravel`, com o método `registrar()`

Depois, implemente uma classe `Usuario` que implemente ambas as interfaces e que armazene um identificador interno.

---

## 3. Métodos Default e Estáticos em Interfaces

Defina uma interface chamada `Calculadora` com:
- Um método abstrato `calcular(double a, double b)`
- Um método default `imprimirResultado(double a, double b)` que imprime o resultado da operação
- Um método estático `somar(double a, double b)` que retorna a soma dos dois valores

Implemente pelo menos duas classes diferentes de `Calculadora` (por exemplo, soma e multiplicação).

---

## 4. Interface Funcional e Expressões Lambda

Defina uma interface funcional chamada `Operacao` com um único método:
- `executar(int x, int y)`

Em uma classe de teste, crie instâncias de `Operacao` usando expressões lambda para operações básicas (soma, subtração, multiplicação e divisão). Aplique cada operação a um conjunto de pares de números.

---

## 5. Ordenação de Objetos com Comparator via Interface

Crie uma classe `Produto` com os atributos:
- `nome` (String)
- `preco` (double)

Defina uma interface `Comparavel` que estenda `Comparator<Produto>` e ofereça um método default `ordenar(List<Produto> produtos)`.  
Implemente dois comparadores diferentes (por nome e por preço) e use-os para ordenar listas de `Produto`.

---

**Dica:** Interfaces em Java são usadas para definir contratos de métodos que devem ser implementados pelas classes concretas. Elas também podem possuir métodos default e estáticos, além de serem usadas como base para expressões lambda e comparadores.