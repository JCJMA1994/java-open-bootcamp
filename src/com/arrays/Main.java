package com.arrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(palabraReverse("hola mundo"));
        System.out.println("Array Unidimonio: " );
        arrayUnidimensional();
        System.out.println("Array Bidimensional");
        arrayBidimensional();
        System.out.println("Vector");
        vector();
        System.out.println("Array List");
        arrayList();
        System.out.println("Array List Int");
        arrayListInt();
        System.out.println("Divide por cero");
        dividePorCero();
        System.out.println("Ficheros");
        copiarFichero();

    }

    public static String palabraReverse(String texto) {
        //1 Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }
    public static void arrayUnidimensional() {
        //2 Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] array = {"hola", "mundo", "hola", "mundo", "hola", "mundo"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void arrayBidimensional() {
        //3 Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Posicion: " + i + "," + j + " Valor: " + array[i][j]);
            }
        }
    }

    public static void vector() {
        //4 Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> vector = new Vector<String>();
        vector.add("hola");
        vector.add("mundo");
        vector.add("hola");
        vector.add("mundo");
        vector.add("hola");
        vector.add("mundo");
        vector.remove(1);
        vector.remove(2);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
    }

    public static void arrayList() {
        //6 Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hola");
        arrayList.add("mundo");
        arrayList.add("hola");
        arrayList.add("mundo");
        LinkedList<String> linkedList = new LinkedList<String>();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(arrayList.get(i));
        }
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }

    public static void arrayListInt() {
        //7 Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle,
        // recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void dividePorCero() {
        //8 Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
        // que será capturada por su llamante (desde "main", por ejemplo).
        try {
            int a = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
    }

    public static void copiarFichero() {
        //9 Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        // Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList,
        // LinkedList o array.
        try {
            FileInputStream fis = new FileInputStream("fichero.txt");
            FileOutputStream fos = new FileOutputStream("fichero2.txt");
            int dato = fis.read();
            while (dato != -1) {
                fos.write(dato);
                dato = fis.read();
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
