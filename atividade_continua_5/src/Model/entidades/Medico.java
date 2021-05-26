package Model.entidades;

import java.util.LinkedList;

public class Medico {

    protected String CRM;
    protected String CPF;
    protected String Nome;
    protected String Telefone;
    public float Salario;
    public LinkedList Formacoes;
    public String Formacao_atual;

    public Medico(String CRM, String CPF, String Nome, String Telefone) {
        // TODO: Validar dados
        this.CRM = CRM;
        this.CPF = CPF;
        this.Nome = Nome;
        this.Telefone = Telefone;
    }

    public void setSalario(float salario) {
        Salario = salario;
    }

    public void setFormacoes(LinkedList formacoes) {
        Formacoes = formacoes;
    }

}
