package Listas;

import entidades.Medico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicos implements Iterable<Medico> {
    private final List<Medico> listaMedicos = new ArrayList<Medico>();

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void addMedicoLista(Medico medico) {
        listaMedicos.add(medico);
    }

    @Override
    public Iterator<Medico> iterator() {
        return new Iterator<Medico>() {
            private final Iterator<Medico> iter = listaMedicos.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public Medico next() {
                return iter.next();
            }
        };
    }

}
