/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author hi
 */
public class Queco extends Animal {

    public Queco(String Pelo, String Boca, String Cola, String ojo, Integer Patas) {
        super(Pelo, Boca, Cola, ojo, Patas);
    }
    
    @Override
    public void Sonido(){
        System.out.println("Tak Tak");
    }
    
}
