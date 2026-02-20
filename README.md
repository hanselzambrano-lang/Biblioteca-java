# 📚 Sistema de Biblioteca en Java

Proyecto de práctica para aprender los fundamentos de Programación Orientada a Objetos (POO) en Java.

## 🎯 Descripción

Sistema básico de gestión de biblioteca que permite crear usuarios y libros, utilizando getters y setters para manipular los datos.

## 📂 Estructura del Proyecto

```
biblioteca-java/
└── src/
    └── com/
        └── biblioteca/
            ├── Main.java      # Clase principal
            ├── Usuario.java   # Modelo de Usuario
            └── Libro.java     # Modelo de Libro
```

## 🧩 Clases

### Usuario
- **Atributos**: nombre, edad, email, tipoUsuario
- **Métodos**: getters, setters, mostrarInfo()

### Libro
- **Atributos**: titulo, autor, isbn, disponible
- **Métodos**: getters, setters

## 🚀 ¿Qué aprendí?

✅ Crear clases con atributos privados  
✅ Implementar constructores  
✅ Usar getters y setters correctamente  
✅ Encapsulamiento de datos  
✅ Diferencia entre tipos de datos (int vs String)  
✅ Uso de `this` para referenciar atributos  
✅ Organización de paquetes (packages)  
✅ Cuándo usar `import` y cuándo no  
✅ Instanciar y manipular objetos  
✅ Métodos personalizados (mostrarInfo)  

## 💻 Cómo ejecutar

```bash
# Compilar
javac -d out src/com/biblioteca/*.java

# Ejecutar
java -cp out com.biblioteca.Main
```

## 📌 Ejemplo de Salida

```
Nombre: Camila
Edad: 18
Email: tucamilacrazy@gmail.com
Tipo de Usuario: estudiante

//----Usando GETTERS----//
Nombre obtenido: Camila
Edad obtenido: 18
...
```

## 🛠️ Tecnologías

- Java JDK 24
- IntelliJ IDEA 2025.3.2

## 👤 Autor

**Hansel Zambrano**  
Proyecto de aprendizaje - 2026

---

⭐ **Logro desbloqueado**: Primer proyecto Java terminado y subido a GitHub
