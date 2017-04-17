/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Fernandodaniel
 */
public class preguntas {
   String[] preguntas = {
     "¿En que año se estreno la pelicula pinocho?",
     "¿Como se llama el pajaro simbolo de los juegos del hambre?",
     "¿Cual es el nombre del Paul MccCarteney?",
     "¿Qué grupo interpretaba la canción Smells like teen spirit?",
     "¿En que banda canta Anthony Kiedis ?",
     " ¿Qué cantante hizo una aparición en el medio tiempo del Superbowl 2014?",
     " ¿A qué familia pertenece Dobby,el elfo doméstico en la historia de Harry Potter?",
     " ¿Cómo se llamaba el primer gato de Los Simpsons?",
     " ¿Cómo se llama el ayudante de Iron Man?",
     " ¿Cómo se llamaba el cantante de Queen?"
   };
    public String getPregunta(int posicion){
        return preguntas[posicion];
}
}