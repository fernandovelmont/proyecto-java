/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.StringTokenizer;

/**
 *
 * @author Fernandodaniel
 */
public class Respuestas {
     String[] respuestas = {
  "1940","Sinsajo","James Paul McCartney",
  "Nirvana","Red Hot Chili Peppers","Bruno Mars",
  "Malfoy","Bola de nieve","Jarvis",
  "Freddie Mercury"
    };
  
  String[] radioR = {
        "1940,1950,1952,1946",
        "Lechuza,Sinsajo,Gale,Llamas",
        "Paul James McCartney, Sir Paul McCartney,James Paul McCartney,Paul McCartney Suer",
        "Los Beatles ,Led Zeppelin ,Nirvana ,Los Rolling Stones", 
        "Aerosmith,Radiohead,Metalica ,Red Hot Chili Peppers",
        "Justin Bieber,Bruno Mars,Rihanna ,Luciano Pavarotti",
        "Weasley,Potter,Malfoy,Black",
        "Bola de nieve,Bolita,Nieve,Gato",
        "Tony,Jef,Jarvis,Alex",
        "Robert Plan,Kurt Cobain,Phill Collins,Freddie Mercury"
        
  };
  public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
  
   public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[15];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); 
            i++;
        }
        
        return a;
   }
   
   public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
        
}
