package cJavaOrientaçãoObjetos.Aula23Interfaces.domain;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;

    void load();
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
