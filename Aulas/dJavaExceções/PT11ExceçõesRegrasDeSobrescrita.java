package dJavaExceções;

public class PT11ExceçõesRegrasDeSobrescrita {
    /*
    Ao sobrescrever um método (override), não é obrigatório declarar as mesmas exceções que o método original.
    Você pode optar por declarar nenhuma, algumas ou todas as exceções checked que o método da superclasse declara.

    Regras importantes:
    - É permitido adicionar exceções unchecked (subclasses de RuntimeException), mesmo que elas não estejam na declaração original do método.
    - Não é permitido declarar exceções checked mais genéricas ou novas que não foram declaradas no método original da superclasse.
      Isso garante que o contrato do método sobrescrito não seja mais restritivo do que o contrato original.

    Exemplo:
    Se o método da superclasse declara "throws IOException", o método sobrescrito pode:
    - Declarar "throws IOException"
    - Declarar uma subclasse de IOException (por exemplo, "throws FileNotFoundException")
    - Não declarar exceção nenhuma
    - Adicionar exceções unchecked (como "throws IllegalArgumentException")

    Nunca pode:
    - Declarar "throws Exception" ou outra checked mais genérica
    - Declarar uma checked diferente não presente na superclasse

    Essas regras existem para garantir a compatibilidade do código e evitar que o método sobrescrito force o tratamento de exceções
    inesperadas no código cliente.
     */
}
