/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;


/**
 *
 * @author csantamariacameselle
 */
public class Libros {
    public String titulo;
    public String autor;
    public String ISBN;
    public int prezo;
    public int n_unidades;

    public Libros(String titulo, String autor, String ISBN, int prezo, int n_unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.n_unidades = n_unidades;
    }

    @Override
    public String toString() {
        return "Titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", n_unidades=" + n_unidades;
    }
    
    
    
    
    
}
