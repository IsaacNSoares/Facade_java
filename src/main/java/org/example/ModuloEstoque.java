package org.example;

public class ModuloEstoque extends ModuloERP {

    private static ModuloEstoque estoque = new ModuloEstoque();

    private ModuloEstoque() {};

    public static ModuloEstoque getInstancia() {
        return estoque;
    }
}