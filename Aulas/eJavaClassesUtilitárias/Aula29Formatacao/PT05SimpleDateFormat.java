package eJavaClassesUtilitárias.Aula29Formatacao;

public class PT05SimpleDateFormat {
    /*
    A classe SimpleDateFormat, do pacote java.text, é utilizada para realizar a formatação e o parsing (conversão de String para Date) de datas em Java de maneira mais flexível e personalizada do que DateFormat.

    Principais características:
    - Permite definir padrões de formatação customizados usando símbolos específicos para cada parte da data/hora.
    - Oferece maior controle sobre a aparência da data/hora, podendo incluir texto fixo, símbolos, abreviações, etc.

    Símbolos comuns de padrão:
    - y: ano (yyyy = 4 dígitos, yy = 2 dígitos)
    - M: mês (MM = numérico, MMM = abreviado, MMMM = nome completo)
    - d: dia do mês
    - G: era (ex: AD, BC)
    - H: hora no formato 24h
    - h: hora no formato 12h
    - m: minutos
    - s: segundos
    - z: fuso horário
    https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

    Uso de texto fixo:
    - Para incluir texto fixo no padrão (ex: 'at', 'de'), utilize aspas simples. O SimpleDateFormat ignora esse trecho e o inclui literalmente na saída.

    Exemplo do código:
    - O padrão "yyyy.MM.dd G 'at' HH:mm:ss z" gera uma string como "2025.09.02 AD at 16:36:42 GMT-3".
    - O padrão "'São Paulo' dd 'de' MMMM 'de' yyyy" gera uma string como "São Paulo 02 de setembro de 2025".

    Conversão de String para Date (parsing):
    - O método parse(String) do SimpleDateFormat permite converter uma String formatada de acordo com o padrão definido em um objeto Date.
    - Caso a String não corresponda exatamente ao padrão esperado, uma exceção ParseException será lançada.
    - No exemplo, sdf2.parse("São Paulo 02 de setembro de 2025") converte a String para um objeto Date, desde que siga o padrão definido em sdf2.
    - Parsing é útil para receber datas digitadas pelo usuário ou vindas de arquivos/textos, transformando-as em objetos Date para processamento no sistema.

    Observações importantes:
    - SimpleDateFormat não é thread-safe: evite compartilhamento entre múltiplas threads, ou crie uma nova instância para cada uso em ambientes concorrentes.
    - Para aplicações modernas (Java 8+), recomenda-se usar DateTimeFormatter (do pacote java.time), que é mais seguro e flexível.

    Resumo:
    - SimpleDateFormat é uma ótima ferramenta para personalizar a apresentação de datas e horas em Java.
    - Permite padrões ricos e adaptados ao contexto do usuário ou do sistema.
    - Prefira DateTimeFormatter em projetos novos, mas compreenda SimpleDateFormat para manutenção de sistemas legados.
    */
}
