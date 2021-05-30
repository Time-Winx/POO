package Controller.Ator;

import Model.entidades.Medico;
import Model.entidades.Paciente;
import Model.entidades.Quarto;

import java.util.List;

public class Clinica extends User {

    public String id;

    public Clinica(String id) {this.id = id;}

    public void adiciona_quarto(List<Quarto> lista_quartos, Quarto quarto) {
        lista_quartos.add(quarto);
    }

    public void aloca_paciente(Paciente paciente, List<Quarto> lista_quartos) {
        for (Quarto quarto : lista_quartos) {
            if (quarto.getQtdeHospedes() < quarto.getMaximo_hospedes()) {
                quarto.addHospedes(paciente);
                return;
            }
        }
    }

    public void cria_medico(Medico medico, List<Medico> lista_medicos) {
        lista_medicos.add(medico);
    }

    public void set_salario_medicos(Medico medico, float salario) {
        medico.setSalario(salario);
    }
}
