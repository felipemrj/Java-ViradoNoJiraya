package eJavaClassesUtilitárias.Aula31RegularExpression;

public class PT02PatternMatcherMetaCaracteres {
        /*
    Metacaracteres são símbolos especiais usados em expressões regulares (regex) para representar conjuntos de caracteres, posições ou padrões em textos de forma compacta e flexível.

    Principais metacaracteres utilizados em Java (java.util.regex):

    - \d  : Representa qualquer dígito (equivalente a [0-9])
    - \D  : Representa qualquer caractere que NÃO seja dígito (equivalente a [^0-9])
    - \s  : Representa qualquer espaço em branco (espaço, tabulação \t, quebra de linha \n, form feed \f, retorno \r)
    - \S  : Representa qualquer caractere que NÃO seja espaço em branco
    - \w  : Representa letras (a-z, A-Z), dígitos (0-9) e o underline "_"
    - \W  : Representa qualquer caractere que NÃO seja incluso em \w

    Uso prático:
    - Facilitam buscas, validações e extrações em textos, como encontrar números, palavras, espaços, símbolos, etc.
    - No exemplo acima, o regex "\\D" encontra todas as posições e caracteres do texto que NÃO são dígitos.

    Resumo:
    - Os metacaracteres tornam expressões regulares poderosas e versáteis para manipulação e análise de textos.
    - São essenciais para validação de formatos (e-mail, CPF, datas), extração de padrões e buscas avançadas.
    - Para utilizar metacaracteres no Java, é necessário escapar a barra invertida (\\) nas strings.
    */
}
