package cJavaOrientaçãoObjetos.Aula24Polimorfismo;

public class PT04PolimorfismoCastInstanceOf {
    /*
    Na classe CalculadoraImposto, o trecho selecionado utiliza o operador instanceof para verificar
     se o objeto referenciado por produto é, de fato, uma instância da classe Tomate.
     Se a verificação for verdadeira, ocorre o narrowing cast, ou seja, o objeto de referência genérica (Produto)
     é convertido explicitamente para o tipo mais específico (Tomate).
     Isso permite acessar métodos exclusivos da subclasse, como getDataValidade.

    O narrowing cast é necessário porque nem tod.o objeto do tipo Produto possui os métodos definidos em Tomate.
    O uso de instanceof garante segurança na conversão, evitando erros em tempo de execução.

    Exemplo do processo:


    Verifica se produto é um Tomate (produto instanceof Tomate)
    Realiza o cast: Tomate tomate = (Tomate) produto
    Acessa métodos específicos de Tomate, como getDataValidade
    Esse padrão é comum quando se trabalha com polimorfismo e há necessidade
    de acessar funcionalidades específicas de subclasses.
     */
}
