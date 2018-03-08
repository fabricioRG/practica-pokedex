
package Alimentacion;

import java.util.Random;

/**
 *
 * @author fabricio
 */
public class ComidaMala {
    
    int actividadAleatoria;
    String comida;
        
    public ComidaMala(String comida){
        this.comida = comida;
    }

    public ComidaMala() {
    }
    
    public void SeleccionRandom(){
        Random aleatorio = new Random();
        actividadAleatoria = 1 + aleatorio.nextInt(3);
        this.actividadAleatoria = actividadAleatoria;
    }
     public void ImprimirComida () {
        System.out.println("La comida seleccionada es " + comida + "\n");
    }
    public void SeleccionComida(){
        SeleccionRandom();
        if (actividadAleatoria == 1){
            ComidaMala comida1 = new ComidaMala("Bayas");
            comida1.ImprimirComida();
        } else if (actividadAleatoria == 2){
            ComidaMala comida2 = new ComidaMala("Pokecubos");
            comida2.ImprimirComida();
        } else {
            ComidaMala comida3 = new ComidaMala("Pokochos");
            comida3.ImprimirComida();
        }
    }
}
