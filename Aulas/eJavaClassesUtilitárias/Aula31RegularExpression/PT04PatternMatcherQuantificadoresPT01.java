package eJavaClassesUtilitárias.Aula31RegularExpression;

public class PT04PatternMatcherQuantificadoresPT01 {
    /*
    Os **quantificadores** em expressões regulares (regex) são metacaracteres que definem **quantas vezes** um elemento ou grupo pode aparecer em uma posição do padrão.

    Principais quantificadores:

    - `?`  : Zero ou uma ocorrência do elemento anterior.
        - Ex.: `a?` casa "" ou "a".
    - `*`  : Zero ou mais ocorrências do elemento anterior.
        - Ex.: `a*` casa "", "a", "aa", "aaa", etc.
    - `+`  : Uma ou mais ocorrências do elemento anterior.
        - Ex.: `a+` casa "a", "aa", "aaa", etc. (não casa "")
    - `{n,m}` : De n até m ocorrências do elemento anterior.
        - Ex.: `a{2,4}` casa "aa", "aaa" ou "aaaa".
        - Ex.: `a{3,}` casa 3 ou mais "a".
        - Ex.: `a{2}` casa exatamente duas ocorrências de "a".

    Outros metacaracteres importantes:
    - `()` : Agrupamento, para aplicar quantificadores em sequências ou grupos.
        - Ex.: `(ab)+` casa "ab", "abab", etc.
    - `|`  : Alternância, representa "ou".
        - Ex.: `o(v|c)o` casa "ovo" ou "oco".
    - `$`  : Representa o fim da linha.
        - Ex.: `abc$` casa "abc" somente se estiver no fim da linha.

    No exemplo acima:
    - O regex `0[xX]([0-9a-fA-F])+(\s|$)` casa sequências de números hexadecimais:
        - `0[xX]` — obrigatoriamente começa com "0x" ou "0X".
        - `([0-9a-fA-F])+` — pelo menos um caractere hexadecimal.
        - `(\s|$)` — termina com espaço ou fim de linha.

    Resumo:
    - Os quantificadores dão poder e flexibilidade às regex, permitindo buscar padrões de tamanho variável ou validar formatos complexos.
    - São essenciais para validação, extração e manipulação de dados textuais.
    */
}
