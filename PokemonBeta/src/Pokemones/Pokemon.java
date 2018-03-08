package Pokemones;

//Importando las clases a utilizar
import java.util.Random;
import java.util.Scanner;
import Actividades.Actividades;
import Alimentacion.Alimentacion;
import Pokedex.pokedex;

public class Pokemon {

    //Variables de la clase
    int HP, nivel, experiencia, numeroRandom, seleccion;
    String habilidad, especie, tipo, habitat, nombre;
    double peso, altura;
    
    String seleccionado = "Has seleccionado a: ";

    Impresiones impresion = new Impresiones();
    Alimentacion alimento = new Alimentacion();
    pokedex pokemonfun = new pokedex();
    
    Pokemon squirtle;
    Pokemon pikachu;
    Pokemon gastly;
    Pokemon charmander;
    Pokemon bulbasaur;

    //Metodo encargado de colocar valores iniciales a las clases hijas
    public Pokemon(String nombre, int HP, int nivel, int experiencia, String habilidad, String especie, String tipo, double peso, double altura, String habitat) {
        this.nombre = nombre;
        this.HP = HP;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.habilidad = habilidad;
        this.especie = especie;
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.habitat = habitat;
    }

    //Metodo encargado de imprimir el estado del pokemon seleccionado
    public void StatusPokemon() {
        System.out.println("Nombre: " + nombre + " / HP: " + HP + " / Nivel: " + nivel + " / Experiencia: " + experiencia + " / Habilidad: " + habilidad
                + " / Especie: " + especie + " / Tipo: " + tipo + " / Peso: " + peso + " kg / Altura: " + altura + " m / Habitat: " + habitat + "\n");
    }

    //Metodo que selecciona aleatoriamente un numero entre 1 a 5
    public void NumeroRandom() {
        Random aleatorio = new Random();
        numeroRandom = 1 + aleatorio.nextInt(5);
        this.numeroRandom = numeroRandom;
    }

    public void VidaPokemon() {
        HP = (nivel + 1) * 100;
    }
    public int VidaParcial(){
        int HP1;
        HP1 = (nivel + 1)*100;
        return HP1;
    }

    public void MasVida() {
        if (nivel >= 1) {
            VidaPokemon();
        }
    }
    public void GanarVida(){
        NumeroRandom();
        HP = HP + numeroRandom;
        if (HP > VidaParcial()){
            HP = VidaParcial();
            System.out.println("La vida de " + nombre + "ha sido completada o llegado a su maximo");
        } else if (HP < VidaParcial()){
            System.out.println("Has ganado " + numeroRandom + " pts de vida");
        }
    }
    public void PerderVida(){
        NumeroRandom();
        HP = HP - numeroRandom;
        if (HP <= 0){
            HP = 0;
            System.out.println("Tu pokemon ha muerto");
        } else if(HP > 0){
            System.out.println("Has perdido " + numeroRandom + " pts de vida");
        }
    }

    //Constructor de la clase
    public Pokemon() {
    }

    //Metodo encargado de inicializar los pokemones a utilizar durante todo el juego
    public void InicioPokemon() {
        System.out.println("Bienvendo, dispones de los siguientes pokemones\n");

        Pokemon squirtle = new Pokemon("Squirtle", 100, 0, 0, "torrente", "tortuguita", "agua", 9, 0.5, "agua dulce");
        this.squirtle = squirtle;
        squirtle.StatusPokemon();
        impresion.Squirtle();

        Pokemon pikachu = new Pokemon("Pikachu", 100, 0, 0, "electricidad", "raton", "electrico", 6, 0.4, "bosque");
        this.pikachu = pikachu;
        pikachu.StatusPokemon();
        impresion.Pikachu();

        Pokemon gastly = new Pokemon("Gastly", 100, 0, 0, "levitacion", "gas", "fantasma", 0.1, 1.3, "caverna");
        this.gastly = gastly;
        gastly.StatusPokemon();
        impresion.Gastly();

        Pokemon charmander = new Pokemon("Charmander", 100, 0, 0, "mar llamas", "lagartija", "fuego", 8.5, 0.6, "montaña");
        this.charmander = charmander;
        charmander.StatusPokemon();
        impresion.Charmander();

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 100, 0, 0, "espesura", "semilla", "planta", 6.9, 0.7, "pradera");
        this.bulbasaur = bulbasaur;
        bulbasaur.StatusPokemon();
        impresion.bulbasaur();
    }

    public void SeleccionPokemon() {
        Scanner select = new Scanner(System.in);
        System.out.println("¿Que pokemon deseas utilizar en este momento?");
        System.out.println("1. Squirtle / 2. Pikachu / 3. Gastly / 4. Charmander / 5. Bulbasaur");
        seleccion = select.nextInt();
    }
    public void ImprimirPokemon(){
        if (seleccion == 1) {
            impresion.Squirtle();
            squirtle.MasVida();
            squirtle.StatusPokemon();
        } else if (seleccion == 2) {
            impresion.Pikachu();
            pikachu.MasVida();
            pikachu.StatusPokemon();
        } else if (seleccion == 3) {
            impresion.Gastly();
            gastly.MasVida();
            gastly.StatusPokemon();
        } else if (seleccion == 4) {
            impresion.Charmander();
            charmander.MasVida();
            charmander.StatusPokemon();
        } else if (seleccion == 5) {
            impresion.bulbasaur();
            bulbasaur.MasVida();
            bulbasaur.StatusPokemon();
        }
    }
    
    public void PokemonElegido(){
        if (seleccion == 1) {
            System.out.println(seleccionado + this.squirtle.nombre);
            this.squirtle.pokemonfun.MenuPrincipal();
        } else if (seleccion == 2) {
            System.out.println(seleccionado + this.pikachu.nombre);
            this.pikachu.pokemonfun.MenuPrincipal();
        } else if (seleccion == 3) {
            System.out.println(seleccionado + this.gastly.nombre);
            this.gastly.pokemonfun.MenuPrincipal();
        } else if (seleccion == 4) {
            System.out.println(seleccionado + this.charmander.nombre);
            this.charmander.pokemonfun.MenuPrincipal();
        } else if (seleccion == 5) {
            System.out.println(seleccionado + this.bulbasaur.nombre);
            this.bulbasaur.pokemonfun.MenuPrincipal();
        }
        System.out.println("\n");
    }
}
