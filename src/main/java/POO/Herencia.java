/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hi
 */
public class Herencia {
    
    
    public static void main(String[] args) {
        
        Perro p = new Perro( " Color Negro", "Sii", "Si", "Si ",4);
        //p.Sonido();
        
        Gato g = new Gato("Blanco", "Si", "Si", "Si", 4);
        //g.Sonido();
        
        Queco q = new Queco("No tiene","Si", "Si","Si", 4);
        //q.Sonido();
        
        List<Animal> lista = new ArrayList<>();
        lista.add(p);
        lista.add(g);
        lista.add(q);
        lista.add(new Queco("NO", "SI", "SI", "SI", 4));
        
        for (Animal item : lista){
            item.Sonido();
        
        
        }
                
        
    }
}