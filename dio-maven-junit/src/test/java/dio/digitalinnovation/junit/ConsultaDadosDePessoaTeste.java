package dio.digitalinnovation.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultaDadosDePessoaTeste {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    @BeforeEach
    void removeDadosParaTeste() {
        BancoDeDados.removerDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 15, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}
