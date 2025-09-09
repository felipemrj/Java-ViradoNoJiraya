package eJavaClassesUtilitárias.Aula31RegularExpression;

public class PT05PatternMatcherQuantificadoresPT02 {
    /*
    Exemplo de busca e validação de e-mails usando expressões regulares (regex) no Java.

    Explicação do regex:
    - `([a-zA-Z0-9\\._-])+` : Usuário do e-mail, permite letras, números, ponto, underline e hífen (uma ou mais vezes).
    - `@` : Símbolo obrigatório de e-mail.
    - `([a-zA-Z])+` : Domínio, permite apenas letras (uma ou mais vezes).
    - `(\\.([a-zA-Z])+)+` : Um ou mais grupos de ponto seguido por letras (para ".com", ".br", ".com.br" etc).

    Conceitos usados:
    - Agrupamento: Parênteses para aplicar quantificadores a um grupo de caracteres.
    - Quantificadores: `+` (uma ou mais ocorrências).
    - Escape: `\\.` para literal do ponto.
    - Range: `[a-zA-Z0-9\\._-]` define caracteres válidos para o usuário.

    No código:
    - `matches(regex)`: verifica se a String "#@!zoro@mail.br" é um e-mail válido segundo o padrão (retorna `false` pois contém caracteres não permitidos).
    - `split(",")`: separa os e-mails por vírgula, e `.trim()` remove espaços.
    - O `Matcher` encontra todos os e-mails válidos no texto e imprime suas posições e valores.

    Resumo sobre regex de e-mail:
    - Expressões regulares podem validar e extrair e-mails de textos extensos.
    - Em sistemas reais, regex para e-mails podem ser mais complexas para cobrir todos os casos possíveis.
    - Regex é uma ferramenta poderosa para validação e busca de padrões textuais.
    */
}
