package Prova;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {

    private List<T> catalogo = new ArrayList<>();

    public void adicionar(T elemento) {
        catalogo.add(elemento);
    }

    public List<T> getCatalogo() {
        return catalogo;
    }
}
