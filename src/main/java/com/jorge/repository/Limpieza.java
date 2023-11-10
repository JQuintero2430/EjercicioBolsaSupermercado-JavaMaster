package com.jorge.repository;

public class Limpieza extends Producto{
    private String Componentes;
    private double litros;

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        Componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return Componentes;
    }

    public double getLitros() {
        return litros;
    }
}
