# Exercícios de Orientação a Objetos

Lista de 10 exercícios para praticar os seguintes conceitos:
- Criação de classe com atributos `private`
- Métodos getters e setters
- Construtores
- Sobrecarga de métodos e construtores

---

## 1. Classe `Pessoa` com atributos privados

Crie uma classe chamada `Pessoa` com os atributos privados `nome` (String) e `idade` (int). Implemente os métodos getters e setters para ambos os atributos.

---

## 2. Construtores na classe `Pessoa`

Implemente um construtor padrão (sem parâmetros) e um construtor que receba `nome` e `idade` como parâmetros na classe `Pessoa`.

---

## 3. Método para exibição de dados

Na classe `Pessoa`, crie um método chamado `exibirDados()` que imprima o nome e a idade da pessoa.

---

## 4. Sobrecarga de método em `Pessoa`

Implemente a sobrecarga do método `exibirDados()`, criando uma versão que recebe um parâmetro booleano chamado `mostrarIdade`. Se esse parâmetro for verdadeiro, exiba também a idade; caso contrário, exiba apenas o nome.

---

## 5. Classe `Carro` com atributos privados

Crie uma classe chamada `Carro` com os atributos privados `marca` (String), `modelo` (String) e `ano` (int). Implemente os métodos getters e setters para todos os atributos.

---

## 6. Sobrecarga de construtores em `Carro`

Implemente dois construtores na classe `Carro`: um que recebe apenas `marca` e `modelo`, e outro que recebe todos os atributos.

---

## 7. Sobrecarga de método em `Carro`

Na classe `Carro`, crie um método chamado `acelerar()` que apenas imprime “O carro está acelerando”. Sobrecargue esse método para receber um parâmetro int chamado `velocidade`, e imprima “O carro está acelerando para X km/h”.

---

## 8. Classe `Produto` com construtor parametrizado

Crie uma classe chamada `Produto` com os atributos privados `nome` (String) e `preco` (double). Implemente os métodos getters e setters e um construtor que inicializa ambos os atributos.

---

## 9. Sobrecarga de método em `Produto`

Na classe `Produto`, crie um método chamado `aplicarDesconto(double percentual)` que diminui o preço do produto de acordo com o percentual informado. Sobrecargue esse método para permitir também informar o valor do desconto diretamente.

---

## 10. Classe `Aluno` com métodos e construtores

Crie uma classe chamada `Aluno` com os atributos privados `nome` (String), `matricula` (String) e `nota` (double). Implemente os métodos getters e setters e construtores. Implemente um método chamado `verificarAprovacao()` que retorna se o aluno está aprovado (nota >= 7). Sobrecargue esse método para permitir definir o valor mínimo de aprovação.