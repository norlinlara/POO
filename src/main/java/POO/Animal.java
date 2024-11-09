/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author hi
 */
public class Animal {
    private String Pelo;
    private String Boca;
    private String Cola;
    private String ojo;
    private Integer Patas;

    public Animal(String Pelo, String Boca, String Cola, String ojo, Integer Patas) {
        this.Pelo = Pelo;
        this.Boca = Boca;
        this.Cola = Cola;
        this.ojo = ojo;
        this.Patas = Patas;
    }

    public String getPelo() {
        return Pelo;
    }

    public void setPelo(String Pelo) {
        this.Pelo = Pelo;
    }

    public String getBoca() {
        return Boca;
    }

    public void setBoca(String Boca) {
        this.Boca = Boca;
    }

    public String getCola() {
        return Cola;
    }

    public void setCola(String Cola) {
        this.Cola = Cola;
    }

    public String getOjo() {
        return ojo;
    }

    public void setOjo(String ojo) {
        this.ojo = ojo;
    }

    public Integer getPatas() {
        return Patas;
    }

    public void setPatas(Integer Patas) {
        this.Patas = Patas;
    }
    
    public void Sonido(){
        
    
    }
         
}
