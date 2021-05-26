package Model.listas;

import Model.entidades.ItemHistorico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historico implements Iterable<ItemHistorico> {
    private final List<ItemHistorico> listaItemHistoricos = new ArrayList<ItemHistorico>();

    public List<ItemHistorico> getListaItemHistoricos() {
        return listaItemHistoricos;
    }

    public void addHistoricoLista(ItemHistorico itemHistorico) {
        listaItemHistoricos.add(itemHistorico);
    }

    @Override
    public Iterator<ItemHistorico> iterator() {
        return new Iterator<ItemHistorico>() {
            private final Iterator<ItemHistorico> iter = listaItemHistoricos.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public ItemHistorico next() {
                return iter.next();
            }
        };
    }

}
