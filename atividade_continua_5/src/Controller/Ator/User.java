package Controller.Ator;

import Model.entidades.Paciente;
import Model.listas.Formacoes;
import utilitarios.Endereco;

import java.util.Date;
import java.util.List;

public class User {
    public void CadastrarPaciente(List<Paciente> lista_pacientes, String nome, String rg, String cpf, Endereco endereco, String telefone, Date nascimento) {
        Paciente paciente = new Paciente(nome, rg, cpf, endereco, telefone, nascimento);
        lista_pacientes.add(paciente);
    }

    public void adicionarFormcao(Formacoes lista_formacoes, String formacao) {
        lista_formacoes.addFormacaoLista(formacao);
    }
}
