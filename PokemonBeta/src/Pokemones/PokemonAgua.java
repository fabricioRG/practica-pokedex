
package Pokemones;
/**
 * Pokedex
 * @author fabricio - 28.02.2018 
 * @Title: PokemonAgua
 * @Description: description
 *
 * Changes History
 */

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nombre, int HP, int nivel, String habilidad, String especie, String tipo, double peso, double altura, String habitat) {
        super(nombre, HP, nivel, habilidad, especie, tipo, peso, altura, habitat);
    }    
    
    public void StatusPokemon() {
        System.out.println("Nombre: " + nombre + " / HP: " + HP + " / nivel: " + nivel);
    }
}
