/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author csantamariacameselle
 */
public class Libreria {

    ArrayList<Libros> ListaLibros = new ArrayList();

    public void engadirLibros(Libros s) {

        ListaLibros.add(s);
    }

    public void venderLibros(String s) {
        for (Libros l : ListaLibros) {
            if (l.titulo.equals(s)) {
                ListaLibros.remove(l);
            }

        }
        ListaLibros.remove(s);
    }

    public void amosarLibros() {
        Collections.sort(ListaLibros, new Comparator<Libros>() {
            @Override
            public int compare(Libros p1, Libros p2) {
                return p1.titulo.compareTo(p2.titulo);
            }
        });

        for (Libros l : ListaLibros) {
            System.out.println(l.titulo);
        }

    }

    public void baixaLibros() {
        for (Libros l : ListaLibros) {
            if (l.n_unidades == 0) {
                ListaLibros.remove(l);
                break;
            }
        }

    }

    public void consultarLibro(String t) {
        for (Libros l : ListaLibros) {
            if (l.titulo.equals(t)) {
                System.out.println(l);
            }
        }
    }

}
