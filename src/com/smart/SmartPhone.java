package com.smart;

public class SmartPhone extends SmartDevice {

    public SmartPhone() {
    }

    public SmartPhone(String so, String procesador, String pixels, double pantalla, int bateria, int almacenamiento, int ram) {
        super(so, procesador, pixels, pantalla, bateria, almacenamiento, ram);
    }

    @Override
    public String toString() {
        return "SmartPhone \n"
                + super.toString();
    }
}
