package dio.digitalinnovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTest {

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    @EnabledOnOs({OS.MAC, OS.LINUX})
    @DisabledIfEnvironmentVariable(named = "USER", matches = "UsuarioX")
    void validarAlgoSomenteNoUserMarcos() {
        Assertions.assertEquals(10, 5+5);
    }
}
