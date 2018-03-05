
package Pokemones;
/**
 * PokemonAgua
 * @author fabricio - 28.02.2018 
 * @Title: PokemonAgua
 * @Description: description
 *
 * Changes History
 */

import Pokemones.Pokemon;

public class PokemonAgua extends Pokemon {

    public PokemonAgua(String nombre, int HP, int nivel, String habilidad, String especie, String tipo, double peso, double altura, String habitat) {
        super(nombre, HP, nivel, habilidad, especie, tipo, peso, altura, habitat);   
    }
    public PokemonAgua() {
    }
    
    public void ImagenAgua () {
        System.out.println("               _,........__\n" +
"            ,-'            \"`-.\n" +
"          ,'                   `-.\n" +
"        ,'                        \\\n" +
"      ,'                           .\n" +
"      .'\\               ,\"\".       `\n" +
"     ._.'|             / |  `       \\\n" +
"     |   |            `-.'  ||       `.\n" +
"     |   |            '-._,'||       | \\\n" +
"     .`.,'             `..,'.'       , |`-.\n" +
"     l                       .'`.  _/  |   `.\n" +
"     `-.._'-   ,          _ _'   -\" \\  .     `\n" +
"`.\"\"\"\"\"'-.`-...,---------','         `. `....__.\n" +
".'        `\"-..___      __,'\\          \\  \\     \\\n" +
"\\_ .          |   `\"\"\"\"'    `.           . \\     \\\n" +
"  `.          |              `.          |  .     L\n" +
"    `.        |`--...________.'.        j   |     |\n" +
"      `._    .'      |          `.     .|   ,     |\n" +
"         `--,\\       .            `7\"\"' |  ,      |\n" +
"            ` `      `            /     |  |      |    _,-'\"\"\"`-.\n" +
"             \\ `.     .          /      |  '      |  ,'          `.\n" +
"              \\  v.__  .        '       .   \\    /| /              \\\n" +
"               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |\n" +
"                `        .        `._ ___,j.  `/ .-       ,---.     |\n" +
"                ,`-.      \\         .\"     `.  |/        j     `    |\n" +
"               /    `.     \\       /         \\ /         |     /    j\n" +
"              |       `-.   7-.._ .          |\"          '         /\n" +
"              |          `./_    `|          |            .     _,'\n" +
"              `.           / `----|          |-............`---'\n" +
"                \\          \\      |          |\n" +
"               ,'           )     `.         |\n" +
"                7____,,..--'      /          |\n" +
"                                  `---.__,--.'");
    }
    
    
}
