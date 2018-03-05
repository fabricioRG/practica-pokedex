
package ActividadesNegativas;
import java.util.Random;
import ActividadesNegativas.Actividad1;
import ActividadesNegativas.Actividad2;
import ActividadesNegativas.Actividad3;

/**
 *
 * @author fabricio
 */
public class ActividadNegativa {
    int actividadAleatoria;
    String nombre;
    
    public ActividadNegativa(String nombre){
        this.nombre = nombre;
    }

    public ActividadNegativa() {
    }
    public void ImprimirSeleccion(){
        System.out.println("La actividad seleccionada fue: " + nombre);
    }
    public void SeleccionRandom(){
        Random aleatorio = new Random();
        actividadAleatoria = 1 + aleatorio.nextInt(3);
        this.actividadAleatoria = actividadAleatoria;
    }
    public void SeleccionActividad(){
        if (actividadAleatoria == 1){
            Actividad1 actividad1 = new Actividad1("Ver Television");
            actividad1.ImprimirSeleccion();
        } else if (actividadAleatoria == 2){
            Actividad2 actividad2 = new Actividad2("Estudiar");
            actividad2.ImprimirSeleccion();
        } else {
            Actividad3 actividad3 = new Actividad3("Esconderse");
            actividad3.ImprimirSeleccion();
        }
    }
}
