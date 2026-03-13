// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

public class Main {
   public Main() {
   }

   public static void main(String[] args) {
      Libro libro1 = new Libro();
      libro1.mostrarDetalles();
      Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes");
      libro2.mostrarDetalles();
      Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 345);
      libro3.mostrarDetalles();
      CuentaBancaria cuenta = new CuentaBancaria("Andres Betancur", (double)500.0F);
      cuenta.depositar((double)200.0F);
      System.out.println("Saldo después del depósito: " + cuenta.getSaldo());
      System.out.println(cuenta.getSaldo());
      System.out.println("Intentando retirar 1000...");
      cuenta.retirar((double)1000.0F);
      Estudiante estudiante = new Estudiante("Andres Betancur", 19, 3.7);
      estudiante.mostrarInfo();
      System.out.println("¿Ha aprobado? " + estudiante.haAprobado());
   }
}
