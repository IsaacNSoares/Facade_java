package org.example;

public class ModuloPagamento extends ModuloERP {

    private static ModuloPagamento pagamento = new ModuloPagamento();

    private ModuloPagamento() {};

    public static ModuloPagamento getInstancia() {
        return pagamento;
    }
}