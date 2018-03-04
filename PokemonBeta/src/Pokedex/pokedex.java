package Pokedex;

/**
 *
 * @author fabricio
 */

import Pokemones.PokemonAgua;
import java.util.Scanner;

public class pokedex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String NombreJugador;

        System.out.println("Ingrese su nombre como entrenador pokemon");
        NombreJugador = scanner.nextLine();
        System.out.println("\n");
        System.out.println("	888888b.   d8b                                              d8b      888          \n"
                + "	888  \"88b  Y8P                                              Y8P      888          \n"
                + "	888  .88P                                                            888          \n"
                + "	8888888K.  888  .d88b.  88888b.  888  888  .d88b.  88888b.  888  .d88888  .d88b.  \n"
                + "	888  \"Y88b 888 d8P  Y8b 888 \"88b 888  888 d8P  Y8b 888 \"88b 888 d88\" 888 d88\"\"88b \n"
                + "	888    888 888 88888888 888  888 Y88  88P 88888888 888  888 888 888  888 888  888 \n"
                + "	888   d88P 888 Y8b.     888  888  Y8bd8P  Y8b.     888  888 888 Y88b 888 Y88..88P \n"
                + "	8888888P\"  888  \"Y8888  888  888   Y88P    \"Y8888  888  888 888  \"Y88888  \"Y88P\" \n"
                + "	                                                 \n"
                + "\n"
                + "					8888b.  \n"
                + "					    \"88b \n"
                + "					.d888888 \n"
                + "					888  888 \n"
                + "					\"Y888888 				 \n"
                + "	\n"
                + "		                                .::.\n"
                + "		                              .;:**'               \n"
                + "		                              `                   \n"
                + "		  .:XHHHHk.              db.   .;;.     dH  MX    \n"
                + "		oMMMMMMMMMMM       ~MM  dMMP :MMMMMR   MMM  MR      ~MRMN\n"
                + "		QMMMMMb  \"MMX       MMMMMMP !MX' :M~   MMM MMM  .oo. XMMM 'MMM\n"
                + "		  `MMMM.  )M> :X!Hk. MMMM   XMM.o\"  .  MMMMMMM X?XMMM MMM>!MMP\n"
                + "		   'MMMb.dM! XM M'?M MMMMMX.`MMMMMMMM~ MM MMM XM `\" MX MMXXMM\n"
                + "		    ~MMMMM~ XMM. .XM XM`\"MMMb.~*?**~ .MMX M t MMbooMM XMMMMMP\n"
                + "		     ?MMM>  YMMMMMM! MM   `?MMRb.    `\"\"\"   !L\"MMMMM XM IMMM\n"
                + "		      MMMX   \"MMMM\"  MM       ~%:           !Mh.\"\"\" dMI IMMP\n"
                + "		      'MMM.                                             IMX\n"
                + "		       ~M!M");
        
        //String nombre, int HP, int nivel, String habilidad, String especie, String tipo, double peso, double altura, String habitat
        PokemonAgua Squirtle = new PokemonAgua("sldkfj", 1,2,"sjkdfh","kdjh","kjdgh", 1, 2, "sh");
        Squirtle.StatusPokemon();
    }

}
