package com.company.entrega5;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();


    public static void main(String[] args) {

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();

    }
}