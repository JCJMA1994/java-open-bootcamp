package datos;

import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        Scanner tcl = new Scanner(System.in);

        System.out.println("Ingrese el precio sin IGV: ");
        double precio = tcl.nextDouble();

        System.out.println("El precio con IGV es: " + iva(precio));

    }


     static double iva(double precio){
        double igv, total;
        igv = precio * 0.18;
        total = precio + igv;
        return total;
     }
}
