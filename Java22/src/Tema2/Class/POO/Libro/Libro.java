package Tema2.Class.POO.Libro;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int n_paginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int n_paginas) {
        this.isbn = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.n_paginas = n_paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    @Override
    public String toString() {
        return "El Libro" + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " y tiene " + n_paginas;

    }
}
