package dJavaExceções;

public class PT07ExceçõesMúltiplasExceções {
    /*
    Podemos capturar múltiplas exceções dentro de um mesmo bloco try utilizando vários blocos catch.
    É importante ordenar os blocos catch começando pelas exceções mais específicas e deixando as mais genéricas por último.
    Isso garante que cada tipo de erro seja tratado corretamente e evita que exceções mais gerais capturem exceções específicas antes delas.

    Exemplo:
    try {
        // código que pode lançar diferentes tipos de exceção
    } catch (IOException e) {
        // Tratamento para erros de entrada/saída (mais específico)
    } catch (Exception e) {
        // Tratamento para outros tipos de exceção (mais geral)
    }

    Se colocarmos um catch para uma exceção geral antes das específicas, os catch seguintes nunca serão executados,
    já que o catch geral "captura" todas as exceções compatíveis antes.
     */
}
