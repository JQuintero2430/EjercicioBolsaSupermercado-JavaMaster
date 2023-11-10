package com.jorge.repository;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> productos;
    private final int MAX = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T producto) {
        if (this.productos.size() <= MAX) {
            productos.add(producto);
        } else {
            throw new RuntimeException("No se pueden añadir más productos");
        }
    }

    public List<T> getProducto() {
        return productos;
    }

}
