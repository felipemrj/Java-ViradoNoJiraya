package eJavaClassesUtilitárias.Aula29Formatacao;

public class PT06DateTimeFormatter {
    /*
    A classe DateTimeFormatter faz parte do pacote java.time.format e permite formatar e converter datas e horários para Strings e vice-versa, de forma flexível e internacionalizada.

    Principais características:
    - Imutável (immutable) e thread-safe.
    - Usada para formatar (transformar LocalDate/LocalDateTime em String) e para converter/parsing (transformar String em LocalDate/LocalDateTime).
    - Oferece formatos padrão ISO, além de permitir formatos personalizados e suporte a internacionalização (Locale).

    Como utilizar:
    - Formatação:
        - date.format(DateTimeFormatter.BASIC_ISO_DATE): Formata a data no padrão ISO básico (ex: "20250903").
        - date.format(DateTimeFormatter.ISO_DATE): Formata no padrão ISO com hífen (ex: "2025-09-03").
        - date.format(DateTimeFormatter.ISO_LOCAL_DATE): Similar ao ISO_DATE, sem offset/fuso.
        - now.format(DateTimeFormatter.ISO_DATE_TIME): Formata LocalDateTime no padrão ISO com hora (ex: "2025-09-03T14:30:59.8321847").

    - Conversão (parsing):
        - LocalDate.parse("20250903", DateTimeFormatter.BASIC_ISO_DATE): Converte String para LocalDate usando o formato especificado.
        - LocalDate.parse("2025-09-03", DateTimeFormatter.ISO_DATE): Converte String para LocalDate usando formato ISO.
        - LocalDateTime.parse("2025-09-03T14:30:59.8321847", DateTimeFormatter.ISO_DATE_TIME): Converte String para LocalDateTime.

    - Formatos personalizados:
        - DateTimeFormatter.ofPattern("dd/MM/yyyy"): Formato brasileiro (ex: "03/09/2025").
        - DateTimeFormatter.ofPattern("MM/dd/yyyy"): Formato americano.
        - DateTimeFormatter.ofPattern("yyyy/MM/dd"): Formato japonês.
        - DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN): Formato alemão, com nome do mês em alemão.

    - Internacionalização:
        - Permite definir o Locale para que os meses/dias sejam exibidos no idioma correto. Exemplo: "September" em alemão vira "September" (com Locale.GERMAN).

    Resumo:
    - Use DateTimeFormatter para criar, exibir e converter datas/horas em diferentes formatos e idiomas.
    - Evite usar SimpleDateFormat nas aplicações modernas; prefira DateTimeFormatter por ser thread-safe e mais flexível.
    - Ideal para integração com sistemas externos, APIs, bancos de dados, relatórios e interfaces para usuários internacionais.
    */

}
