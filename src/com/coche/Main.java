package com.coche;

public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUImpl();

        cocheCRUD.save(new Coche());
        cocheCRUD.findAll();
        cocheCRUD.delete(new Coche());

    }
}
