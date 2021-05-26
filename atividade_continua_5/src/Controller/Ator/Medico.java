package Controller.Ator;

import Model.entidades.ItemHistorico;
import Model.entidades.Paciente;
import Model.listas.Historico;
import Model.listas.Pacientes;

import java.util.List;
import java.util.stream.Collectors;

public class Medico extends User {

    public String CRM;
    public List lista_pacientes;

    // TODO: Fazer overrite do metodo de cadastro de cliente

    public Medico(String crm) {
        this.CRM = crm;
    }

    public void relacionaPaciente(Paciente paciente) {
        paciente.setCRM_medico_responsavel(this.CRM);
        Pacientes lista_pacientes = new Pacientes();
    }

    /**
     * Retorna lista referente ao seu paciente especifico
     */
    public List getListaPacientes(Pacientes lista_pacientes) {
        this.lista_pacientes = lista_pacientes.stream().filter(el -> el.CRM_medico_responsavel == this.CRM).collect(Collectors.toList());
        return this.lista_pacientes;
    }

    public void addItemHistorico() {
        ItemHistorico itemHistorico = new ItemHistorico();
        Historico historico = new Historico();
        historico.addHistoricoLista(itemHistorico);
    }

    public List historicoPaciente(String cpf_paciente) {
        List lista_todos_pacientes = new Pacientes(); // TODO: Fazer novo contructor para recuperacao
        return lista_todos_pacientes.stream().filter(el -> el.CPF).collect(Collectors.toList());
    }
}
