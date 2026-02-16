/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bleedplayer;
import com.mycompany.bleedplayer.model.*;
import com.mycompany.bleedplayer.audio.*;
/**
 *
 * @author jv134
 */
public class BleedPlayer {

    public static void main(String[] args) {

        Playlist lista = new Playlist();

        lista.agregarCancion(
            "Bleed",
            "Meshuggah",
            "Metal",
            "7:22",
            "C:\\Users\\jv134\\OneDrive\\Escritorio\\yt-dlp\\Bleed- Meshuggah.mp3"

        );

        lista.mostrarPlaylist();

        NodoCancion c = lista.buscar("Bleed");

        if(c != null) {

            Reproductor r = new Reproductor();
            r.reproducir(c.rutaArchivo);
        }
    }
}
