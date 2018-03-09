package Pokedex;

/**
 *
 * @author fabricio
 */
import Pokemones.Pokemon;
import Pokemones.Impresiones;
import java.util.Scanner;

public class pokedex {
    
    static boolean salir = true;
    static Pokemon miPokemon = new Pokemon();

    //Metodo principal que inicia las acciones del juego
    public static void main(String[] args) {
        Impresiones impresion = new Impresiones();
        Scanner scanner = new Scanner(System.in);
        String NombreJugador;

        //Nombre que utilizara el jugador durante toda la ejecucion del juego
        /*System.out.println("Ingrese su nombre como entrenador pokemon");
        NombreJugador = scanner.nextLine();*/
        //Impresion de Bienvenida al juego
        impresion.Bienvenida();

        //Inicia la seleccion del primer pokemon a utilizar
        miPokemon.InicioPokemon();
        
        //Funcion encargada de llamar metodos de otra clase y terminar el proceso cuando "salir" sea falso
        while (salir ) {
            miPokemon.SeleccionPokemon();
            miPokemon.PokemonElegido();
        }
    }
    //Metodo encargado de 
    public void MenuPrincipal() {
        
        int selection;
        boolean cambiar = true;
        Scanner select = new Scanner(System.in);
        while (salir && cambiar) {
            miPokemon.ImprimirPokemon();
            System.out.println("Menu principal: Selecciona la opcion que deseas realizar");
            System.out.println("1. Alimentacion\n"
                    + "2. Actividades\n"
                    + "3. Batalla\n"
                    + "4. Reportes\n"
                    + "5. Seleccionar otro Pokemon\n"
                    + "6. Salir");
            selection = select.nextInt();
            switch (selection) {
                case 1:
                    miPokemon.SeleccionComida();
                    break;
                case 2:
                    miPokemon.SeleccionActividad();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    cambiar = false;
                    break;
                case 6:
                    salir = false;
                    break;
            }
        }
    }
    
}
