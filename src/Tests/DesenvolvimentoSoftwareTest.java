import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvimentoSoftwareTest {
    DesenvolvimentoSoftware software;

    @BeforeEach
    void setUp() throws Exception {
        software = new DesenvolvimentoSoftware("Médio");
    }

    @Test
    void calcularPreco() {
        assertEquals(10000.0, software.calcularPreco());
    }

    @Test
    void getDescricao() {
        assertEquals("Desenvolvimento de Software: Médio, Duração: 14, R$: 10000.0", software.getDescricao());
    }

    @Test
    void getDuracao() {
        assertEquals(14, software.getDuracao());
    }
}