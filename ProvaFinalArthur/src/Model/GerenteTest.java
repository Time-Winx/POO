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
        assertEquals("José", gerente_1.nome, "O nome deve ser José");
        assertEquals('M', gerente_1.sexo, "O sexo deve ser M");
        assertEquals(1, gerente_1.matricula, "A matricula deve ser do tipo 1");
        assertEquals(1039.31 * 3, gerente_1.salario, "O salario deve ser de " + 1039.31 * 3);
        assertEquals("Logistica", gerente_1.setor, "A matricula deve ser do tipo 1");
    }

}