package cJavaOrientaçãoObjetos.Aula16ModificadorStatic;

public class PT01ModificadorStatic {
    // Ao atribuir o modificador static a um atributo, esse atributo pertencerá à classe e não só a um objeto, e todos objetos
    // compartilharão do mesmo valor. Então ao modificar atributos statics, modificaremos para todos os objetos
    // Para utilizarmos métodos/atributos static, não precisamos necessariamente instanciar um objeto

    /* O modificador static em Java é utilizado para indicar que um atributo ou método pertence à classe, e não a uma instância específica.
    Isso significa que o valor de um atributo static é compartilhado entre todos os objetos daquela classe, e métodos static podem ser
    chamados sem precisar criar um objeto. O uso de static é útil para criar variáveis globais, contadores, ou funções utilitárias.
    Além disso, membros static são acessados diretamente pela classe, o que facilita o acesso e evita duplicação de dados entre instâncias.
    Vale lembrar que métodos static não podem acessar diretamente atributos ou métodos não-static, pois não têm referência a um objeto específico. */
}
