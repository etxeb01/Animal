/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Etxeb
 */
public class Gato extends Animal{
    
    private String raza;

    public Gato(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }  

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void desplazar() {
        System.out.println("soy gato y estoy caminando");
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miauuuuuu");
    }
    
}
