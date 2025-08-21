package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício02.domain.Usuario;

public class UsuarioTest01 {
    public static void main(String[] args) {
        Usuario u = new Usuario();

        u.registrar(3);
        System.out.println(u.getId());
    }
}
