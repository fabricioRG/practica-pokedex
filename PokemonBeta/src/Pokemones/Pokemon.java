
package Pokemones;

import java.util.Random;

public class Pokemon {
    
    
    String nombre;
    int HP;
    int nivel;
    String habilidad;
    String especie;
    String tipo;
    double peso;
    double altura;
    String habitat;
    int aleatorio;

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
    
    //Metodo que selecciona aleatoriamente a un pokemon
    public void EleccionPokemonInicio() {
        Random pokemonRandom = new Random();
        aleatorio = 1 + pokemonRandom.nextInt(5);
        this.aleatorio =  aleatorio;
    }
    
    public void InicioPokemon(){
        
        EleccionPokemonInicio();
        if (aleatorio == 1) {
            PokemonAgua Squirtle = new PokemonAgua("sldkfj", 1,2,"sjkdfh","kdjh","kjdgh", 1, 2, "sh");
            Squirtle.StatusPokemon();
        } else {
            System.out.println("No ha pasado nada :/");
        }
    }
    
}
