/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bleedplayer.model;

/**
 *
 * @author jv134
 */
public class NodoCancion {

    public String nombre;
    public String artista;
    public String genero;
    public String duracion;
    public String rutaArchivo;

    public NodoCancion siguiente;

    public NodoCancion(String nombre, String artista,
            String genero, String duracion, String rutaArchivo){

        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.rutaArchivo = rutaArchivo;
        this.siguiente = null;
    }   
}

    

