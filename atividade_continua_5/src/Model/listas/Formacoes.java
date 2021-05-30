package Model.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Formacoes implements Iterable {
    private final List listas = new ArrayList();

    public List getListas() {
        return listas;
    }

    public void addFormacaoLista(String formacao) {
        listas.add(formacao);
    }

    @Override
    public Iterator iterator() {
        return new Iterator<>() {
            private final Iterator iter = listas.iterator();

            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public void remove() {
                Iterator.super.remove();
            }

            @Override
            public void forEachRemaining(Consumer<? super Object> action) {
                Iterator.super.forEachRemaining(action);
            }
            };
        };
    }
