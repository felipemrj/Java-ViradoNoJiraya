package eJavaClassesUtilitárias.Aula28Datas;

public class PT03DateFormat {
    /*
A classe DateFormat faz parte do pacote java.text e é utilizada para formatar e exibir datas e horas em diferentes estilos e padrões, de acordo com a localidade do sistema.

Principais características:
- DateFormat é uma classe abstrata que permite converter objetos Date (ou Calendar) em Strings formatadas, facilitando a apresentação, armazenamento ou leitura de datas.
- Também permite fazer o processo inverso: converter Strings em objetos Date (parsing).

Principais métodos e usos:
- DateFormat.getInstance(): Retorna um formato padrão de data e hora para a localidade atual.
- DateFormat.getDateInstance(): Retorna um formato padrão de apenas data.
- DateFormat.getDateTimeInstance(): Retorna um formato padrão de data e hora.
- DateFormat.getDateInstance(int style): Permite escolher o estilo de apresentação da data, podendo ser:
    - DateFormat.SHORT: Formato curto (ex: 02/09/25)
    - DateFormat.MEDIUM: Formato médio (ex: 02/09/2025)
    - DateFormat.LONG: Formato longo (ex: 2 de setembro de 2025)
    - DateFormat.FULL: Formato completo, incluindo dia da semana (ex: terça-feira, 2 de setembro de 2025)

Uso típico:
- Após criar o objeto DateFormat com o estilo desejado, basta chamar o método .format(Date) para obter uma String formatada a partir de um objeto Date (ou Calendar).
    Exemplo: dateFormat.format(calendar.getTime());

Observações importantes:
- O padrão de formatação depende da localidade (ex: Brasil, EUA, etc.), podendo variar o idioma, separador e ordem dos campos.
- Para manipulações mais avançadas de datas e horários, recomenda-se usar a classe SimpleDateFormat (java.text) ou as APIs modernas do pacote java.time (Java 8+).

Resumo:
- DateFormat facilita a apresentação de datas em diferentes estilos e formatos, tornando o código mais legível e internacionalizável.
- É útil para exibir datas ao usuário de acordo com o padrão cultural esperado.
- Para novos projetos e maior flexibilidade, prefira as classes do pacote java.time (DateTimeFormatter, LocalDate, etc.).
*/
}
