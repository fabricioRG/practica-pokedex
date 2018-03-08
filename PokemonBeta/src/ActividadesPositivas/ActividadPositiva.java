
package ActividadesPositivas;
import java.util.Random;
import ActividadesPositivas.Actividad1;
import ActividadesPositivas.Actividad2;
import ActividadesPositivas.Actividad3;
//import Pokemones.Pokemon;

/**
 *
 * @author fabricio
 */
public class ActividadPositiva  {
    int positivoRandom;
//    Pokemon pokemon = new Pokemon();
    Actividad1 actividadUno = new Actividad1();
    Actividad2 actividadDos = new Actividad2();
    Actividad3 actividadTres = new Actividad3();
    
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
            actividadUno.Actividad();
        } else if (positivoRandom == 2) {
            actividadDos.Actividad();
        } else {
            actividadTres.Actividad();
        }
        //pokemon.GanarVida();
    }
    
}
