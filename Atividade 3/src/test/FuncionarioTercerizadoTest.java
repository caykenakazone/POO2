package test;

import funcionarios.FuncionarioTerceirizado;
import funcionarios.FuncionarioProprio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionarioTercerizadoTest {

    @Test
    public void testCalcularPagamento() {
        FuncionarioTerceirizado funcionarioTerceirizado = new FuncionarioTerceirizado();
        funcionarioTerceirizado.setHorasTrabalhadas(10);
        funcionarioTerceirizado.setValorPorHora(50);
        funcionarioTerceirizado.setDespesaAdicional(100);
        double resultado = funcionarioTerceirizado.calcularPagamento();
        assertEquals(660, resultado, 0.001);
    }
}
