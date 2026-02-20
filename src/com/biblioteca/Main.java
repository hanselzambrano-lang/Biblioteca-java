package com.biblioteca;
import com.biblioteca.usuarios.Usuario;
public class Main {
    public static void main(String[] args) {
        //------------------------ Instancia Objeto Usuario-------------------------------------------------------------------
        Usuario usuario = new Usuario("Camila",18,"tucamilacrazy@gmail.com","estudiante");
        usuario.mostrarInfo();
        //---------------------Usuario-----------------------------------------//
        System.out.println("\n//----Usando GETTERS----//");
        String nombreActual = usuario.getNombre();
        int edadActual = usuario.getEdad();
        String emailActual = usuario.getEmail();
        String tipoUsuarioActual = usuario.getTipoUsuario();

        System.out.println("Nombre obtenido: "+nombreActual);
        System.out.println("Edad obtenido: "+edadActual);
        System.out.println("Email obtenido: "+emailActual);

        System.out.println("\n//----Usando SETTERS----//");
        usuario.setNombre("Camila Zambrano");
        usuario.setEdad(19);
        usuario.setEmail("camila.nuevocorreo@gmail.com");
        usuario.setTipoUsuario("Estudiante");

        System.out.println("\n//----Usuario Modificado----//");
        usuario.mostrarInfo();

        //---------------------------Instancia Objeto Libro------------------------------------------
        Libro libro = new Libro("El Quijote","Cervantes","1234567890123");
        System.out.println("Libro creado exitosamente");

        //------------------------------Libro-------------------------------------------//
        //info con getters
        String titulo = libro.getTitulo();
        String autor = libro.getAutor();
        String isbn = libro.getIsbn();
        boolean disponible = libro.isDisponible();

        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + disponible);

        //mod info con setters
        System.out.println("//----Modificando el libro----//");
        libro.setTitulo("Don Quijote de la mancha");
        libro.setAutor("Miguel de Cervantes Saavedra");
        libro.setIsbn("1234567890");
        libro.setDisponible(false);

        System.out.println("Nuevo Titulo: "+ libro.getTitulo());
        System.out.println("Nuevo Autor: "+ libro.getAutor());
        System.out.println("Nuevo ISBN: "+ libro.getIsbn());
        System.out.println("Disponible: "+ libro.isDisponible());




    }
}
