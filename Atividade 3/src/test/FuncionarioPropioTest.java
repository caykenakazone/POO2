package test;

import org.junit.Test;
import funcionarios.FuncionarioProprio;
import funcionarios.FuncionarioTerceirizado;

import static org.junit.Assert.assertEquals;

public class FuncionarioPropioTest {

    @Test
    public void testCalcularPagamento() {
        FuncionarioProprio funcionario = new FuncionarioProprio();
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorPorHora(50);
        double resultado = funcionario.calcularPagamento();
        assertEquals(500, resultado, 0.001);
    }
}
