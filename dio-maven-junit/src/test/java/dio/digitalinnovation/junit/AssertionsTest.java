package dio.digitalinnovation.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTest {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10,};
        int[] terceiroLancamento = {10, 20, 30, 40, 50};

        assertArrayEquals(primeiroLancamento, terceiroLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNull() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumeroDeTiposDiferentes () {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
