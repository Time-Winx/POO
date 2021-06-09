package Model;

public class Funcionario {

    public String nome;
    public int idade;
    public char sexo;
    //    TODO: Projetar melhor o que é uma matricula
    public int matricula;
    public double salario;

    public Funcionario(String nome, int idade, char sexo, int matricula, double salario) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.matricula = matricula;
        this.salario = salario;
    }

    public double valorinss() {
        return this.salario * 0.12;
    }
}
