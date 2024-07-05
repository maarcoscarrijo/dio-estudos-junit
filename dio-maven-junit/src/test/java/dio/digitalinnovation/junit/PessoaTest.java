package dio.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa joao = new Pessoa("Joãozinho", LocalDateTime.of(2020, 1, 1, 15, 10));
        Assertions.assertFalse(joao.ehMaiorDeIdade());

        Pessoa marta = new Pessoa("Marta", LocalDateTime.of(1995, 1, 1, 15, 1));
        Assertions.assertTrue(marta.ehMaiorDeIdade());

        List<Pessoa> pessoas = List.of(new Pessoa("Julia", LocalDateTime.now()), new Pessoa("Maria", LocalDateTime.now()));

        Assertions.assertAll("pessoas",
                () -> Assertions.assertFalse(pessoas.get(0).ehMaiorDeIdade()),
                () -> Assertions.assertFalse(pessoas.get(1).ehMaiorDeIdade())
        );
    }

    @Test
    @Disabled("Teste ainda não implementado")
    void deveRetornarIdade() {

    }
}
