package com.coche;

public class Coche {

    String marca;
    String modelo;
    String color;
    double velocidad;

    public Coche() {

    }

    public Coche(String marca, String modelo, String color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
