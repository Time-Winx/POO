package Model;

public class Gerente extends Funcionario {

    public String setor;

    public Gerente(String nome, int idade, char sexo, int matricula, double salario, String setor) {
        super(nome, idade, sexo, matricula, salario);
        this.setor = setor;
    }
}
