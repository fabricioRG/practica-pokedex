package Pokemones;

//Importando las clases a utilizar
import java.util.Random;
import java.util.Scanner;
import Pokedex.pokedex;
import ActividadesNegativas.ActividadNegativa;
import ActividadesPositivas.ActividadPositiva;
import Alimentacion.ComidaBuena;
import Alimentacion.ComidaMala;
import Batalla.Batalla;
import Pokemones.Impresion;

public class Pokemon {

    //Variables de la clase
    int HP, nivel, experiencia, numeroRandom, seleccion, seleccionRandom;
    String habilidad, especie, tipo, habitat, nombre;
    double peso, altura;
    
    String seleccionado = "Has seleccionado a: ";
    String ingresarImagen = "Ingrese la imagen para su pokemon ";

    Impresiones impresion = new Impresiones();
    Impresion impresiones = new Impresion();
    pokedex pokemonfun = new pokedex();
    ActividadPositiva primeraActividad = new ActividadPositiva();
    ActividadNegativa segundaActividad = new ActividadNegativa();
    ComidaMala segundaComida = new ComidaMala();
    ComidaBuena primerComida = new ComidaBuena();
    Batalla batalla = new Batalla();
    
    Pokemon squirtle = new Pokemon();
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
    //Metodo encargado de aumentar puntos de vida al pokemon
    public void GanarVida(){
        int vidaParcial;
        NumeroRandom();
        if (this.HP >= VidaParcial()){
            this.HP = VidaParcial();
            System.out.println("\n" + "La vida de " + nombre + " ha llegado a su maximo");
        } else if (this.HP < VidaParcial()){
            vidaParcial = HP + numeroRandom;
            if (vidaParcial < VidaParcial()){
                this.HP = HP + numeroRandom;
                System.out.println("\n" + "Has ganado " + numeroRandom + " pts de vida");
            } else if (vidaParcial == VidaParcial()){
                this.HP = HP + numeroRandom;
                System.out.println("\n" + "Has ganado " + numeroRandom + " pts de vida y has completado la vida de tu pokemon");
            } else if (vidaParcial > VidaParcial()){
                this.HP = VidaParcial();
                System.out.println("\n" + "La vida de " + nombre + " ha sido completada y ha llegado a su maximo");
            }
        }
    }
    //Metodo encargado de reducir puntos de vida al pokemon 
    public void PerderVida(){
        NumeroRandom();
        if (this.HP <= 0){
            this.HP = 0;
            System.out.println("Tu pokemon ha muerto\n");
        } else if(this.HP > 0){
            this.HP = HP - numeroRandom;
            System.out.println("Has perdido " + numeroRandom + " pts de vida\n");
        }
    }
    public void BatallaUno(){
        seleccionPokemon().vidaBatalla();
    }
    public void vidaBatalla(){
        System.out.println("ataque " + batalla.ataqueDaño());
        int ataqueDaño;
        ataqueDaño = batalla.ataqueDaño();
        this.HP = HP - ataqueDaño;
    }

    //Constructor de la clase
    public Pokemon() {
    }
    //Metodo encargado de generar un numero aleatorio entre 1 y 2
    public void SeleccionRandom(){
        Random random = new Random();
        seleccionRandom = 1 + random.nextInt(2);
        this.seleccionRandom = seleccionRandom;
    }
    //Metodo encargado de seleccionar la actividad a realizar aleatoriamente 
    public void SeleccionActividad(){
        SeleccionRandom();
        if (seleccionRandom == 1) {
            primeraActividad.SeleccionPositiva();
            seleccionPokemon().GanarVida();
        } else {
            segundaActividad.SeleccionActividad();
            seleccionPokemon().PerderVida();
        }
    }
    public void SeleccionComida(){
        SeleccionRandom();
        if (seleccionRandom == 1) {
            primerComida.SeleccionComida();
            seleccionPokemon().GanarVida();
        } else {
            segundaComida.SeleccionComida();
            seleccionPokemon().PerderVida();
        }
    }
    //Metodo encargado de inicializar los pokemones a utilizar durante todo el juego
    public void InicioPokemon() {
        String[] obtenerImagen = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvendo, dispones de los siguientes pokemones\n");
        
        Pokemon squirtle = new Pokemon("Squirtle", 100, 0, 0, "torrente", "tortuguita", "agua", 9, 0.5, "agua dulce");
        this.squirtle.setHP(0);
        this.squirtle = squirtle;
        this.squirtle.StatusPokemon();
        //System.out.println(ingresarImagen + this.squirtle.nombre );
        //obtenerImagen[0] = scan.nextLine();
        //impresiones.Squirtle(obtenerImagen[0]);
        impresion.Squirtle();

        Pokemon pikachu = new Pokemon("Pikachu", 100, 0, 0, "electricidad", "raton", "electrico", 6, 0.4, "bosque");
        this.pikachu = pikachu;
        this.pikachu.StatusPokemon();
        impresion.Pikachu();

        Pokemon gastly = new Pokemon("Gastly", 100, 0, 0, "levitacion", "gas", "fantasma", 0.1, 1.3, "caverna");
        this.gastly = gastly;
        this.gastly.StatusPokemon();
        impresion.Gastly();

        Pokemon charmander = new Pokemon("Charmander", 100, 0, 0, "mar llamas", "lagartija", "fuego", 8.5, 0.6, "montaña");
        this.charmander = charmander;
        this.charmander.StatusPokemon();
        impresion.Charmander();

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 100, 0, 0, "espesura", "semilla", "planta", 6.9, 0.7, "pradera");
        this.bulbasaur = bulbasaur;
        this.bulbasaur.StatusPokemon();
        impresion.bulbasaur();
    }
    //Metodo encargado de mostrar en pantalla los pokemones disponibles, y guardar la opcion elegida
    public void SeleccionPokemon() {
        Scanner select = new Scanner(System.in);
        System.out.println("¿Que pokemon deseas utilizar en este momento?");
        System.out.println("1. Squirtle / 2. Pikachu / 3. Gastly / 4. Charmander / 5. Bulbasaur");
        seleccion = select.nextInt();
    }
    //Metodo encargado de seleccionar un pokemon, para despues dirigirse al menu de opciones
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
    //Metodo encargado de mostrar la imagen de cada pokemon, asi como el estado del pokemon y verificar la vida respecto al nivel
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
    
    //Metodo que da un numero entero
    public int seleccion(){
        return seleccion;
    }
    //Metodo encargado de dar un pokemon dependiendo de la seleccion
    Pokemon seleccionPokemon(){
        if (seleccion == 1){
            return squirtle;
        } else if (seleccion == 2){
            return pikachu;
        } else if (seleccion == 3){
            return gastly;
        } else if (seleccion == 4){
            return charmander;
        } else if (seleccion == 5){
            return bulbasaur;
        }
        return null;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    
}
