public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // Existem 8 tipos primitivos: byte, short, int, long, float, double, boolean, char
        // Convenção para nomeação de variáveis: iniciar com letra minúscula e para palavras compostas capitalizar as palavras subsequentes

        byte ageByte = 10;              // Size: 1 byte     | Range: -128 to 127           | Default value: 0
        short ageShort = 10;            // Size: 2 bytes    | Range: -32.768 to 32.767     | Default value: 0
        int ageInt = 10;                // Size: 4 bytes    | Range: -2.1E9 to 2.1E9       | Default value: 0
        long ageLong = 100000;          // Size: 8 bytes    | Range: -9.2E18 to 9.2E18     | Default value: 0
        float wageFloat = 2500;       // Size: 4 bytes    | Range: ±1.4E-45 to ±3.4E+38  | Default value: 0.0f
        double wageDouble = 2000;     // Size: 8 bytes    | Range: ±4.9E-324 to ±1.7E+308| Default value: 0.0d
        boolean trueBoolean = true;     // Size: 1 bit      | Range: true or false         | Default value: false
        boolean falseBoolean = false;
        char character = 'A';           // Size: 2 bytes    | Range: '\u0000' to '\uffff'  | Default value: \u0000
        char characterASCII = 65;
        char characterUnicode = '\u0041';

        /*
         Todos os tipos primitivos, com exceção do boolean, são númericos.
         Sua diferença é a quantidade de valor que o espaço em memória pode armazenar

         Antigamente o tipo de variável utilizado era de maior importância pela questão
         de que memória era um recurso mais limitado, atualmente isso deixou de ser tão relevante.
         */

        int ageIntCast = (int) 100000000000000L;
        long ageLongCast = (long) 155.23;
        float wageFloatCast = (float) 2500.0D;

        /*
        Casting em Java é o processo de conversão explícita de um tipo de dado para outro. Existem dois tipos principais de casting:

        1. Casting implícito (widening): ocorre quando um tipo menor é convertido automaticamente para um tipo maior,
        sem risco de perda de dados. Exemplo: `int` para `long`.

        2. Casting explícito (narrowing): ocorre quando um tipo maior é convertido para um tipo menor,
        podendo haver perda de dados ou precisão. É necessário informar o tipo desejado entre parênteses. Exemplo: `long` para `int`.

        Exemplo de casting explícito:

        long valorLong = 100000L;
        int valorInt = (int) valorLong; Pode perder dados se o valor for maior que o limite do int

        Ao fazer casting de tipos numéricos para `char`, o valor é convertido para o caractere correspondente ao código Unicode.
        Ao converter de `float` ou `double` para tipos inteiros, a parte decimal é descartada (truncada).
        Casting não é permitido entre tipos incompatíveis, como entre `boolean` e tipos numéricos.
         */

        // CTRL + D duplica a linha atual

        System.out.println(ageInt);
        System.out.println(trueBoolean);
        System.out.println(character);
        System.out.println(characterASCII); // char converte os valores da tabela ASCII ou Unicode
        System.out.println(characterUnicode);



    }
}
