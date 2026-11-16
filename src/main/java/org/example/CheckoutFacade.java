package org.example;

public class CheckoutFacade {

    public static boolean verificarPendenciasCompra(Cliente cliente) {
        if (ModuloEstoque.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ModuloPagamento.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (ModuloLogistica.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}