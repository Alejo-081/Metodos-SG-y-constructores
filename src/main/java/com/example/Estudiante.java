package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private int promedio;

    public Estudiante() {
        nombre = "dani";
        edad = 34;
        promedio = 54;
    }

    public Estudiante(String nombre, int edad, int promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            System.out.println("edad invalida");
        } else {
            this.edad = edad;
        }
    }

    public boolean haAprobado() {
        if (promedio >= 3.0) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarInfo(){
        System.out.println("tu nombre es: " + nombre + "\ntu edad es: " + edad + "\ntu promedio es: " + promedio + "\n¿estas aprobado?: " + haAprobado());
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

}