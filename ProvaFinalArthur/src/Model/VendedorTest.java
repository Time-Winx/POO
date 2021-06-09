package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    double salario = 1039.31 * 2;

    Vendedor vendedor_1 = new Vendedor(
            "Maria",
            27,
            'M',
            2,
            salario
    );

    @Test
    void valorinss() {
        assertEquals(salario * 0.10, vendedor_1.valorinss(), "Salario incorreto");
    }
}