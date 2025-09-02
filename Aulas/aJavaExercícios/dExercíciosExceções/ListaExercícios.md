# Exercícios de Tratamento de Exceções em Java

## 1. Exercício: Captura de Exceção Básica
Crie um programa que recebe dois números do usuário e realiza a divisão do primeiro pelo segundo.
- Faça o tratamento para evitar a divisão por zero usando try/catch.
- Caso ocorra uma exceção, apresente uma mensagem amigável ao usuário.

## 2. Exercício: Tratamento de Múltiplas Exceções
Escreva um método que recebe um array de inteiros e um índice.
- Tente acessar o elemento nesse índice.
- Trate possíveis exceções:
    - `ArrayIndexOutOfBoundsException` (índice inválido)
    - `NullPointerException` (se o array for nulo)

## 3. Exercício: Uso do bloco finally
Crie um programa que simula uma operação matemática (exemplo: divisão).
- Utilize try/catch para tratar possíveis exceções.
- Use o bloco finally para exibir uma mensagem informando que a operação terminou (independente de sucesso ou erro).

## 4. Exercício: Try-with-resources
Simule o uso de try-with-resources com uma classe que implementa `AutoCloseable` chamada `RecursoSimulado`.
- No método principal, abra e feche o recurso usando try-with-resources.
- No método `close()`, exiba uma mensagem informando que o recurso foi fechado.

## 5. Exercício: Lançando exceção unchecked
Implemente um método que recebe a idade de uma pessoa e lança `IllegalArgumentException` caso a idade seja negativa.
- Documente o método indicando que ele pode lançar essa exceção.

## 6. Exercício: Lançando exceção checked 
Crie uma exceção customizada chamada `ValorZeroException` (checked).
- Implemente um método que recebe um número inteiro e lança essa exceção caso o valor seja zero.
- Faça o tratamento dessa exceção no método que chama a verificação.

## 7. Exercício: Multi-catch
Implemente um código que pode lançar tanto `ArrayIndexOutOfBoundsException` quanto `ArithmeticException`.
- Use um único bloco catch para tratar ambas exceções.

## 8. Exercício: Exceção customizada para domínio
Implemente uma exceção customizada chamada `IdadeInvalidaException` (unchecked).
- Crie um método que valida a idade do usuário e lança essa exceção se a idade não cumprir requisitos mínimos (ex: menor que 18 ou maior que 120).
- Trate essa exceção informando ao usuário como inserir uma idade válida.
