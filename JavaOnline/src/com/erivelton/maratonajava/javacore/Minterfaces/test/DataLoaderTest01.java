package com.erivelton.maratonajava.javacore.Minterfaces.test;

import com.erivelton.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import com.erivelton.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

    }
}
