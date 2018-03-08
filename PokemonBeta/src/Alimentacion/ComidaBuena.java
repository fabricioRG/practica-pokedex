
package Alimentacion;
import ActividadesNegativas.ActividadNegativa;
import Pokemones.Pokemon;
import java.util.Random;


/**
 *
 * @author fabricio
 */

public class ComidaBuena  {
    int actividadAleatoria;
    String comida;

    public ComidaBuena(String comida) {
        this.comida = comida;
    }
    public ComidaBuena() {
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
            ComidaBuena comida1 = new ComidaBuena("Bayas");
            comida1.ImprimirComida();
        } else if (actividadAleatoria == 2){
            ComidaBuena comida2 = new ComidaBuena("Pokecubos");
            comida2.ImprimirComida();
        } else {
            ComidaBuena comida3 = new ComidaBuena("Pokochos");
            comida3.ImprimirComida();
        }
    }
    
}
