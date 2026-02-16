package com.biblioteca.usuarios;


    public class Usuario {
        private String nombre;
        private int edad;
        private String email;
        private String tipoUsuario;

        public Usuario(String nombre, int edad, String email, String tipoUsuario) {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
            this.tipoUsuario = tipoUsuario;
        }

        public void mostrarInfo(){
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Email: "+email);
            System.out.println("Tipo: "+tipoUsuario);
        }
    }


