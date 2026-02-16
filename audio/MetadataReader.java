/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.audio;
import com.mpatric.mp3agic.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.ByteArrayInputStream;
/**
 *
 * @author jv134
 */
public class MetadataReader {
    public static ImageIcon obtenerPortada(String ruta){

        try {

            Mp3File mp3 = new Mp3File(ruta);

            if(mp3.hasId3v2Tag()){

                ID3v2 id3v2Tag = mp3.getId3v2Tag();

                byte[] imageData = id3v2Tag.getAlbumImage();

                if(imageData != null){

                    return new ImageIcon(imageData);
                }
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
    
}
