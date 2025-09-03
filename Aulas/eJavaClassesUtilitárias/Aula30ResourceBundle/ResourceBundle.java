package eJavaClassesUtilitárias.Aula30ResourceBundle;

public class ResourceBundle {
    /*
    A classe ResourceBundle faz parte do pacote java.util e é utilizada para internacionalização (i18n), permitindo que aplicações Java forneçam mensagens, textos e recursos em diferentes idiomas e locais.

    Principais características:
    - Permite organizar textos e mensagens em arquivos separados por idioma, facilitando a tradução e adaptação para diferentes regiões.
    - Carrega automaticamente o arquivo de recursos mais adequado conforme o Locale especificado.
    - Utiliza arquivos de propriedades (ex: messages_en_US.properties, messages_pt_BR.properties) ou classes Java especializadas.

    Como utilizar:
    - ResourceBundle.getBundle("messages", new Locale("pt", "BR")): Carrega o arquivo de recursos para o idioma português do Brasil.
    - bundle.getString("chave"): Busca o valor correspondente à chave no arquivo de propriedades para o Locale especificado.
    - O mecanismo de fallback busca o arquivo mais próximo disponível caso o exato Locale não exista:
        - Exemplo: Para Locale("fr", "CA"), a busca será:
            1. messages_fr_CA.properties
            2. messages_fr.properties
            3. messages_en_US.properties
            4. messages_en.properties
            5. messages.properties (default)
    - É importante garantir que todas as chaves utilizadas existam nos arquivos, para evitar exceções (MissingResourceException).

    Resumo:
    - Use ResourceBundle para facilitar a internacionalização e localização de aplicações Java.
    - Organize seus textos e mensagens em arquivos separados por idioma e região.
    - Preste atenção ao mecanismo de fallback e à existência das chaves em todos os arquivos.
    */
}
