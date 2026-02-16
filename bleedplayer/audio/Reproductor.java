/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bleedplayer.audio;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
/**
 *
 * @author jv134
 */

public class Reproductor {
    private Player player;
    private Thread threadReproduccion;
    
    public void reproducir(String ruta){
        // Detener reproducción anterior si existe
        detener();
        
        threadReproduccion = new Thread(() -> {
            try{
                FileInputStream fis = new FileInputStream(ruta);
                player = new Player(fis);
                System.out.println("Iniciando reproduccion: " + ruta);
                player.play();
                System.out.println("Reproduccion finalizada");
            }catch(Exception e){
                System.out.println("Error al reproducir: " + e.getMessage());
                e.printStackTrace();
            }
        });
        
        threadReproduccion.start();
    }
    
    public void detener(){
        if(player != null){
            player.close();
        }
        if(threadReproduccion != null && threadReproduccion.isAlive()){
            threadReproduccion.interrupt();
        }
    }
}