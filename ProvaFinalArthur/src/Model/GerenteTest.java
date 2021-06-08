package Model;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    Gerente gerente_1 = new Gerente(
            "José",
            33,
            'M',
            1,
            1039.31 * 3,
            "Logistica"
    );

    @org.junit.jupiter.api.Test
    void testa_atributos() {
    }

}