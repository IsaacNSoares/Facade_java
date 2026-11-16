package org.example;

public class Cliente {

    public boolean finalizarCompra() {
        return CheckoutFacade.verificarPendenciasCompra(this);
    }
}