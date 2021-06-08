package Model;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario func_1 = new Funcionario(
            "João",
            18,
            'M',
            1,
            1039.31
            );

    @org.junit.jupiter.api.Test
    void testa_atributos() {
        assertEquals("João", func_1.nome, "O nome deve ser joão");
        assertEquals('M', func_1.sexo, "O sexo deve ser M");
        assertEquals(1, func_1.matricula, "A matricula deve ser do tipo 1");
        assertEquals(1039.31, func_1.salario, "O salario deve ser de 1039.31");
    }

    @org.junit.jupiter.api.Test
    void valorinss() {
        assertEquals(1039.31 * 0.12, func_1.valorinss(), "O salario deve ser de " + func_1.valorinss());
    }
}