package Pokedex;

/**
 *
 * @author fabricio
 */

import Alimentacion.Alimentacion;
import Pokemones.ImpresionBienvenida;
import Pokemones.Pokemon;
import Actividades.Actividades;
import java.util.Scanner;

public class pokedex {

    //Metodo principal que inicia las acciones del juego
    public static void main(String[] args) {
        Pokemon miPokemon = new Pokemon();
        Alimentacion comida = new Alimentacion();
        Actividades actividad = new Actividades();
        ImpresionBienvenida bienvenida = new ImpresionBienvenida();
        Scanner scanner = new Scanner(System.in);
        String NombreJugador;

        //Nombre que utilizara el jugador durante toda la ejecucion del juego
        
        /*System.out.println("Ingrese su nombre como entrenador pokemon");
        NombreJugador = scanner.nextLine();*/
        
        //Impresion de Bienvenida al juego
        bienvenida.ImpresionDeBienvenida();
        
        //Inicia la seleccion del primer pokemon a utilizar
        miPokemon.InicioPokemon();
        
        comida.DarComida();
        
        actividad.SeleccionActividad();
        
        
        
    }

}
