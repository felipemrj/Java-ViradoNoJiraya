package dJavaExceções;

public class PT10ExceçõesCustomizadas {
    /*
    Exceções customizadas (personalizadas) são criadas para representar situações específicas do seu domínio, tornando o
    tratamento de erros mais claro e organizado.

    Como criar:
    - Crie uma nova classe que representa a exceção. Por convenção, o nome da classe termina com "Exception".
    - Escolha se ela será uma exceção checked (herdando de Exception) ou unchecked (herdando de RuntimeException).
      - Checked: obriga o tratamento (try/catch ou throws na assinatura).
      - Unchecked: tratamento opcional, usada para erros de programação.

    Exemplo de exceção customizada checked:
    public class LoginInvalidoException extends Exception {
        public LoginInvalidoException() {
            super("Login inválido");
        }
        public LoginInvalidoException(String message) {
            super(message);
        }
    }

    Principais pontos:
    - Você pode criar construtores personalizados para passar mensagens específicas ou outras informações para a exceção.
    - É possível adicionar atributos e métodos na sua exceção para fornecer mais contexto sobre o erro (embora geralmente não seja necessário).
    - Use exceções customizadas para melhorar a legibilidade do código e facilitar o tratamento de casos específicos
     (por exemplo, "LoginInvalidoException" para erro de autenticação).

    Como lançar:
    - Use a palavra-chave "throw" para lançar a exceção customizada quando uma condição específica ocorrer.
    Exemplo:
    if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
        throw new LoginInvalidoException("Usuário ou senha inválidos");
    }

    Como tratar:
    - Trate a exceção customizada normalmente com try/catch.
    Exemplo:
    try {
        logar();
    } catch (LoginInvalidoException e) {
        e.printStackTrace();
    }

    Por que usar exceções customizadas?
    - Tornam o código mais expressivo e fácil de entender.
    - Facilitam o tratamento de erros específicos, evitando o uso de mensagens genéricas.
    - Melhoram a manutenção e a organização do código, pois cada exceção representa um cenário de erro bem definido.
     */
}
