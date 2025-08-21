package cJavaOrientaçãoObjetos.Aula23Interfaces.test;

import cJavaOrientaçãoObjetos.Aula23Interfaces.domain.DataLoader;
import cJavaOrientaçãoObjetos.Aula23Interfaces.domain.DatabaseLoader;
import cJavaOrientaçãoObjetos.Aula23Interfaces.domain.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader dbloader = new DatabaseLoader();
        FileLoader floader = new FileLoader();

        dbloader.load();
        floader.load();

        dbloader.remove();
        floader.remove();

        dbloader.checkPermission();
        floader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
