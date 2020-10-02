/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.ArrayList;

/**
 *
 * @author Etxeb
 */
public class Test {
    
    
    public static void main(String args[]){
        
        ArrayList<Animal> animales = new ArrayList();
               
        Pez pececito = new Pez("nemo",3,"agua calida");
        Gato gatito = new Gato("Gato juanito",1,"siames");
        
        animales.add(gatito);
        animales.add(pececito);
        
        for (int i = 0; i < animales.size(); i++) {
            animales.get(i).desplazar();
            animales.get(i).emitirSonido();
            
            System.out.println(animales.get(i).getNombre());
            System.out.println(animales.get(i).getEdad());
            
        }
        
        
    }
    
}
