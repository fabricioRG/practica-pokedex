
package ActividadesPositivas;
import java.util.Random;
import ActividadesPositivas.Actividad1;
import ActividadesPositivas.Actividad2;
//import Pokemones.Pokemon;
//import ActividadesPositivas.Actividad3;
/**
 *
 * @author fabricio
 */
public class ActividadPositiva  {
    int positivoRandom;
//    Pokemon pokemon = new Pokemon();
    Actividad1 actividadUno = new Actividad1();
    Actividad2 actividadDos = new Actividad2();
    //Actividad3 actividad3 = new Actividad3();
    
    public ActividadPositiva() {
    }
    public void SeleccionRandom(){
        Random aleatorio = new Random();
        positivoRandom = 1+ aleatorio.nextInt(3);
        this.positivoRandom =  positivoRandom;
    }
    public void SeleccionPositiva(){
        SeleccionRandom();
        if (positivoRandom == 1) {
            actividadUno.Juego();
        } else if (positivoRandom == 2) {
            actividadDos.Juego();
        } else {
            System.out.println("En proceso 3");
        }
        //pokemon.GanarVida();
    }
    
}
