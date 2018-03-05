
package Pokemones;

import java.util.Random;

//Importando las clases a utilizar
import Pokemones.PokemonAgua;
import Pokemones.PokemonElectrico;
import Pokemones.PokemonFantasma;
import Pokemones.PokemonFuego;
import Pokemones.PokemonPlanta;

public class Pokemon {
    
    //Variables de la clase
    String nombre;
    int HP;
    int nivel;
    String habilidad;
    String especie;
    String tipo;
    double peso;
    double altura;
    String habitat;
    int pokemonRandom;

    //Metodo encargado de colocar valores iniciales a las clases hijas
    public Pokemon(String nombre, int HP, int nivel, String habilidad, String especie, String tipo, double peso, double altura, String habitat) {
        this.nombre = nombre;
        this.HP = HP;
        this.nivel = nivel;
        this.habilidad = habilidad;
        this.especie = especie;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.habitat = habitat;
    }
    //Metodo encargado de imprimir el estado del pokemon seleccionado
    public void StatusPokemon() {
        System.out.println("Nombre: " + nombre + " / HP: " + HP + " / Nivel: " + nivel + " / Habilidad: " + habilidad 
                + " / Especie: " + especie + " / Tipo: " + tipo + " / Peso: " + peso + " kg / Altura: " + altura + " m / Habitat: " + habitat);
    }
    //Metodo que selecciona aleatoriamente un numero entre 1 a 5
    public void EleccionPokemonInicio() {
        Random aleatorio = new Random();
        pokemonRandom = 1 + aleatorio.nextInt(5);
        this.pokemonRandom =  pokemonRandom;
    }

    //Constructor de la clase
    public Pokemon() {
    }
    
    //Metodo encargado de seleccionar un pokemon aleatoriamente
    public void InicioPokemon(){
        
        EleccionPokemonInicio();
        if (pokemonRandom == 1) {
            PokemonAgua squirtle = new PokemonAgua("Squirtle", 10, 0, "torrente", "tortuguita", "agua", 9, 0.5, "agua dulce");
            squirtle.StatusPokemon();
            squirtle.ImagenAgua();
        } else if (pokemonRandom == 2){
            PokemonElectrico pikachu =  new PokemonElectrico("Pikachu", 15, 0, "electricidad", "raton", "electrico", 6, 0.4, "bosque" );
            pikachu.StatusPokemon();
            pikachu.ImagenElectrico();
        } else if (pokemonRandom == 3) {
            PokemonFantasma gastly = new PokemonFantasma("Gastly", 10, 0, "levitacion", "gas", "fantasma", 0.1, 1.3, "caverna");
            gastly.StatusPokemon();
            gastly.ImagenFantasma();
        } else if (pokemonRandom == 4) {
            PokemonFuego charmander = new PokemonFuego("Charmander", 12, 0, "mar llamas", "lagartija", "fuego", 8.5, 0.6, "montaña");
            charmander.StatusPokemon();
            charmander.ImagenFuego();
        } else {
            PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 10, 0, "espesura", "semilla", "planta", 6.9, 0.7, "pradera");
            bulbasaur.StatusPokemon();
            bulbasaur.ImagenPlanta();
        }
        
    }
    
}
