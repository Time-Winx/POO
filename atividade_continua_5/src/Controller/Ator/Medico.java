package Controller.Ator;

import Model.entidades.ItemHistorico;
import Model.entidades.Paciente;
import Model.listas.Formacoes;
import Model.listas.Medicos;
import Model.listas.Pacientes;

import java.util.List;

public class Medico extends User {

    public String CRM;
    public List<Paciente> lista_pacientes;

    public Medico(String crm) {
        this.CRM = crm;
    }

    public void relacionaPaciente(Paciente paciente, List<Paciente> lista_pacientes) {
        paciente.setCRM_medico_responsavel(this.CRM);
    }

    /**
     * Retorna lista referente ao seu paciente especifico
     */
    public List<Paciente> getListaPacientes(List<Paciente> lista_pacientes) {
        for(Paciente paciente: lista_pacientes) {
            if (paciente.CRM_medico_responsavel == this.CRM) {
                lista_pacientes.add(paciente);
            }
        };
        this.lista_pacientes = lista_pacientes;
        return this.lista_pacientes;
    }

    public void addItemHistorico(List<ItemHistorico> Historico, String observacoes, int avaliacao_paciente,
                                 String id_quarto, String paciente_cpf, String medico_crm) {
        ItemHistorico itemHistorico = new ItemHistorico(
                observacoes, avaliacao_paciente, id_quarto, paciente_cpf, medico_crm
        );
        Historico.add(itemHistorico);
    }

    public List<Paciente> historicoPaciente(String cpf_paciente, List<Paciente> lista_paciente) {
        for(Paciente paciente: lista_paciente) {
            if (paciente.getCPF() == cpf_paciente)
                lista_paciente.add(paciente);
        }
        return lista_paciente;
    }

    public void selecionaFormacao(String formacao, List<String> lista_formacoes, List<Model.entidades.Medico> lista_medicos) {
        for (Model.entidades.Medico medico: lista_medicos) {
            if (this.CRM.equals(medico.getCRM())) {
                for (String tipo_formacao: lista_formacoes) {
                    if(tipo_formacao.equals(formacao)) {
                        medico.setFormacoes(formacao);
                    }
                }
            }
        }
    }
}
