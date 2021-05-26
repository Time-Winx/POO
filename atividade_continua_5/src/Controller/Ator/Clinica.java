package Controller.Ator;

import Model.entidades.Paciente;
import Model.entidades.Quarto;
import Model.listas.Quartos;

public class Clinica extends User {
    public void adiciona_quarto(Quartos lista_quartos, Quarto quarto) {
        lista_quartos.addQuartos(quarto);
    }

    public void aloca_paciente(Paciente paciente, Quartos lista_quartos) {
        for (int i = 0; i <= lista_quartos.size(); i++) {
            Quarto quarto = lista_quartos.iterator().next();
            if (quarto.getQtdeHospedes() < quarto.getMaximo_hospedes()) {
                quarto.addHospedes(paciente);
                return;
            }
        }
    }
}
