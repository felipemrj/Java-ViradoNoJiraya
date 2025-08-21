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

## 4. Interface Básica de Imprimível

Defina uma interface chamada `Imprimivel` com o método:
- `void imprimir()`

Crie duas classes, `Documento` e `Foto`, que implementem a interface `Imprimivel`. Cada classe deve exibir uma mensagem diferente ao ser impressa.

---

## 5. Interface de Mensagem

Crie uma interface chamada `Mensagem` com o método:
- `String getMensagem()`

Implemente duas classes, `MensagemTexto` e `MensagemEmail`, cada uma retornando uma mensagem diferente ao implementar o método `getMensagem()`.

---

**Dica:**  
Estes exercícios vão te ajudar a compreender como interfaces podem ser usadas para definir comportamentos comuns entre diferentes tipos de objetos, mesmo que suas implementações sejam distintas.