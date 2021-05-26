package Model.listas;

import Model.entidades.Paciente;
import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pacientes implements Iterable<Paciente> {
    public void save() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("TODO");
    }

    private final List<Paciente> listaPacientes = new ArrayList<Paciente>();

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void addPacienteLista(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    @Override
    public Iterator<Paciente> iterator() {
        return new Iterator<Paciente>() {
            private final Iterator<Paciente> iter = listaPacientes.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public Paciente next() {
                return iter.next();
            }
        };
    }
}
