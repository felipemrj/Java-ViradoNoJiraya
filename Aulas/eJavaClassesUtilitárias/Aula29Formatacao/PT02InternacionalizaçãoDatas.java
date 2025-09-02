package eJavaClassesUtilitárias.Aula29Formatacao;

public class PT02InternacionalizaçãoDatas {
    /*
    A classe Locale foi criada para facilitar a **internacionalização** (i18n) de aplicações Java, permitindo adaptar datas, moedas, números e textos conforme a preferência do usuário ou localização da JVM.

    Principais características:
    - Locale representa um conjunto de informações culturais: idioma, país e (opcionalmente) variante.
    - Permite formatar e exibir datas, números e moedas conforme os padrões do país/idioma escolhido.
    - Muito utilizada em conjunto com classes de formatação, como DateFormat, NumberFormat e ResourceBundle.

    Exemplo do código:
    - São criadas várias instâncias de Locale, cada uma representando um país/idioma diferente:
        Locale("it", "IT")     // Italiano - Itália
        Locale("it", "CH")     // Italiano - Suíça
        Locale("hi", "IN")     // Hindi - Índia
        Locale("ja", "JP")     // Japonês - Japão
        Locale("nl", "nl")     // Holandês - Holanda

    - O método DateFormat.getDateInstance(DateFormat.FULL, locale) retorna um formatador de datas no estilo "completo" para o Locale fornecido.
    - Ao formatar a data atual com diferentes locais, o resultado é exibido conforme o padrão de cada país/idioma.

    Métodos úteis de Locale:
    - getDisplayCountry(): Retorna o nome do país do Locale, no idioma padrão da JVM.
    - getDisplayCountry(Locale inLocale): Retorna o nome do país do Locale, no idioma do Locale passado como parâmetro.
      Exemplo: localeItaly.getDisplayCountry(localeJapao) retorna o nome "Itália" escrito em japonês.

    Outras aplicações importantes:
    - Locale é essencial para sistemas multilíngues, permitindo adaptar a interface e os dados ao usuário.
    - Pode ser utilizada para internacionalizar moedas (NumberFormat), textos (ResourceBundle) e outros tipos de dados.

    Observações sobre a criação de Locale:
    - Embora o construtor direto (new Locale(language, country)) ainda funcione, em versões recentes do Java recomenda-se o uso de métodos de fábrica, como Locale.forLanguageTag("pt-BR"), por serem mais seguros e compatíveis.

    Resumo:
    - Locale é fundamental para criar aplicações globalizadas, adaptando formatos e textos à cultura do usuário.
    - Facilita a formatação de datas, números, moedas e textos em diferentes padrões internacionais.
    - Prefira métodos de fábrica em novos projetos, mas compreenda o funcionamento dos construtores para manutenção de sistemas legados.
    */
}
