import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuporteTecnicoTest {
    SuporteTecnico suporte;

    @BeforeEach
    void setUp() throws Exception {
        suporte = new SuporteTecnico(4);
    }

    @Test
    void calcularPreco() {
    assertEquals(4 * 100.00, suporte.calcularPreco());
    }

    @Test
    void getDescricao() {
        assertEquals("Suporte Técnico: 4 Horas, R$: 400.0", suporte.getDescricao());
    }

    @Test
    void getDuracao() {
        assertEquals(4, suporte.getDuracao());
    }
}