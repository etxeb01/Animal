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
public class Pez extends Animal{
    
    private String tipoAgua;

    public Pez(String nombre, int edad, String tipoAgua) {
        super(nombre, edad);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

            

    @Override
    public void desplazar() {
        System.out.println("nadando ");
    }

    @Override
    public void emitirSonido() {
        System.out.println("glu glu glu");
    }
    
}
