
package ActividadesPositivas;
import java.util.Random;
import ActividadesPositivas.Actividad1;
//import ActividadesPositivas.Actividad2;
//import ActividadesPositivas.Actividad3;
/**
 *
 * @author fabricio
 */
public class ActividadPositiva  {
    int positivoRandom;
    Actividad1 actividad1 = new Actividad1();
    //Actividad2 actividad2 = new Actividad2();
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
            actividad1.Juego();
        } else if (positivoRandom == 2) {
            System.out.println("En proceso 2");
        } else {
            System.out.println("En proceso 3");
        }
    }
    
}
