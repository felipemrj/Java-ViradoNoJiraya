# Exercícios Avançados de Classes e Objetos em Java

Expanda as classes já criadas nos exercícios anteriores conforme os tópicos abaixo. Cada exercício é para uma das suas classes existentes.

---

## 1. Pessoa (Retorno simples e evitar else)
Implemente um método na classe `Pessoa` chamado `maiorDeIdade()` que retorna `true` se a idade for maior ou igual a 18 e `false` caso contrário. No método, use `return` imediatamente para evitar o uso de `else`.

---

## 2. Livro (Retorno em método void)
Na classe `Livro`, crie um método void chamado `imprimirResumo()`. O método deve imprimir "Livro inválido" e retornar imediatamente se o título estiver vazio ou nulo. Caso contrário, imprima o título, autor e ano de publicação.

---

## 3. Carro (Parâmetro primitivo)
Adicione à classe `Carro` um método `atualizarAno(int novoAno)` que recebe o novo ano e atualiza o atributo ano apenas se o valor recebido for maior que o ano atual. Retorne `true` se a alteração foi realizada, e `false` caso contrário.

---

## 4. Pessoa (Comparação por referência)
Crie um método estático na classe `Pessoa` chamado `mesmaReferencia(Pessoa p1, Pessoa p2)` que retorna `true` se ambas as referências apontam para o mesmo objeto usando o operador `==`.

---

## 5. Calculadora (Varargs e uso de this)
Adicione à classe `Calculadora` um método chamado `somarTudo(int... valores)` que retorna a soma de todos os valores recebidos. Utilize `this` para acessar qualquer atributo se necessário (por exemplo, se a calculadora tiver um histórico de soma).

---

## 6. Mensagem (Retorno em método void e parâmetro referência)
Implemente na classe `Mensagem` um método void chamado `exibirMensagemComPrefixo(String prefixo, String nome)`. Se o nome for nulo ou vazio, retorne imediatamente. Caso contrário, imprima a mensagem no formato: "[prefixo] Olá, nome!".

---

## 7. ContaBancaria (Retorno e this)
Crie na classe `ContaBancaria` um método chamado `sacar(double valor)` que retorna `boolean`. Use `this` para acessar o saldo. Se não houver saldo suficiente, retorne `false` imediatamente. Caso contrário, subtraia o valor e retorne `true`.

---

## 8. Produto (Parâmetro primitivo e método de retorno)
Implemente na classe `Produto` um método `calcularTotal()` que retorna o valor total do produto (preço * quantidade).

---

## 9. Animal (Void, break com return)
Na classe `Animal`, crie um método void chamado `emitirSom(String especie)`. Se a espécie for "cachorro", imprima "Au Au" e retorne imediatamente. Se for "gato", imprima "Miau" e retorne. Para qualquer outra espécie, imprima "Som desconhecido".

---

## 10. Filme (Retorno String, parâmetro referência)
Na classe `Filme`, crie um método `compararAno(Filme outro)` que retorna uma String dizendo qual dos dois filmes foi lançado primeiro.

---

## 11. Caneta (Void, referência this)
Na classe `Caneta`, adicione um método void `trocarCor(String novaCor)` que altera a cor da caneta usando `this.cor = novaCor` e imprime a nova cor.

---

## 12. Computador (Retorno e parâmetro primitivo)
Implemente na classe `Computador` um método `estaAtualizado(int anoAtual)` que retorna `true` se o computador foi fabricado há no máximo 3 anos.

---

## 13. ContaSimples (Varargs)
Na classe `ContaSimples`, crie um método `depositosMultiplos(double... valores)` que soma todos os valores recebidos ao saldo.

---

## 14. Professor (Retorno com break/return)
Na classe `Professor`, crie um método que recebe uma String disciplina e retorna true se for igual à do professor, usando return para evitar else.

---

## 15. Cidade (Parâmetro referência)
Na classe `Cidade`, crie um método `compararPopulacao(Cidade outra)` que retorna a cidade com maior população.

---

## 16. ProdutoSimples (Retorno void e primitivo)
Implemente na classe `ProdutoSimples` um método void `aplicarDescontoSeAlto(double limite, double percentual)`. Se o preço for maior que o limite, aplique o desconto. Senão, retorne imediatamente.

---

## 17. LivroReferencias (Método estático, referência)
Na classe `Livro`, crie um método estático `mesmoLivro(Livro l1, Livro l2)` que retorna true se ambos os livros têm o mesmo título e autor (comparando valores, não referências).

---

## 18. Aluno (Varargs, método que retorna)
Na classe `Aluno`, crie um método estático `mediaNotas(double... notas)` que retorna a média das notas recebidas.

---

## 19. Computador (Retorno void, referência this)
Na classe `Computador`, adicione um método void `atualizarModelo(String novoModelo)`. Se o novo modelo for igual ao atual, apenas retorne. Caso contrário, atualize o modelo usando `this.modelo`.

---

## 20. Contato (Retorno String, parâmetro referência)
Na classe `Contato`, crie um método `compararNome(Contato outro)` que retorna uma String dizendo se os nomes são iguais ou diferentes.

---