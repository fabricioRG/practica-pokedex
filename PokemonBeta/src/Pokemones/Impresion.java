
package Pokemones;

/**
 *
 * @author fabricio
 */
public class Impresion {

    String squirtle, pikachu, gastly, charmander, bulbasaur;
    public Impresion() {
    }
    public void Squirtle(String pokemon){
        this.squirtle = pokemon;
    }
    public void Pikachu(String pokemon){
        this.pikachu = pokemon;
    }
    public void Gastly(String pokemon){
        this.gastly = pokemon;
    }
    public void Charmander(String pokemon){
        this.charmander = pokemon;
    }
    public void Bulbasaur(String pokemon){
        this.bulbasaur = pokemon;
    }
    public void impresionSquirtle(){
        System.out.println(this.squirtle);
    }
    public void impresionPikachu(){
        System.out.println(this.pikachu);
    }
    public void impresionGastly(){
        System.out.println(this.gastly);
    }
    public void impresionCharmander(){
        System.out.println(this.charmander);
    }
    public void impresionBulbasaur(){
        System.out.println(this.bulbasaur);
    }
}
