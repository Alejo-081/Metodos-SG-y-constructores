// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

import java.io.PrintStream;

public class Estudiante {
   private String nombre;
   private int edad;
   private Double promedio;

   public Estudiante() {
      this.nombre = "Desconocido";
      this.edad = 0;
      this.promedio = (double)0.0F;
   }

   public Estudiante(String nombre, int edad, Double promedio) {
      this.nombre = nombre;
      this.edad = edad;
      this.promedio = promedio;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public void setEdad(int edad) {
      if (edad > 0) {
         this.edad = edad;
      } else {
         System.out.println("La edad no puede ser negativa.");
      }

   }

   public Double getPromedio() {
      return this.promedio;
   }

   public void setPromedio(Double promedio) {
      this.promedio = promedio;
   }

   public boolean haAprobado() {
      return this.promedio >= (double)3.0F;
   }

   public void mostrarInfo() {
      String var10001 = this.nombre;
      System.out.println("Nombre: " + var10001);
      int var1 = this.edad;
      System.out.println("Edad: " + var1);
      PrintStream var10000 = System.out;
      String var2 = String.valueOf(this.promedio);
      var10000.println("Promedio: " + var2);
      System.out.println(this.promedio >= (double)3.0F ? "Aprobado" : "Reprobado");
   }
}
