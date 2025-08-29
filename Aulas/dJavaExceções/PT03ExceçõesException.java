package dJavaExceções;

public class PT03ExceçõesException {
    /*
    Para fazermos o tratamento das exceções utilizamos o "try e catch"
    Dentro do bloco try irá o código a ser executado que pode causar a exceção
    e dentro do bloco catch o que o programa vai executar em caso de exceção.
    No catch temos que especificar qual exceção estamos tratando especificamente para sabermos
    o que aconteceu invés de usar uma exceção geral como "Exception" porque dessa forma
    não saberíamos exatamente o que causou o problema.

    Quando ocorrer um erro dentro do bloco try, ele irá pular da linha onde ocorreu diretamente
    para o bloco catch.

    O bloco catch nunca pode ser deixado em branco ignorando a exceção. Sempre deixar claro o que
    aconteceu. Uma forma é utilzando o métod.o printStackTrace, esse métod.o imprime tudo o que aconteceu
    na stack para identificarmos, mas o programa não vai simplesmente parar de funcionar.
    Observação: Não colocar lógica de negócio dentro do bloco catch, o catch é simplesmente para lidar
    com exceções.
     */
}
