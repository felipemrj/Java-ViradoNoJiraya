# Lista de Exercícios: Modificador `static` em Java

Esta lista de exercícios aborda os principais conceitos do modificador `static` em Java, incluindo atributos, métodos, blocos de inicialização estáticos e suas implicações. Resolva cada exercício para praticar e consolidar seu conhecimento!

---

## 1. Atributos `static`
Crie uma classe chamada `Contador` com um atributo `static` chamado `totalContadores` que deve contar o número de objetos criados dessa classe. Implemente o construtor e demonstre que o valor de `totalContadores` é compartilhado entre todas as instâncias.

---

## 2. Métodos `static`
Implemente uma classe chamada `MatematicaUtil` que possua métodos `static` para operações matemáticas simples, como somar, subtrair, multiplicar e dividir. Demonstre o uso desses métodos sem instanciar objetos.

---

## 3. Atributos `static` para Configuração

Crie uma classe chamada `Configuracao` que possua atributos `static` para armazenar valores de configuração, como `versaoApp` e `nomeEmpresa`.  
Implemente métodos para alterar e acessar esses valores.

Em uma classe de teste, demonstre que os valores são compartilhados entre todas as instâncias da classe, e que ao alterar por uma instância, todas as outras enxergam o novo valor.

---

## 4. Restrição do uso de `this` em métodos `static`
Tente acessar um atributo não-static dentro de um método `static` e observe o erro de compilação. Explique por que isso ocorre e como corrigir o código.

---

## 5. Bloco de inicialização estático
Crie uma classe chamada `BancoDeDados` com um bloco de inicialização estático que simula a conexão com um banco de dados (imprima uma mensagem indicando que a conexão foi feita). Mostre que esse bloco é executado apenas uma vez, independentemente de quantas instâncias forem criadas.

---

## 6. Compartilhamento de atributos `static`
Implemente uma classe `Jogador` com um atributo `static` chamado `quantidadeJogadores`. Crie múltiplas instâncias e demonstre que todas compartilham o mesmo valor desse atributo.

---

## 7. Ordem de execução de blocos estáticos
Crie uma classe com dois blocos de inicialização estáticos e um construtor. Mostre, via impressão, a ordem em que cada bloco e o construtor são executados.

---

## 8. Acesso a métodos/atributos `static`
Demonstre como acessar métodos e atributos `static` diretamente pela classe, sem a necessidade de criar objetos. Explique a diferença em relação ao acesso por instância.

---

## 9. Utilidade de métodos `static`
Explique e exemplifique situações em que métodos `static` são preferíveis, como funções utilitárias, validadores ou calculadoras.

---

## 10. Exercício de fixação
Crie uma classe chamada `ConversorTemperatura` com métodos `static` para converter Celsius para Fahrenheit e vice-versa. Implemente e utilize esses métodos em um programa principal.

---

> **Dica:** Sempre que possível, teste seus códigos para entender o comportamento dos membros `static`!
