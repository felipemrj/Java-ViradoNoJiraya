package dJavaExceções.Aula25Exceções;

public class PT08ExceçõesMultiCatchEmLinha {
    /*
    No Java, é possível capturar múltiplas exceções diferentes em um único bloco catch utilizando o operador "|".
    Exemplo:
    catch (IOException | SQLException e) {
        // tratamento para IOException ou SQLException
    }

    Porém, existe uma restrição importante: as exceções especificadas no multicatch não podem estar na mesma linha de herança.
    Ou seja, não é permitido capturar, por exemplo, "Exception" e "IOException" juntos no mesmo multicatch, pois IOException é filha de Exception.

    Se tentarmos isso, o compilador irá acusar erro, pois nesse caso a exceção mais genérica (por exemplo, Exception) já cobre a exceção mais específica (IOException).
    Essa restrição existe para evitar ambiguidade e garantir que o bloco catch trate apenas exceções que não tenham relação de herança entre si.

    Em resumo: no multicatch, as exceções devem ser classes independentes entre si, sem relação direta de herança.
     */
}
