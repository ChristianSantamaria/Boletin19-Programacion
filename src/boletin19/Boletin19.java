/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import librerias.Librerias;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libreria Lista = new Libreria();
        int exit = 0;
        
        while(exit == 0){
            System.out.println("Elija la opcion que precise: ");
            System.out.println("a. Añadir libros ");
            System.out.println("b. Vender libros ");
            System.out.println("c. Visualizar los libros ");
            System.out.println("d. Dar de baja los libros ");
            System.out.println("e. Consultar un libro ");
            System.out.println("f. Salir ");
            
            String op = JOptionPane.showInputDialog("Escriba la opcion");
            switch(op){
                
                case "a":
                    String t = JOptionPane.showInputDialog("Escriba el titulo");
                    String a = JOptionPane.showInputDialog("Escriba el autor");
                    String i = JOptionPane.showInputDialog("Escriba el ISBN");
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Escriba el precio"));
                    int u = Integer.parseInt(JOptionPane.showInputDialog("Escriba la unidad"));

                    Lista.engadirLibros(new Libros(t,a,i,p,u));
                    break;
                
                case "b":
                    Lista.venderLibros(JOptionPane.showInputDialog("Que libro quiere vender?"));
                    break;
                    
                case "c":
                    Lista.amosarLibros();
                    break;
                
                case "d":
                    Lista.baixaLibros();
                    break;
                    
                case "e":
                    Lista.consultarLibro(JOptionPane.showInputDialog("Que libro quiere consultar?"));
                    break;
                case "f":
                    exit = 1;
                    break;
            }
            
        }
    }
    
}
