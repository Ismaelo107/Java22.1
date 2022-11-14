package Tema2.Class.POO.Libro;

public class AppLibro {
    public static void main(String[] args) {

        Libro libro = new Libro("23-5345-2343-31", "titulo", "autor", 689);
        Libro libro1 = new Libro("23-5345-2343-31", "titulo1", "autor1", 779);

        System.out.println(libro);
        System.out.println(libro1);

        if (libro.getN_paginas() > libro1.getN_paginas()) {
            System.out.println("El" + libro.getTitulo() + "tiene más paginas que" + libro1.getTitulo());
        } else {
            System.out.println("El " + libro1.getTitulo() + " tiene más paginas que " + libro.getTitulo());

        }
    }
}
