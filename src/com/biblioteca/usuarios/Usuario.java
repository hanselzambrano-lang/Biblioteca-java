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
            System.out.println("Tipo de Usuario: "+tipoUsuario);
        }

        //getters de Usuario
        public String getNombre() {
            return nombre;
        }
        public int getEdad() {
            return edad;
        }
        public String getEmail() {
            return email;
        }
        public String getTipoUsuario() {
            return tipoUsuario;
        }

        //setters de Usuario
        public void setNombre(String nombre) {this.nombre = nombre;}
        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setTipoUsuario(String tipoUsuario) {this.tipoUsuario = tipoUsuario;}




    }


