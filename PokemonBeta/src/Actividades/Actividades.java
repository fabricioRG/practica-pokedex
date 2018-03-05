
package Actividades;
import java.util.Random;
import ActividadesNegativas.ActividadNegativa;
import ActividadesPositivas.ActividadPositiva;

public class Actividades {
    
    int seleccionRandom;
    ActividadPositiva actividad1 = new ActividadPositiva();
    ActividadNegativa actividad2 = new ActividadNegativa();
    
    public Actividades() {
    }
    
    public void SeleccionRandom(){
        Random random = new Random();
        seleccionRandom = 1 + random.nextInt(2);
        this.seleccionRandom = seleccionRandom;
    }
    public void SeleccionActividad(){
        SeleccionRandom();
        if (seleccionRandom == 1) {
            actividad1.SeleccionPositiva();
        } else {
            actividad2.SeleccionActividad();
        }
    }
    
}
