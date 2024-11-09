/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author hi
 */
public class Herencia {
    
    
    public static void main(String[] args) {
        
        Perro p = new Perro( " Color Negro", "Sii", "Si", "Si ",4);
        p.Sonido();
        
        Gato g = new Gato("Blanco", "Si", "Si", "Si", 4);
        g.Sonido();
        
        Queco q = new Queco("No tiene","Si", "Si","Si", 4);
        q.Sonido();
    }
}