
package Alimentacion;

import java.util.Random;
import Alimentacion.ComidaBuena;
import Alimentacion.ComidaMala;

public class Alimentacion {

    String comida;
    int comidaRandom;
    
    public Alimentacion(String comida){
        this.comida = comida;
    }
    public Alimentacion() {
    }
    public void ComidaRandom (){
        Random aleatorio = new Random();
        comidaRandom = 1 + aleatorio.nextInt(6);
        this.comidaRandom = comidaRandom;
    }
    public void ImprimirComida () {
        System.out.println("La comida seleccionada es " + comida);
    }
    public void DarComida () {
        ComidaRandom();
        if (comidaRandom == 1) {
            ComidaBuena bayas = new ComidaBuena("Bayas");
            bayas.ImprimirComida();
        } else if (comidaRandom == 2) {
            ComidaMala  carambolas = new ComidaMala("Carambolas");
            carambolas.ImprimirComida();
        } else if (comidaRandom == 3) {
            ComidaBuena pokecubos = new ComidaBuena("Pokecubos");
            pokecubos.ImprimirComida();
        } else if (comidaRandom == 4) {
            ComidaMala cassava = new ComidaMala("Cassava");
            cassava.ImprimirComida();
        } else if (comidaRandom == 5) {
            ComidaBuena pokochos = new ComidaBuena("Pokochos");
            pokochos.ImprimirComida();
        } else {
            ComidaMala hongos = new ComidaMala("Hongos");
            hongos.ImprimirComida();
        }
    }
}
