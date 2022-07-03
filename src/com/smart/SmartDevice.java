package com.smart;
//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//Crear constructor vacío y con todos los parámetros para cada clase.
//Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
public class SmartDevice {

    String so;
    String procesador;
    String pixels;
    double pantalla;
    int bateria;
    int almacenamiento;
    int ram;

    public SmartDevice() {

    }

    public SmartDevice(String so, String procesador, String pixels, double pantalla, int bateria, int almacenamiento, int ram) {
        this.so = so;
        this.procesador = procesador;
        this.pixels = pixels;
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "so= '" + so + '\'' + "\n" +
                "procesador= '" + procesador + '\'' + "\n" +
                "pixels= " + pixels + " px"+ "\n" +
                "pantalla= " + pantalla + " pulgadas "+ "\n" +
                "bateria= " + bateria + " mAh"+ "\n" +
                "almacenamiento= " + almacenamiento +  " GB" + "\n" +
                "ram= " + ram + " GB";
    }
}
