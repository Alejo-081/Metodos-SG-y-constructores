// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package com.example;

public class Libro {
   private String titulo;
   private String autor;
   private int paginas;

   public Libro() {
      this.titulo = "Desconocido";
      this.autor = "Anonimo";
      this.paginas = 0;
   }

   public Libro(String titulo, String autor) {
      this.titulo = titulo;
      this.autor = autor;
      this.paginas = 0;
   }

   public Libro(String titulo, String autor, int paginas) {
      this.titulo = titulo;
      this.autor = autor;
      this.paginas = paginas;
   }

   public void mostrarDetalles() {
      System.out.println("Título: " + this.titulo);
      System.out.println("Autor: " + this.autor);
      System.out.println("Páginas: " + this.paginas);
   }

   public String getTitulo() {
      return this.titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getAutor() {
      return this.autor;
   }

   public void setAutor(String autor) {
      this.autor = autor;
   }

   public int getPaginas() {
      return this.paginas;
   }

   public void setPaginas(int paginas) {
      this.paginas = paginas;
   }
}
