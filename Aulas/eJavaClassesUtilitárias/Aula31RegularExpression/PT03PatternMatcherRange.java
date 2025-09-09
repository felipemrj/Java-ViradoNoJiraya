package eJavaClassesUtilitárias.Aula31RegularExpression;

public class PT03PatternMatcherRange {
    /*
    O operador de RANGE em expressões regulares é definido pelos colchetes [ ], permitindo especificar conjuntos ou intervalos de caracteres que podem ocupar uma determinada posição no padrão buscado.

    Sintaxe básica:
    - [abc]: casa qualquer um dos caracteres 'a', 'b' ou 'c'.
    - [a-z]: casa qualquer letra minúscula do alfabeto (de 'a' até 'z').
    - [A-Z]: casa qualquer letra maiúscula do alfabeto (de 'A' até 'Z').
    - [0-9]: casa qualquer dígito de 0 a 9.
    - [a-zA-Z]: casa qualquer letra minúscula ou maiúscula.

    No exemplo acima:
    - O padrão "0[xX][0-9a-fA-F]" representa:
        - "0[xX]": casa "0x" ou "0X", comum na representação de números hexadecimais.
        - "[0-9a-fA-F]": casa qualquer dígito de 0 a 9 ou letra de 'a' a 'f' (minúscula ou maiúscula), formando parte de um número hexadecimal.

    Mais detalhes sobre a sintaxe:
    - É possível combinar ranges e caracteres específicos: [a-zA-C] casa letras entre 'a' e 'z' e as letras 'A', 'B', 'C'.
    - Para negar um conjunto, use o circunflexo (^) logo após o colchete: [^abc] casa qualquer caractere exceto 'a', 'b' ou 'c'.
    - Pode-se misturar ranges, caracteres individuais e metacaracteres dentro dos colchetes: [a-z0-9_] casa letras minúsculas, dígitos e o "_".

    Resumo:
    - O uso de ranges deixa as expressões regulares mais flexíveis e compactas para definir conjuntos de caracteres permitidos em cada posição.
    - Essencial para validação de padrões como nomes, senhas, números, formatos personalizados, etc.
    */
}
