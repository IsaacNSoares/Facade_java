package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaEstoqueCompra() {
        Cliente cliente = new Cliente();
        ModuloEstoque.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarPendenciaLogisticaCompra() {
        Cliente cliente = new Cliente();
        ModuloLogistica.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarPendenciaPagamentoCompra() {
        Cliente cliente = new Cliente();
        ModuloPagamento.getInstancia().addClienteComPendencia(cliente);

        assertEquals(false, cliente.finalizarCompra());
    }

    @Test
    void deveRetornarClienteSemPendenciaCompra() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.finalizarCompra());
    }

}