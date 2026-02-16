package com.biblioteca;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;


    //aqui this.titulo hace referencia a los atributos que estan arriba de la clase
    //mientras que el valor asignado   hace la referencia al parametro del constructor

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    //Getters : solo se usan para traer informacion
    //Siempre retornara el valor del atributo sin pasar parametros.
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isDisponible() {
        return disponible;
    }

    //Setters : modificar informacion
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


}
