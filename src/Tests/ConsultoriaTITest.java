import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultoriaTITest {
    ConsultoriaTI consultoriaTI;

    @BeforeEach
    void setUp() throws Exception {
        consultoriaTI = new ConsultoriaTI(3);
    }

    @Test
    void calcularPreco() {
        assertEquals(3000.0, consultoriaTI.calcularPreco());
    }

    @Test
    void getDescricao() {
        assertEquals("Consultoria TI: Duração: 5 R$: 3000.0, Reuniões Extras: 0", consultoriaTI.getDescricao());
    }

    @Test
    void getDuracao() {
        assertEquals(5, consultoriaTI.getDuracao());
    }
}