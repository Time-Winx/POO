package Model;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, int idade, char sexo, int matricula, double salario) {
        super(nome, idade, sexo, matricula, salario);
    }

    @Override
    public double valorinss() {
        return this.salario * 0.10;
    }

}
