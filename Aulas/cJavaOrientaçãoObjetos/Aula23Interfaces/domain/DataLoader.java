package cJavaOrientaçãoObjetos.Aula23Interfaces.domain;

public interface DataLoader {
    void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
