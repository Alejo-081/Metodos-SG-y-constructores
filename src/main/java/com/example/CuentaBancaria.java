// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

public class CuentaBancaria {
   private String titular;
   private double saldo;

   public CuentaBancaria(String titular, double saldoInicial) {
      this.titular = titular;
      if (saldoInicial < (double)0.0F) {
         this.saldo = (double)0.0F;
      } else {
         this.saldo = saldoInicial;
      }

   }

   public String getTitular() {
      return this.titular;
   }

   public void setTitular(String titular) {
      this.titular = titular;
   }

   public double getSaldo() {
      return this.saldo;
   }

   public void depositar(double cantidad) {
      if (cantidad > (double)0.0F) {
         this.saldo += cantidad;
      } else {
         System.out.println("La cantidad a depositar debe ser positiva.");
      }

   }

   public void retirar(double cantidad) {
      if (cantidad > (double)0.0F && cantidad <= this.saldo) {
         this.saldo -= cantidad;
      } else {
         System.out.println("Fondos insuficientes para retirar.");
      }

   }
}
