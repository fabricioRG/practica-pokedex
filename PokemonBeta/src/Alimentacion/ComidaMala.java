
package Alimentacion;

import java.util.Random;
import Pokemones.Impresiones;

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
        System.out.println("La comida seleccionada fue " + comida + "\n");
    }
    public void SeleccionComida(){
        Impresiones imprimir = new Impresiones();
        SeleccionRandom();
        if (actividadAleatoria == 1){
            ComidaMala comida1 = new ComidaMala("Hamburguesa");
            imprimir.comidaCuatro();
            comida1.ImprimirComida();
        } else if (actividadAleatoria == 2){
            ComidaMala comida2 = new ComidaMala("Hot Dog");
            imprimir.comidaCinco();
            comida2.ImprimirComida();
        } else {
            ComidaMala comida3 = new ComidaMala("Helado");
            imprimir.comidaSeis();
            comida3.ImprimirComida();
        }
    }
}
