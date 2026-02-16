/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bleedplayer.model;

/**
 *
 * @author jv134
 */
public class Playlist {

    NodoCancion frente = null;
    NodoCancion fin = null;

    // ✅ agregar al final
    public void agregarCancion(String nombre, String artista,
                               String genero, String duracion,
                               String ruta) {

        NodoCancion nuevo = new NodoCancion(
                nombre, artista, genero, duracion, ruta);

        if(frente == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // ✅ mostrar todas
    public void mostrarPlaylist() {

        NodoCancion aux = frente;

        while(aux != null) {

            System.out.println("Cancion: " + aux.nombre);
            System.out.println("Artista: " + aux.artista);
            System.out.println("Genero: " + aux.genero);
            System.out.println("Duracion: " + aux.duracion);
            System.out.println("----------------");

            aux = aux.siguiente;
        }
    }

    // ✅ buscar por nombre
    public NodoCancion buscar(String nombre) {

        NodoCancion aux = frente;

        while(aux != null) {

            if(aux.nombre.equalsIgnoreCase(nombre)) {
                return aux;
            }
            aux = aux.siguiente;
        }

        return null;
    }

    // ✅ eliminar por nombre
    public void eliminar(String nombre) {

        NodoCancion actual = frente;
        NodoCancion anterior = null;

        while(actual != null) {

            if(actual.nombre.equalsIgnoreCase(nombre)) {

                if(anterior == null) {
                    frente = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }

                if(actual == fin) {
                    fin = anterior;
                }

                System.out.println("Cancion eliminada");
                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("No encontrada");
    }
}

