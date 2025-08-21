package cJavaOrientaçãoObjetos.Aula23Interfaces.domain;

public class FileLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
