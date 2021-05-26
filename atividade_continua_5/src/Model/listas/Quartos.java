package listas;

import entidades.Quarto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quartos implements Iterable<Quarto> {
    private final List<Quarto> listaQuartos = new ArrayList<Quarto>();

    public List<Quarto> getListaQuartos() {
        return listaQuartos;
    }

    public void addQuartos(Quarto quarto) {
        listaQuartos.add(quarto); // TODO: Validar inserção de quartos
    }

    @Override
    public Iterator<Quarto> iterator() {
        return new Iterator<Quarto>() {
            private final Iterator<Quarto> iter = listaQuartos.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public Quarto next() {
                return iter.next();
            }
        };
    }

}
