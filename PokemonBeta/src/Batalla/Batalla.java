
package Batalla;
import java.util.Scanner;
import java.util.Random;
import Pokemones.Pokemon;

/**
 *
 * @author fabricio
 */
public class Batalla {
    
    String nombre, ataque2;
    public int ataqueRandom, ataque;
    
    public Batalla(){
    }
    
    public void Batalla(){
        
    }
    public void impresion(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Ingrese el ataque y nombre del pokemon");
        this.ataque2 = scan.nextLine();
        this.nombre = scan2.nextLine();
        if (this.ataque2.equalsIgnoreCase("r")){
            System.out.println("El pokemon "+ nombre+ " ha huido");
        } else{
            cambioDeTipo();
            generarAtaque();
        }
    }
    public void ataqueRandom(){
        Random ataque = new Random();
        this.ataqueRandom = 1 + ataque.nextInt(25);
    }
    public void generarAtaque(){
        ataqueRandom();
        System.out.println("El ataque es de " + ataqueRandom);
    }
    public void cambioDeTipo(){
        Pokemon pokemon = new Pokemon();
        this.ataque = Integer.parseInt(this.ataque2);
        System.out.println("Ataque de " + nombre + " con " + this.ataque + " pts de daño");
    }
    public int ataqueDaño(){
        return this.ataque;
    }
}
