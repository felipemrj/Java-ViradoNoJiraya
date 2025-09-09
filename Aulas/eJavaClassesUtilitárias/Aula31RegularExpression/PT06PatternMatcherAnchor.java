package eJavaClassesUtilitárias.Aula31RegularExpression;

public class PT06PatternMatcherAnchor {
    /*
    O metacaractere ^ em expressões regulares é chamado de **âncora de início de linha**.

    - Quando utilizado no início de um padrão regex, ele indica que a correspondência deve ocorrer **apenas no começo da linha ou texto**.
    - Exemplo: O padrão `^abc` casa apenas se "abc" estiver no início da linha.

    Aplicações:
    - Validação de formatos que devem obrigatoriamente começar de uma forma específica.
    - Usado junto com `$` (fim de linha) para validações exatas, como CPF, e-mail, datas, etc.

    Dica:
    - Ferramentas como [regexr.com](https://regexr.com/) ajudam a testar e visualizar o comportamento de âncoras e outros metacaracteres.

    Exemplo prático:
    - Regex: `^\\d{3}` casa exatamente três dígitos no início de uma linha.

    Resumo:
    - O **^** torna suas regex mais precisas, permitindo validar ou buscar padrões que devem obrigatoriamente começar o texto.
    */
}
