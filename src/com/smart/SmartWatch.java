package com.smart;

public class SmartWatch extends SmartDevice{

    public SmartWatch() {
    }

    public SmartWatch(String so, String procesador, String pixels, double pantalla, int bateria, int almacenamiento, int ram) {
        super(so, procesador, pixels, pantalla, bateria, almacenamiento, ram);
    }

    @Override
    public String toString() {
        return "SmartWatch \n"
                + super.toString();
    }
}
