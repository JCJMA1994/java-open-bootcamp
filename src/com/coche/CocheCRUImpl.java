package com.coche;

import java.util.List;

public class CocheCRUImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {

        System.out.println("SAVE");

    }

    @Override
    public List<Coche> findAll() {
        return null;
    }

    @Override
    public void delete(Coche coche) {

        System.out.println("DELETE");

    }
}
