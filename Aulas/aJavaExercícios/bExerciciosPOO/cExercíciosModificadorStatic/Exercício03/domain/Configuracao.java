package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício03.domain;

import cJavaOrientaçãoObjetos.Aula11Métodos.domain.Calculadora;

public class Configuracao {
    private static String versaoApp;
    private static String nomeEmpresa;

    public void imprime() {
        System.out.println(versaoApp);
        System.out.println(nomeEmpresa);
    }

    public static void setVersaoApp(String versaoApp) {
        Configuracao.versaoApp = versaoApp;
    }

    public static String getVersaoApp() {
        return Configuracao.versaoApp;
    }

    public static void setNomeEmpresa(String nomeEmpresa) {
        Configuracao.nomeEmpresa = nomeEmpresa;
    }

    public static String getNomeEmpresa() {
        return  Configuracao.nomeEmpresa;
    }
}
