# Exercícios de Prática: Polimorfismo em Java (Sem Coleções)

---

## 1. Polimorfismo de Referência

Crie uma classe abstrata chamada `Animal` com os métodos `fazerSom()` e `getNome()`.  
Crie as classes `Cachorro` e `Gato` que estendem `Animal` e implementam seus métodos de forma diferente.  
No método principal (`main`), declare uma variável de referência do tipo `Animal` e faça ela apontar para objetos de `Cachorro` e `Gato`, imprimindo os sons e nomes.

---

## 2. Parâmetros Polimórficos

Implemente uma classe chamada `ImpressoraAnimal` com um método `imprimirSom(Animal animal)`, que recebe qualquer objeto do tipo `Animal` e chama o método `fazerSom()`.  
No método principal, crie um objeto do tipo `Cachorro` e um do tipo `Gato` e use o método da impressora para cada um.

---

## 3. Cast e Instanceof

Adicione à classe `Gato` um método chamado `arranhar()`, exclusivo dessa subclasse.  
No método principal, declare uma variável do tipo `Animal` que aponta para um objeto do tipo `Gato`.  
Usando `instanceof`, verifique se o objeto é um `Gato`. Se for, faça o cast para `Gato` e chame o método `arranhar()`.

---

## 4. Polimorfismo com Interface

Crie uma interface chamada `Salvavel` com o método `salvar()`.  
Implemente essa interface em duas classes: `RepositorioArquivo` e `RepositorioBancoDeDados`.  
No método principal, declare uma variável do tipo `Salvavel` e faça ela apontar para um objeto de cada tipo, chamando o método `salvar()`.

---

## 5. Polimorfismo em Hierarquia de Produto

Utilizando o exemplo do domínio `Produto`, declare variáveis do tipo `Produto` que apontam para objetos de `Computador`, `Televisao` e `Tomate`.  
Para cada variável, chame o método `calcularImposto()` e observe diferentes implementações sendo executadas.

---

**Dica:**  
Sempre tente acessar métodos declarados apenas na superclasse ou interface através da referência polimórfica.  
Para acessar métodos específicos da subclasse, utilize o `instanceof` seguido do cast.

---