package Controller.Ator;

import Model.entidades.Paciente;
import Model.listas.Pacientes;

public class User {
    public void CadastrarPaciente() {
        Paciente paciente = new Paciente(); // TODO
        Pacientes lista_pacientes = new Pacientes();
        lista_pacientes.addPacienteLista(paciente);
    }
}
