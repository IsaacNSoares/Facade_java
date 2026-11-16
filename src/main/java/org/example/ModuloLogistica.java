package org.example;

public class ModuloLogistica extends ModuloERP {

    private static ModuloLogistica logistica = new ModuloLogistica();

    private ModuloLogistica() {};

    public static ModuloLogistica getInstancia() {
        return logistica;
    }
}