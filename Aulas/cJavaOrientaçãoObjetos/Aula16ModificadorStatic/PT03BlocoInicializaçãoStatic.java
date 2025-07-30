package cJavaOrientaçãoObjetos.Aula16ModificadorStatic;

public class PT03BlocoInicializaçãoStatic {
    /* Blocos de inicialização estáticos são definidos com o modificador static e são executados uma única vez, quando a classe é carregada pela JVM, antes de qualquer instância ser criada ou qualquer membro estático ser acessado.
    Eles são úteis para inicializar variáveis estáticas, carregar recursos compartilhados ou executar configurações que devem ocorrer apenas uma vez para toda a classe.
    Diferente dos blocos de inicialização comuns, que são executados a cada criação de objeto, o bloco estático garante que a lógica seja aplicada globalmente, evitando repetição e garantindo consistência.
    Se houver múltiplos blocos estáticos, eles serão executados na ordem em que aparecem no código. */
}
