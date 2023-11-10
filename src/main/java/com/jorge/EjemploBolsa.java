package com.jorge;

import com.jorge.repository.*;

public class EjemploBolsa {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFruta = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecible = new BolsaSupermercado<>();

        bolsaFruta.addProducto(new Fruta("Manzana", 1.5, 0.5, "Rojo"));
        bolsaFruta.addProducto(new Fruta("Pera", 1.2, 0.4, "Verde"));
        bolsaFruta.addProducto(new Fruta("Platano", 1.8, 0.6, "Amarillo"));
        bolsaFruta.addProducto(new Fruta("Naranja", 1.3, 0.5, "Naranja"));
        bolsaFruta.addProducto(new Fruta("Limon", 1.1, 0.3, "Amarillo"));

        bolsaLacteo.addProducto(new Lacteo("Leche", 1.2, 1, 3));
        bolsaLacteo.addProducto(new Lacteo("Queso", 2.5, 1, 5));
        bolsaLacteo.addProducto(new Lacteo("Yogur", 1.1, 1, 2));
        bolsaLacteo.addProducto(new Lacteo("Mantequilla", 1.3, 1, 4));
        bolsaLacteo.addProducto(new Lacteo("Natillas", 1.4, 1, 2));

        bolsaLimpieza.addProducto(new Limpieza("Jabon", 1.2, "Detergente", 1));
        bolsaLimpieza.addProducto(new Limpieza("Suavizante", 1.5, "Suavizante", 1));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 1.3, "Detergente", 1));
        bolsaLimpieza.addProducto(new Limpieza("Lejia", 1.1, "Lejia", 1));
        bolsaLimpieza.addProducto(new Limpieza("Lavavajillas", 1.4, "Detergente", 1));

        bolsaNoPerecible.addProducto(new NoPerecible("Arroz", 1.2, 500, 1));
        bolsaNoPerecible.addProducto(new NoPerecible("Pasta", 1.5, 250, 1));
        bolsaNoPerecible.addProducto(new NoPerecible("Legumbres", 1.3, 1000, 1));
        bolsaNoPerecible.addProducto(new NoPerecible("Aceite", 1.1, 2700, 1));
        bolsaNoPerecible.addProducto(new NoPerecible("Sal", 1.4, 500, 1));

        System.out.println("=================== Bolsa de Frutas ===================");
        for (Fruta fruta : bolsaFruta.getProducto()) {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }
        System.out.println("=================== Bolsa de Lacteos ===================");

        for (Lacteo lacteo : bolsaLacteo.getProducto()) {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Litros: " + lacteo.getCantidad());
            System.out.println("Grasa: " + lacteo.getProteina());
        }
        System.out.println("=================== Bolsa de productos de Limpieza ===================");
        for (Limpieza limpieza : bolsaLimpieza.getProducto()) {
            System.out.println("Nombre: " + limpieza.getNombre());
            System.out.println("Precio: " + limpieza.getPrecio());
            System.out.println("Tipo: " + limpieza.getComponentes());
            System.out.println("Cantidad: " + limpieza.getLitros());
        }
        System.out.println("=================== Bolsa de No Perecibles ===================");
        for (NoPerecible noPerecible : bolsaNoPerecible.getProducto()) {
            System.out.println("Nombre: " + noPerecible.getNombre());
            System.out.println("Precio: " + noPerecible.getPrecio());
            System.out.println("Cantidad: " + noPerecible.getContenido());
            System.out.println("Peso: " + noPerecible.getCalorias());
        }

    }
}