import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class CCuentaTest {

    CCuenta cuenta1 = new CCuenta();

    @ParameterizedTest
    @CsvSource({"-10,1", "-3,2", "10,0"})
    @DisplayName("Caja blanca - Ingresar")
    void ingresar( double cantidad, int resultado) {
        assertEquals(resultado, cuenta1.ingresar(cantidad));
    }
}