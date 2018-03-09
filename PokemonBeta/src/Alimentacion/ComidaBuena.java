
package Alimentacion;
import ActividadesNegativas.ActividadNegativa;
import Pokemones.Pokemon;
import Pokemones.Impresiones;
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
        System.out.println("La comida seleccionada fue " + comida + "\n");
    }
    public void SeleccionComida(){
        Impresiones imprimir = new Impresiones();
        SeleccionRandom();
        if (actividadAleatoria == 1){
            ComidaBuena comida1 = new ComidaBuena("Aguacate");
            imprimir.ComidaUno();
            comida1.ImprimirComida();
        } else if (actividadAleatoria == 2){
            ComidaBuena comida2 = new ComidaBuena("Manzana");
            imprimir.comidaDos();
            comida2.ImprimirComida();
        } else {
            ComidaBuena comida3 = new ComidaBuena("Banano");
            imprimir.comidaTres();
            comida3.ImprimirComida();
        }
    }
    
}
